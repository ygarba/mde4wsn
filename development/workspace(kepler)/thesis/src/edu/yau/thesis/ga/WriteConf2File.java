package edu.yau.thesis.ga;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.jgap.*;
import org.jgap.impl.*;

import edu.yau.thesis.Constants;

public class WriteConf2File {
	
	static String execCmd = "";
	static String appPath; 
	static String m2tPath;
  
	/*
	public WriteConf2File()
	{	
	  appPath = System.getenv("WSN_HOME"); 
	  m2tPath = appPath + "/contiki-2.7/phd/m2t";
	  m2tPath = m2tPath.replace("\\", "/");
	}
	*/
	
	public static void Write2File(IChromosome chromosome) {
		
		appPath = System.getenv("WSN_HOME"); 
		m2tPath = appPath + "/contiki-2.7/phd/m2t";
		m2tPath = m2tPath.replace("\\", "/");
		
		//Now no makefile is required as only rime is used
		/*
		final String MAKEFILE_RIME = "CONTIKI_PROJECT = wsn\n"
				+ "APPS+=powertrace\n"
				+ "all: $(CONTIKI_PROJECT)\n"
				+ "CONTIKI = ../..\n"
				+ "CFLAGS += -DPROJECT_CONF_H=\\\"project-conf.h\\\"\n"
				+ "include $(CONTIKI)/Makefile.include";
		
		final String MAKEFILE_SICSLOWPAN = "CONTIKI_PROJECT = metrics\n"
				+ "APPS+=powertrace\n"
				+ "all: $(CONTIKI_PROJECT)\n"
				+ "CONTIKI = ../..\n"
				+ "WITH_UIP6=1\n"
				+ "UIP_CONF_IPV6=1\n"
				+ "CFLAGS+= -DUIP_CONF_IPV6_RPL\n"
				+ "CFLAGS += -DPROJECT_CONF_H=\\\"project-conf.h\\\"\n"
				+ "include $(CONTIKI)/Makefile.include";
		*/
		
		List<String> NET = new ArrayList<String>();
		List<String> MAC = new ArrayList<String>();
		List<String> RDC = new ArrayList<String>();
		List<String> SLEEP = new ArrayList<String>();
		
		
		try {
		/*
		 * This are gene translators. From the alleles of the genes of a particular chromosome
		 * (aka solution), the project-conf.h file is written
		 */
		NET.add(0, "#define NETSTACK_CONF_NETWORK	rime_driver");
		NET.add(1, "#define NETSTACK_CONF_NETWORK  	rime_driver");
		//NET.add(1, "#define NETSTACK_CONF_NETWORK  	sicslowpan_driver");
		
		MAC.add(0, "#define NETSTACK_CONF_MAC	nullmac_driver");
		MAC.add(1, "#define NETSTACK_CONF_MAC	csma_driver");
		/*MAC.add(2, "#define NETSTACK_CONF_MAC	tdma_mac_driver");*/	MAC.add(2, "#define NETSTACK_CONF_MAC	nullmac_driver");	
		/*MAC.add(3, "#define NETSTACK_CONF_MAC	ctdma_mac_driver");*/	MAC.add(3, "#define NETSTACK_CONF_MAC	csma_driver");		
		
		RDC.add(0, "#define NETSTACK_CONF_RDC	nullrdc_driver");
		RDC.add(1, "#define NETSTACK_CONF_RDC	contikimac_driver\n"
				+ "#define NETSTACK_RDC_CHANNEL_CHECK_RATE  8");
		RDC.add(2, "#define NETSTACK_CONF_RDC	contikimac_driver\n"
				+ "#define NETSTACK_RDC_CHANNEL_CHECK_RATE  16");
		RDC.add(3, "#define NETSTACK_CONF_RDC	contikimac_driver\n"
				+ "#define NETSTACK_RDC_CHANNEL_CHECK_RATE  32");
		RDC.add(4, "#define NETSTACK_CONF_RDC	contikimac_driver\n"
				+ "#define NETSTACK_RDC_CHANNEL_CHECK_RATE  64");
		RDC.add(5, "#define NETSTACK_CONF_RDC	contikimac_driver\n"
				+ "#define NETSTACK_RDC_CHANNEL_CHECK_RATE  128");
		
		//RDC.add(6, "#define NETSTACK_CONF_RDC	sicslowmac_driver");
		RDC.add(6, "#define NETSTACK_CONF_RDC	xmac_driver");
		RDC.add(7, "#define NETSTACK_CONF_RDC	cxmac_driver");
		RDC.add(8, "#define NETSTACK_CONF_RDC	lpp_driver");		//RDC.add(5, "#define NETSTACK_CONF_RDC	nullrdc_driver");	
		
		SLEEP.add(0, "#define SLEEP_CONF		0");	//active
		SLEEP.add(1, "#define SLEEP_CONF		1");	//lpm3
		
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Yau: Array exception occurred!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Yau: some exception occurred!");
		}
		
				
		PrintStream confFileStream;
		try {
							
				confFileStream = new PrintStream(new File( m2tPath + "/project-conf.h"));
								
				confFileStream.println(NET.get((Integer) chromosome.getGene(0).getAllele()));	//NET Gene
				confFileStream.println(MAC.get((Integer) chromosome.getGene(1).getAllele()));	//MAC Gene
				confFileStream.println(RDC.get((Integer) chromosome.getGene(2).getAllele()));	//RDC Gene
				confFileStream.println(SLEEP.get((Integer) chromosome.getGene(3).getAllele()));	//SLEEP Gene
				
				/*
				 * Keep this configuration to be used for dumping conf for specific fitness val.
				 * It will be used by the OptFitnessFunction class
				 */
				Constants.setFitnessConf(NET.get((Integer) chromosome.getGene(0).getAllele()) + "\n"
						+ MAC.get((Integer) chromosome.getGene(1).getAllele()) + "\n"
								+ RDC.get((Integer) chromosome.getGene(2).getAllele()) + "\n"
										+ SLEEP.get((Integer) chromosome.getGene(3).getAllele()));
				
				//for display only
				System.out.println("-----------------------------------------------------");
				System.out.println(NET.get((Integer) chromosome.getGene(0).getAllele()));	//NET Gene
				System.out.println(MAC.get((Integer) chromosome.getGene(1).getAllele()));	//MAC Gene
				System.out.println(RDC.get((Integer) chromosome.getGene(2).getAllele()));	//RDC Gene
				System.out.println(SLEEP.get((Integer) chromosome.getGene(3).getAllele()));	//SLEEP Gene
				System.out.println("-----------------------------------------------------");
				
				confFileStream.close();
															
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}							
	}//Write2File(IChromosome chromosome)

}
