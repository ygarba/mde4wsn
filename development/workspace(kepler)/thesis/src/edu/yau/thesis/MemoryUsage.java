package edu.yau.thesis;

import static edu.yau.thesis.Constants.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MemoryUsage /*extends Thread*/ {
	
	int memUsed;
	
	//public void run(){
	public int GetMemory() {
		
		String execCmd = "";
		final String appPath = System.getenv("WSN_HOME"); 
		final String cygwinPath = System.getenv("CYGWIN32_HOME");
		String m2tPath = appPath + "/contiki-2.7/phd/m2t";
		m2tPath = m2tPath.replace("\\", "/");
		
		
		Runtime runtime = Runtime.getRuntime();
		execCmd = "c:\\cygwin32\\bin\\bash.exe --login -c " + m2tPath + "/get_memory_win.sh";  
		Process proc = null;
		try {
			proc = runtime.exec(execCmd);
		} catch (IOException e) {
			System.out.println("Yau: memory usage exec exception occurred..");
			e.printStackTrace();
		}

		BufferedReader stdInput = new BufferedReader(new 
		     InputStreamReader(proc.getInputStream()));
				
		// read command output
		String line = null;
		String cmdOut = "";
		try {
			while ((line = stdInput.readLine()) != null) {
				if (line.matches("[0-9]+")){
					cmdOut = line;
				}
			}
		} catch (IOException e) {
			System.out.println("Yau: memory usage read output exception occurred..");
			e.printStackTrace();
		}
		
		// convert string to int
		try {
			memUsed = Integer.parseInt(cmdOut);
		} catch (NumberFormatException e) {
			System.out.println("Yau: memory usage -> number conversiont exception occurred..");
			e.printStackTrace();
		}
		
		
		System.out.println("Memory Usage: -> " + memUsed);	//ToDo: line to be commented
		
		return memUsed;
	}
}
