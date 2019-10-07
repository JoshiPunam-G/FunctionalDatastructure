package com.bridgelabz.datastructure;

import Utility.Utill;

import com.bridgelabz.datastructure.stack;

public class CalendarStack {


	public static void main(String[] args) {

	System.out.println("Enter the month");
	int m =Utill.isInteger();
	System.out.println("Enter the year");
	int y =Utill.isInteger();
	
	/* printing first 3 rows */
	System.out.println("   Java Calender " + m + " " + y);
	
	/*  array of name of months */
	String[] month = { "0", "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };
	
	/* array of number of days in a month */
	int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	System.out.println(" " + month[m] + " " + y);
	
	stack<String> s = new stack<String>();
	stack<String> cal = new stack<String>();
	
	/* pushing elements in 1st stack */
	s.push("  S");
	s.push("  M");
	s.push("  T");
	s.push("  W");
	s.push(" Th");
	s.push("  F");
	s.push("  S");
	s.show();
	System.out.println();
	
	/* calculated first day of month  */
	int d =Utill.dayOfWeek(1, m, y);
				
	
	/* printing first blank spaces */ 
	for (int i = 0; i < d; i++) {
		cal.push("   ");
	}
	
	/* inserting dates in calendar  */
	for (int i = 1; i <= days[m]; i++) {
		
		if (i < 10)
			cal.push(" " + i);
		else
			cal.push(" " + i);
		if ((d + i) % 7 == 0)
			cal.push("\n");
	}
	cal.show();

}
}
