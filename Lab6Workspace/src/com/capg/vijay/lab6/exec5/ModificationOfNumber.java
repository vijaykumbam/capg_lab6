package com.capg.vijay.lab6.exec5;

public class ModificationOfNumber {

	int modifyNumber(int userInput)
	{
		int last = userInput%10;
		String number = Integer.toString(userInput);
		int length=number.length();
		StringBuffer sb = new StringBuffer();
		for(int loop=0;loop<length-1;loop++)
		{
			int first =number.charAt(loop);
			int pre = number.charAt(loop+1);
			int diff = Math.abs(first-pre);
			sb.append(diff);
		}
		sb.append(last);
		System.out.println(sb);
		String str = new String(sb);
		int finalnumber =Integer.parseInt(str);
		
		
		return finalnumber;
		
	}
	
}
