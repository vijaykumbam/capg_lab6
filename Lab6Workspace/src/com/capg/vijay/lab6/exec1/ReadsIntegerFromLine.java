package com.capg.vijay.lab6.exec1;
import java.util.*;
import java.lang.Exception;
public class ReadsIntegerFromLine 
{

	static int sum=0;
	void findSumOfIntegers(String paragraph) {
			int sum = 0;
			StringTokenizer st = new StringTokenizer(paragraph , "#");
			while(st.hasMoreTokens())
			{
				int inputs = 0;
				inputs = Integer.parseInt(st.nextToken());
				System.out.println(inputs);
				sum = sum+inputs;
			}
			System.out.println("Total sum :"+sum);
	}
}


