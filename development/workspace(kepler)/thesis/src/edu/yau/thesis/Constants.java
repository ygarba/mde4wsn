package edu.yau.thesis;

public final class Constants {
	
	public static final String CONTIKI_PATH = "/contiki-2.7";
	public static final String CYGWIN_PATH = "c:/cygwin32/bin";
	static String fitnessConf;
	
	public static void setFitnessConf(String str){
		fitnessConf = str;
	}
	
	public static String getFitnessConf(){
		return fitnessConf;
	}
}
