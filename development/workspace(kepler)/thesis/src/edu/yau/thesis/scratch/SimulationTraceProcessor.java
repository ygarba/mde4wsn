package edu.yau.thesis.scratch;

import java.io.File;
import java.sql.Timestamp;
import java.util.Date;

public class SimulationTraceProcessor {
	
	public static void ProcessTrace(){
		
		File from = null;
	    File to = null;
	    boolean bool = false;
	      
	    try{      
	    	// create new File objects
	    	from = new File("c:/cygwin32/home/yau/contiki-2.7/phd/metrics/COOJA.testlog");
         
	    	Timestamp tmstamp = new Timestamp(System.currentTimeMillis());
	    	to = new File("c:/cygwin32/home/yau/contiki-2.7/phd/metrics/COOJA.testlog." + tmstamp.getTime());
	    	bool = from.renameTo(to);	    
	    	System.out.print("File renamed? " + bool);
         
      }catch(Exception e){
         System.out.println("File renaming error: " + e.toString());
    	 e.printStackTrace();
      }
	}
	

}
