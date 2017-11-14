package edu.yau.thesis.scratch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class List2File {
	
	
	public static void main(String[] args)
	{
		List<String> NET = new ArrayList<String>();
		List<String> MAC = new ArrayList<String>();
		List<String> RDC = new ArrayList<String>();
		List<String> SLEEP = new ArrayList<String>();
		
		
		NET.add(0, "#define NETSTACK_CONF_NETWORK	rime_driver");
		NET.add(1, "#define NETSTACK_CONF_NETWORK  sicslowpan_driver");
		
		MAC.add(0, "#define NETSTACK_CONF_MAC	nullmac_driver");
		MAC.add(1, "#define NETSTACK_CONF_MAC	csma_driver");
		
		RDC.add(0, "#define NETSTACK_CONF_RDC	nullrdc_driver");
		RDC.add(1, "#define NETSTACK_CONF_RDC	contikimac_driver");
		
		SLEEP.add(0, "#define SLEEP_CONF	null_sleep");
		SLEEP.add(1, "#define SLEEP_CONF	lpm_sleep");
		
		//System.out.println(NET.get(0));
		
			PrintStream fileStream;
			try {
				fileStream = new PrintStream(new File("project-conf-y.c"));
				fileStream.println(NET.get(0));
				fileStream.println(MAC.get(0));
				fileStream.println(RDC.get(0));
				fileStream.println(SLEEP.get(1));
				fileStream.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			

		
		
	}

}
