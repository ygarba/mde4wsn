/*
 * This class is responsible for fitness. It reads trace file, process trace information
 * churn the fitness from some clever bla bla....
 */
package edu.yau.thesis.ga;

import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.jgap.*;

import edu.yau.thesis.Constants;
import edu.yau.thesis.CoojaSimulationInitiator;
import edu.yau.thesis.IObservable;
import edu.yau.thesis.IObserver;
import edu.yau.thesis.MemoryUsage;
import edu.yau.thesis.OsCheck;


public class OptFitnessFunction
    extends FitnessFunction implements IObservable {
  /** String containing the CVS revision. Read out via reflection!*/
  private final static String CVS_REVISION = "$Revision: 1.18 $";

  List<IObserver> observers = new ArrayList<IObserver>();		//observer pattern here
  double fitnessVal;
  double vScale;
  //int memoryUsed;
  
//ToDo: check out this static business :)
  static double percent_packet_loss;
  static double memoryUsed;
  static double avg_power_total_net_cpu;
  static double avg_power_total_net_lpm;
  static double avg_power_total_net_transmit;
  static double avg_power_total_net_listen;
  static double avg_power_total_net_idle_listen;
  
  static String execCmd = "";
  static String appPath; 
  static String m2tPath;
  PrintStream fitnessConfStream;
  
  public OptFitnessFunction()
  {	
	  appPath = System.getenv("WSN_HOME"); 
	  m2tPath = appPath + "/contiki-2.7/phd/m2t";
	  m2tPath = m2tPath.replace("\\", "/");
	  
	  try {
			//fitnessConfStream = new PrintStream(new File( m2tPath + "/fitness-conf-dump.txt"));
		  	fitnessConfStream = new PrintStream(new File("wsn-conf-dump.log"));
			fitnessConfStream.println("This dump contains the configuration for all fitness");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  
  /**
   * This method returns the fitness value. Here small is better, so do some bla bla ...
   */
  public double evaluate(IChromosome a_subject) {
	  
	  //double thisChromosomeFitness = 0;
	  WriteConf2File.Write2File(a_subject);
	  
	  //Here get the allele value for voltage scaling, then use it to set the sensor operating voltage
	  int freq_scale_index = (Integer) a_subject.getGene(4).getAllele();
	  
	  switch(freq_scale_index) {
	  	case 0:
	  		vScale = 1.8;
	  		break;
	  	case 1:
	  		vScale = 2.4;
	  		break;
	  	case 2:
	  		vScale = 3.0;
	  		break;
	  	case 3:
	  		vScale = 3.6;
	  		break;
		default: 
			vScale = 3.6;
	  }
	  
	  //call simulation
	  System.out.println("Running cooja simulator. Please wait .....");
	  CoojaSimulationInitiator simInitiator = new CoojaSimulationInitiator();
	  simInitiator.DoSimulation();
	  System.out.println("Simulation done .....");
	  
	  //call trace reader
	  try {
		if (ReadSimulationTrace()) {	//means trace file has been found
			  fitnessVal = TraceProcessor();
		  }
		  else {
			  fitnessVal = 0;
		  }
	  } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  
	  //Get memory usage
	  MemoryUsage memUsage = new MemoryUsage();
	  memoryUsed = memUsage.GetMemory();
	  
	  /*
       * Dump current fitness and project.h configuration to file
       */
      fitnessConfStream.println("---- For fitness = " + fitnessVal + " ----");
      fitnessConfStream.println("Packet loss = " + percent_packet_loss + "%");
      fitnessConfStream.println("Node operating voltage = " + vScale);
      fitnessConfStream.println("Memory usage = " + memoryUsed);
      //fitnessConfStream.println("CPU power ratio = " + (avg_power_total_net_cpu/avg_power_total_net_lpm));
      //fitnessConfStream.println("CPU power difference = " + (avg_power_total_net_cpu - avg_power_total_net_lpm));
      fitnessConfStream.println("Average CPU power = " + avg_power_total_net_cpu);
      //fitnessConfStream.println("Average low power mode = " + avg_power_total_net_lpm);
      fitnessConfStream.println("Average comm power = " + (avg_power_total_net_transmit + avg_power_total_net_listen + avg_power_total_net_idle_listen));
      fitnessConfStream.println("Total average power = " + (avg_power_total_net_cpu + avg_power_total_net_transmit + avg_power_total_net_listen + avg_power_total_net_idle_listen));
      fitnessConfStream.println("The equivalent configuration is:");
      fitnessConfStream.println(Constants.getFitnessConf());	//this string was written earlier for this fitness value
      fitnessConfStream.println("");
		  
	  //for test only - do random fitness
	  //thisChromosomeFitness = GetRandomFitness();
	  //System.out.println("Fitness = " + thisChromosomeFitness);
	  System.out.println("Fitness = " + fitnessVal);
	  
	  /*
	   * update observers here
	   * //the x parameter is set to 1. It will be incremented in the observer
	   * The same values in chart will be dumped to the log files
	   * Do any scaling here (eg. bytes to KB)
	   */
	  notifyFitness(1, fitnessVal); 
      notifyPacketLoss(1, percent_packet_loss);
	  notifyPower(1, ((avg_power_total_net_cpu + avg_power_total_net_transmit + avg_power_total_net_listen + avg_power_total_net_idle_listen)/1000000));
      notifyMemory(1, memoryUsed/1024);
	 
	  return fitnessVal;
  }
  
  
  //this method is just for test. remove later
  private double GetRandomFitness() {
	  
	  double ret;
	  Random r = new Random(); 
	  ret = r.nextInt(50);
          try {
              Thread.sleep(100);
          } catch (InterruptedException ex) {
              System.out.println(ex);
          }
          
          return ret;
  }
  
  
  /*
   * This method calculates the fitness value
   */
  private double TraceProcessor() {
	  
	  double ret = 0;
	  int weight_power, weight_pcktloss;	//get both from objective xml file
	  
	  weight_power = 1;
	  weight_pcktloss = 1;
	  /*
	   * Packet could be zero and that will lead to fitness = infinity.
	   * Work around is to make packet loss = 0.1% when packet loss is zero
	   */
	  if (percent_packet_loss == 0){
		  percent_packet_loss = 0.1;
	  }
	  
	  //fitness is the ratio of the low power activity over the packetloss and power consumption
	  //by other components. The formular is adusted based on experiments
/*	  ret = (100 * avg_power_total_net_lpm)/(weight_pcktloss*percent_packet_loss*(weight_power*(avg_power_total_net_cpu +
			  avg_power_total_net_transmit + avg_power_total_net_listen + avg_power_total_net_idle_listen)));
*/
	  
	  //Good ret = (vScale*(avg_power_total_net_cpu + avg_power_total_net_transmit + avg_power_total_net_listen + avg_power_total_net_idle_listen))/(32768*10);
	  int weightPower = 2;			
	  int weightPacketLoss = 4;	
	  int weightMemoryUsage = 1;
	  
	  double totalPower = ((avg_power_total_net_cpu + avg_power_total_net_transmit + avg_power_total_net_listen + avg_power_total_net_idle_listen));
	  totalPower = 100* totalPower/8904930;
	  double packetLoss = percent_packet_loss;
	  double memoryUsage = 100* memoryUsed/77980;
	  
	  ret = weightPower * vScale * totalPower + weightPacketLoss * packetLoss + weightMemoryUsage * memoryUsage;
	  return (double)(1/ret);
  }
  
  public static boolean ReadSimulationTrace() throws Exception {		//ToDo: maybe specify path here
	  
	  //boolean retVal = false;
	  
	  String tracePath = m2tPath + "/COOJA.testlog";
	  List<String> simTrace = new ArrayList<String>();
	  
	  /**
	   * Check for the trace file first. If the file doesn't exist, then probably an invalid chromosome 
	   * that led to compilaton error, hence no simulation done. In that case, return a flag, and 
	   * the fitness value should be zero
	   */
	  //check if file exist else return false
	  File simTraceLog = new File(m2tPath + "/COOJA.testlog");
	  if(simTraceLog.exists()){
		  System.out.println("COOJA.testlog found ....");
	  }else{
		  System.out.println("COOJA.testlog NOT found ....");
		  return false;
	  }
	  
	  try {
		  
		    String token = "";
		    
		    Scanner traceScanner = new Scanner(new File(tracePath)).useDelimiter("\r\n|[\n\r\u2028\u2029\u0085]");	//all these for newline :( //.useDelimiter(",\\s*");
		    //total pckts lost collected here
		    /*
		    while (traceScanner.hasNext()) {
		      token = traceScanner.next();
		      simTrace.add(token);
		    }*/
		    while (traceScanner.hasNext()) {
			      token = traceScanner.next();
			      simTrace.add(token);
			}
		    traceScanner.close();

	  }
	  catch (IOException ex) {
		  System.out.println("Trace file read error :" + ex.toString());
	  }
	  
	  /*
	  for(Iterator<String> i = simTrace.iterator(); i.hasNext(); ) {		 
			  String item = i.next();
			  System.out.println(item);
	  }
	  */
	  
	  List<String> powerEstimate = new ArrayList<String>();
	  List<String> pcktsSent = new ArrayList<String>();
	  List<String> pcktsReceived = new ArrayList<String>();
	  
	  String x = null;
	  for (int i =0; i < simTrace.size(); i++){
		  x = simTrace.get(i);
		//match if the string contains exactly "pckts_received"
		  if (x.matches(".*pckts_received.*")) {
			  pcktsReceived.add(x);
		 }
		
		//match if the string contains exactly "pckts_transmitted"
		if (x.matches(".*pckts_transmitted.*")) {
			  pcktsSent.add(x);
		}

		//match
		if (x.matches(".*power_estimate.*")) {
			powerEstimate.add(x);
		}
		
	  }
	  
	  int numPacketsSentPerSender = 5;	//was 10
	  System.out.println("numPacketsSentPerSender ....." + numPacketsSentPerSender);
	  //received pckts
	  String [] recpckts = pcktsReceived.get(0).split(":");	//this is just one line (example '172238665:1:pckts_received:63')
	  /*
	   * According to the example, the index for the received pckt (eg. 63 here should be '3')
	   */
	  //percent_packet_loss = 100*(((double)(50*pcktsSent.size() - Integer.parseInt(recpckts[1])))/((double)50*pcktsSent.size()));
	  percent_packet_loss = 100*(((double)(numPacketsSentPerSender*pcktsSent.size() - Integer.parseInt(recpckts[3])))/((double)numPacketsSentPerSender*pcktsSent.size()));
	  
	  //sent pckts
	  int total_pcktsSentByAllNodes = numPacketsSentPerSender*pcktsSent.size();
	  //for debug only. Why the infinity stuff...
	  class YauException extends Exception {
		   YauException(String s) {
		      super(s);
		   }
		}
	  
	  if (total_pcktsSentByAllNodes < 1) {
		  try {
			throw new YauException("This infinity stuff again :( ........");
		} catch (YauException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Yau exception " + e.getMessage());
			//throw e;
			System.exit(1);
		}
	  }
	  //for debug ends
	  
	  System.out.println("Total packets sent by all nodes = " + numPacketsSentPerSender*pcktsSent.size());
	  System.out.println("Total pckts received = " + recpckts[3]);
	  System.out.println("Packet loss = " + ((numPacketsSentPerSender*pcktsSent.size()) - Integer.parseInt(recpckts[3])));
	  
	  /*
	  for (int i = 0; i < powerEstimate.size(); i++) {
		  System.out.println(powerEstimate.get(i));
	  }
	  */
	  
	  //Get avg cpu
	  int cpu = 0;
	  int lpm = 0;
	  int transmit = 0;
	  int listen = 0;
	  int idleListen = 0;
	  
	  for (int i = 0; i < powerEstimate.size(); i++) {
		 String [] data1 = powerEstimate.get(i).split(":");
		 //System.out.println(data1[1]);	//line with numbers sep by , only
		 String [] data2 = data1[3].split(",");
		 //System.out.println(data2[0]); //cpu
		 cpu = cpu + Integer.parseInt(data2[0]);
		 
		 //System.out.println(data2[1]); //lpm
		 lpm = lpm + Integer.parseInt(data2[1]);
		 
		 //System.out.println(data2[2]); //transmit
		 transmit = transmit + Integer.parseInt(data2[2]);
		 
		 //System.out.println(data2[3]); //listen
		 listen = listen + Integer.parseInt(data2[3]);
		 
		 //data2[4] not included
		 
		 //System.out.println(data2[5]); //idle listen
		 idleListen = idleListen + Integer.parseInt(data2[5]);
	  }
	  
	  //plug in the values
	  //percent_packet_loss = ;
	  avg_power_total_net_cpu = cpu;
	  avg_power_total_net_lpm = lpm;
	  avg_power_total_net_transmit = transmit;
	  avg_power_total_net_listen = listen;
	  avg_power_total_net_idle_listen = idleListen;
	 
	  /*
	  System.out.println("--------------------------------------------");
	  System.out.println("Packet loss = " + percent_packet_loss + " %");
	  System.out.println("Total cpu = " + cpu);
	  System.out.println("Total lpm = " + lpm);
	  System.out.println("Total transmit = " + transmit);
	  System.out.println("Total listen = " + listen);
	  System.out.println("Total listen = " + idleListen);
	  System.out.println("--------------------------------------------");
	  */
	  
	  System.out.println("--------------------------------------------");
	  System.out.println("Packet loss = " + percent_packet_loss + " %");
	  System.out.println("Memory Usage = " + memoryUsed);
	  System.out.println("Total cpu = " + avg_power_total_net_cpu);
	  System.out.println("Total transmit = " + avg_power_total_net_transmit);
	  System.out.println("Total listen = " + avg_power_total_net_listen);
	  System.out.println("Total idle listen = " + avg_power_total_net_idle_listen);
	  System.out.println("--------------------------------------------");
	  
	  //System.out.println("Done...");
	  
	  return true;
  }
  
  public void registerObserver(IObserver observer)
  {
  	observers.add(observer);
  }
  	
    public void removeObserver(IObserver observer)
    {
    	//observers.re
    }
    
    
    public void notifyFitness(double x, double y)
    {
    	for (IObserver o : observers)
    	{
    		o.updateFitness(x, y);
    	}
    }
    public void notifyPacketLoss(double x, double y)
    {
    	for (IObserver o : observers)
    	{
    		o.updatePacketLoss(x, y);
    	}
    }
    public void notifyPower(double x, double y)
    {
    	for (IObserver o : observers)
    	{
    		o.updatePower(x, y);
    	}
    }
    public void notifyMemory(double x, double y)
    {
    	for (IObserver o : observers)
    	{
    		o.updateMemory(x, y);
    	}
    }
    
    @Override
    protected void finalize() {	//close this file when disposing this object during GC
    
    	fitnessConfStream.close();
    }

}//class ends
