package edu.yau.thesis;

import static edu.yau.thesis.Constants.*;

import org.apache.commons.exec.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CoojaSimulationInitiator /*extends Thread*/ {
	
	int exitVal;
	
	//public void run(){
	public int DoSimulation() {
		
		String execCmd = "";
		final String appPath = System.getenv("WSN_HOME"); 
		final String cygwinPath = System.getenv("CYGWIN32_HOME");
		String m2tPath = appPath + "/contiki-2.7/phd/m2t";
		m2tPath = m2tPath.replace("\\", "/");
				
		CommandLine cmdLine = null;
		OsCheck.OSType ostype=OsCheck.getOperatingSystemType();
		if (ostype == OsCheck.OSType.Windows) {					
			// build the commandline
			cmdLine = new CommandLine(cygwinPath + "\\bin\\bash");
			cmdLine.addArgument("--login");
			cmdLine.addArgument("-i");
			cmdLine.addArgument("-c");
			cmdLine.addArgument(m2tPath + "/simRun_nogui_win.sh");
		} else if (ostype == OsCheck.OSType.Linux) {		
			//execCmd = "bash " + m2tPath + "/simRun_nogui_linux.sh";
			cmdLine = new CommandLine("/bin/bash");
			cmdLine.addArgument(m2tPath + "/simRun_nogui_linux.sh");
		}
		
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		
		// create the executor and consider the exitValue '0' as success. Actually that's the default
		final Executor executor = new DefaultExecutor();
		executor.setExitValue(0);	//zero is actually the default. Ideally this line can be eliminated
		
		// takes output, input and error stream. It creates different thread for each stream. In this case, dump to std output (System.out...)
		PumpStreamHandler streamHandler = new PumpStreamHandler();
		executor.setStreamHandler(streamHandler);
		
		try {
			executor.execute(cmdLine,resultHandler);	//execute command asynchronously
		} catch (ExecuteException e) {
			System.out.println("Yau: exec exception occurred..");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Yau: io exception occurred..");
			e.printStackTrace();
		}
		
		try {
			resultHandler.waitFor();
		} catch (InterruptedException e) {
			System.out.println("Yau: interrupted exception occurred..");
			e.printStackTrace();
		}
		
		//get exit value of the command.
		int exitValue = resultHandler.getExitValue();
		
		System.out.println("Process exit value for cooja simulation -> " + exitValue);	//ToDo: line to be commented
		
		return exitValue;
	    }
}
