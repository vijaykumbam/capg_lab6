package com.capg.vijay.lab6.exec10;

public class Jobseeker 
{
	String name;
	Jobseeker(String name)
	{
		this.name = name;
		//validateMethod(name);
	}
	boolean validateMethod(String name)
	{
		StringBuffer sb =new StringBuffer();
		String field = "_job";
		int length = name.length();
		if(length >8)
		{
			sb.append(name);
			sb.append(field);
			System.out.println(sb);
			return true;
		}		
		return false;
		
	}
}
