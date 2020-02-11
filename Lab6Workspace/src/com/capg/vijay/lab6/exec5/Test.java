package com.capg.vijay.lab6.exec5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int userInput = sc.nextInt();
		ModificationOfNumber obj = new ModificationOfNumber();
		obj.modifyNumber(userInput);
	}

}
