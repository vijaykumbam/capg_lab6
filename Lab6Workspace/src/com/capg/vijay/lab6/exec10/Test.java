package com.capg.vijay.lab6.exec10;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the your name:");
		Scanner sc = new Scanner(System.in);
		String name= sc.nextLine();
		Jobseeker obj = new Jobseeker(name);
		System.out.println(obj.validateMethod(name));
		sc.close();
	}

}
