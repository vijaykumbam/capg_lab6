/**
 * 
 */
package com.capg.vijay.lab6.exec8;

import java.util.Scanner;
public class Test {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string =");
		String inputString = sc.nextLine();
		StringClass obj = new StringClass();
		System.out.println(obj.getMethod(inputString));

	}

}
