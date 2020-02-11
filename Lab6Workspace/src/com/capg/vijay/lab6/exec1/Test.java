package com.capg.vijay.lab6.exec1;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Enter the line");
			Scanner sc =new Scanner(System.in);
			String paragraph = sc.nextLine();
			ReadsIntegerFromLine obj = new ReadsIntegerFromLine();
			obj.findSumOfIntegers(paragraph);
			sc.close();
		}
		catch (Exception e)
		{
			System.out.println("exception caught"+ e);
		}
	}
}

