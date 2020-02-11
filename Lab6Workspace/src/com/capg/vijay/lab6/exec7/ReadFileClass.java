package com.capg.vijay.lab6.exec7;

import java.io.File;
import java.util.Scanner;

public class ReadFileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the file name");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		File f = new File(fileName);
		if(f.exists())
		{
			System.out.println("File is exists in the local system");
			System.out.println("File writtenable format:" + f.canWrite());		
			System.out.println("File Readable format :"+f.canRead());
			System.out.println("File length is :"+f.length());
			System.out.println(f.getParent());
			
		}
		else
		{
			System.out.println("File does not exist");
		}
	}

}
