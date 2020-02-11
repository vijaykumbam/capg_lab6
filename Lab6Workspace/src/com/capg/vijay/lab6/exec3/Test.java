package com.capg.vijay.lab6.exec3;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		System.out.println("Enter the word");
		Scanner sc =new Scanner(System.in);
		String word = sc.nextLine();
		StringMirrorClass obj = new StringMirrorClass(word);
		System.out.print(obj.getImage(word));
	}

}
