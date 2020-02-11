package com.capg.vijay.lab6.exec8;

public class StringClass {

	boolean getMethod(String inputString)
	{
		int length =inputString.length(); int count =0; // azabc =5; {'a','z','a','b','c'}
		for(int loop=0;loop<length-1;loop++)
		{
			if(inputString.charAt(loop) <inputString.charAt(loop+1))
			{
				count = count+1;
			}
		}
		
		if(count==length-1)
		return true;
		
		return false;
		
	}
}
