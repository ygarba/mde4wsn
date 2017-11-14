package edu.yau.thesis.scratch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.exec.*;

public class ApacheExecTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String execCmd = "";
		final String appPath = System.getenv("WSN_HOME"); 
		final String cygwinPath = System.getenv("CYGWIN32_HOME");
		String m2tPath = appPath + "/contiki-2.7/phd/m2t";
		m2tPath = m2tPath.replace("\\", "/");
						
		// build the commandline
		CommandLine cmdLine = new CommandLine(cygwinPath + "\\bin\\bash");
		cmdLine.addArgument("--login");
		cmdLine.addArgument("-i");
		cmdLine.addArgument("-c");
		cmdLine.addArgument(m2tPath + "/simTest_win.sh");
		
		
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		
		// create the executor and consider the exitValue '0' as success. Actually that's the default
		final Executor executor = new DefaultExecutor();
		executor.setExitValue(0);	//zero is actually the default. Ideally this line can be eliminated
		
		// takes output, input and error stream. It creates different thread for each stream. In this case, dump to std output (System.out...)
		PumpStreamHandler streamHandler = new PumpStreamHandler();
		executor.setStreamHandler(streamHandler);
		
		System.out.println("Begin exec...");
		
		try {
			executor.execute(cmdLine,resultHandler);	//execute command asynchronously and send output to stdio
		} catch (ExecuteException e) {
			System.out.println("Yau: exec exception occurred..");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Yau: io exception occurred..");
			e.printStackTrace();
		}
		
		System.out.println("pls wait ....");
		//Wait for the command to finish execution.
		
		try {
			resultHandler.waitFor();
		} catch (InterruptedException e) {
			System.out.println("Yau: interrupted exception occurred..");
			e.printStackTrace();
		}
		
		//get exit value of the command.
		int exitValue = resultHandler.getExitValue();

		System.out.println("Done....");
		//Use of resultHandler makes this a Asynch process
		
		//testing if the exitValue indicates failure
		if(executor.isFailure(exitValue)){
		 
			System.out.println("Command execution failed");
		}else{
		 
		System.out.println("Command execution Successful");
		 
		}


	}

}
