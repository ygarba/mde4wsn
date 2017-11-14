package com.yau.phd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OpaqueActions {

	private String GetPath()
	{
		String path = "";
		path = System.getenv("WSN_HOME") + "/poseidon/opaque/";
		System.out.println("Opaque path: " + path);
		
		return path;
	}
	
	public String getOpaqueC(String src){
		
		String srcCode = "";
		
		try {
				//FileReader fr = new FileReader(src);
				FileReader fr = new FileReader(GetPath() + src);
				BufferedReader txtReader = new BufferedReader(fr);
				
				System.out.println("Opening C opaque source file: " + GetPath() + src);
				String srcLine = "";
				while((srcLine = txtReader.readLine()) != null) {
					srcCode = srcCode + "\n\t\t\t\t" + srcLine;
				}
			  
			txtReader.close();   
		  }
		  catch (IOException ex) {
			  System.out.println("-C- source file read error :" + ex.toString());
			  return null;
		  }
		  
		  return srcCode;
		  
	}
	
	public String getOpaqueAL(String src){
		
		String srcCode = "";
		
		try {
				FileReader fr = new FileReader(GetPath() + src);
				BufferedReader txtReader = new BufferedReader(fr);
				
				System.out.println("Opening AL opaque source file: " + GetPath() + src);
				String srcLine = "";
				while((srcLine = txtReader.readLine()) != null) {
					srcCode = srcCode + "\n\t\t\t\t" + srcLine;
				}
			  
			txtReader.close();   
		  }
		  catch (IOException ex) {
			  System.out.println("-AL- source file read error :" + ex.toString());
			  return null;
		  }
		  
		  return srcCode;
		  
	}

	public String getOpaqueJava(String src){
	
	String srcCode = "";
	
	try {
			FileReader fr = new FileReader(GetPath() + src);
			BufferedReader txtReader = new BufferedReader(fr);
			
			System.out.println("Opening Java opaque source file: " + GetPath() + src);
			String srcLine = "";
			while((srcLine = txtReader.readLine()) != null) {
				srcCode = srcCode + "\n\t\t\t\t" + srcLine;
			}
		  
		txtReader.close();   
	  }
	  catch (IOException ex) {
		  System.out.println("-Java- source file read error :" + ex.toString());
		  return null;
	  }
	  
	  return srcCode;  
	}
}
