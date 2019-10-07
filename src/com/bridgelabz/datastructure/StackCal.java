package com.bridgelabz.datastructure;


import Utility.Utill;

public class StackCal<T> {

	public static void main(String[] args) {

		System.out.println("Enter the month and year");
		int month = Utill.isInteger();
		int year = Utill.isInteger();
		
		int[][] calender = Utility.calenderQueue(month,year);
		
		String[] days = {"S","M","T","W","T","F","S"};
		
		for(int i=0;i<days.length;i++)
			System.out.print(days[i]+"  ");
		System.out.println();
		
		LinkedStack<Integer> list = new LinkedStack<>();
		for(int i=0;i<6;i++) 
		{
			for(int j=0;j<7;j++) 
			{
				list.add(calender[i][j]);
			}
		}
		
		LinkedStackCalendar<Integer> listCalendar = new LinkedStackCalendar<>();
		
		for(int i=0;i<6;i++) 
		{
			for(int j=0;j<7;j++) 
			{
				Integer temp = list.pop();
				listCalendar.add(temp);
			}
		}
		listCalendar.display();
		}
	

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0)
			return true;
		else
			return false;
	}
	
	
	
	}


