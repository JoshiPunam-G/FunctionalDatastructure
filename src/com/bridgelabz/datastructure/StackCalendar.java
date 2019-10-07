package com.bridgelabz.datastructure;


import Utility.Utill;


public class StackCalendar {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		System.out.println("Enter the month");
		int m=Utill.isInteger();
		System.out.println("Enter the year");
		int y =Utill.isInteger();
		
		//printing first 3 rows
		System.out.println("   Java Calender " + m + " " + y);
		
		//array of name of months
		String[] month = { "0", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		//array of number of days in a month
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("  " + month[m] + " " + y);
		
		StackUsingLinkedList stack=new StackUsingLinkedList();
		
		//pushing elements in 1st stack
		stack.push("  S");
		stack.push("  M");
		stack.push("  T");
		stack.push("  W");
		stack.push(" Th");
		stack.push("  F");
		stack.push("  S");
		stack.display();
		System.out.println();
		
		//calculated first day of month
		int d = Utill.dayOfWeek(1, m, y);
		
		// printing first blank spaces
		for (int i = 0; i < d; i++) {
			stack.push("   ");
		}
		
		//inserting dates in calendar
		for (int i = 1; i <= days[m]; i++) {
			
			if (i < 10)
				stack.push("  " + i);
			else
				stack.push(" " + i);
			if ((d + i) % 7 == 0)
				stack.push("\n");
		}
		stack.display();
	
	}

}
