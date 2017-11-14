package edu.yau.thesis;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.Executor;
import org.apache.commons.exec.PumpStreamHandler;

public class StartEditor extends Thread {
	
	public void run(){
		
		String execCmd = "";
		final String appPath = System.getenv("WSN_HOME"); 
				
		/*
		OsCheck.OSType ostype=OsCheck.getOperatingSystemType();
		if (ostype == OsCheck.OSType.Windows) {					
			execCmd = appPath + "/poseidon/bin/poseidon.bat";		
		} else if (ostype == OsCheck.OSType.Linux) {		
			execCmd = appPath + "/poseidon/bin/poseidon.sh";
		}
		*/	
		CommandLine cmdLine = null;
		OsCheck.OSType ostype=OsCheck.getOperatingSystemType();
		if (ostype == OsCheck.OSType.Windows) {					
			// build the commandline
			cmdLine = new CommandLine(appPath + "/poseidon/bin/poseidon.bat");
		} else if (ostype == OsCheck.OSType.Linux) {		
			// build the commandline
			cmdLine = new CommandLine("/bin/bash");
			cmdLine.addArgument(appPath + "/poseidon/bin/poseidon.sh");
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
	}
}
