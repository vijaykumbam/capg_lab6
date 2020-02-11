package com.capg.vijay.lab6.exec4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the word");
		Scanner sc = new Scanner(System.in);
		String paragraph = sc.next();
		ReplaceAllConsonants obj = new ReplaceAllConsonants(paragraph);
		System.out.println(obj.alterString(paragraph));
	}

}
