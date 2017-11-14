package com.yau.phd;

public class Testor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NodeActions node = new NodeActions();
		System.out.println(node.getNodeParameters("battery?equal , 85"));
		
		DataActions datum = new DataActions();
		System.out.println(datum.getVarName("temperature?equal , 85"));
		
		Utils util = new Utils();
		System.out.println(util.boolToDigit(true));
	}

}
