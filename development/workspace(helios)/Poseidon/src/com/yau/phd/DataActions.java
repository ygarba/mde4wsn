package com.yau.phd;

public class DataActions {

	public String getDataParameters(String query){
		
		String[] params;
		String[] paramList;
		
		paramList = query.split("\\?");
		params = paramList[1].split(",");
		
		if (params[0].compareTo("equal") == 0 && params.length != 2) { //means if comparison is 'equal to', then there must a value to compare with
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Node facts search query ill-formed..");
					return "";
				}
		}
		else 
		{
			if (params.length == 1)
				return params[0].toUpperCase() + ", " + "0";
			else 	
				return (params[0].toUpperCase() + ", " + params[1]);
		} 
		  
	}	
	
	public String getVarName(String query){
	
		String[] paramList;
		String varName;
		
		paramList = query.split("\\?");
		varName = paramList[0].toLowerCase();
		return varName.substring(0, 1).toUpperCase() + varName.substring(1);
	}
}
