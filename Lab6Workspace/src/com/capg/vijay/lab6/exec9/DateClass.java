package com.capg.vijay.lab6.exec9;
import java.time.*;
public class DateClass {

	
	public static void main(String args[])
	{
		LocalDate currentdate = LocalDate.now();
		LocalDate userdate = LocalDate.of(2001, 02, 21);
		System.out.println("Current year with date:"+currentdate);
		System.out.println("user given date is :"+userdate);
		int diff = currentdate.compareTo(userdate);
		Period time = Period.between(userdate, currentdate);
		System.out.println("No of days:"+time.getDays()+" & No of months"+time.getMonths()+" & No of Years:"+diff);
	}
}

/*
Month month = userdate.getMonth();
			System.out.println(month);
*/