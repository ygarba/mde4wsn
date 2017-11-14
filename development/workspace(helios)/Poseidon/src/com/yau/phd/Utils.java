package com.yau.phd;

//import com.gentleware.poseidon.dsl.wsn.ActivationType;
import com.gentleware.poseidon.dsl.wsn.*;

public class Utils {
	
	public String boolToDigit(java.lang.Boolean val) 
	{
		if (val)
			return "1";
		else
			return "0";
	}
	
	public String enableToDigit(ActivationType val) 
	{
		String ret = "0";
		
		System.out.print("enable string = " + val);
		
		if (val == ActivationType.ENABLE_ON)
			ret = "1";
		else if (val == ActivationType.DONT_CARE)
			ret = "0";
		
		return ret;
	}
	
	public String disableToDigit(ActivationType val) 
	{
		String ret = "0";
		
		System.out.print("disable string = " + val);
		
		if (val == ActivationType.DISABLE_ON)
			ret = "1";
		else if (val == ActivationType.DONT_CARE)
			ret = "0";
		
		return ret;
	}
}
