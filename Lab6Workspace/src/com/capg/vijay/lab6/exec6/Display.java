package com.capg.vijay.lab6.exec6;

import java.io.FileInputStream;

public class Display
{	
	
	void getDisplayMethod() throws Exception
	{		
		int line =1,words=1,characters=1;
		FileInputStream fis = new FileInputStream("readableFileFormat.txt");
		while((fis.read())!=-1)
		{
			
			char ch =(char)fis.read();
			if(ch=='\n')
			{
				line++;
			}
			if(ch==' '||ch=='\n')
			{
				words++;
			}
			else
			{
				characters++;
			}
		}
		System.out.println("No of lines ="+ --line);
		System.out.println("No of words ="+ ++words);
		System.out.println("No of characters ="+characters);
		
	}
	
	public static void main(String args[]) throws Exception
	{
		Display obj = new Display();
		obj.getDisplayMethod();
	}
}
