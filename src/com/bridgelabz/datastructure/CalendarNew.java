package com.bridgelabz.datastructure;

import Utility.Utill;

public class CalendarNew {

	public static void main(String[] args) {
		
		String[][] cal=new String[6][7];
		
		System.out.println("Enter Month");
		int m=Utill.isInteger();
		
		System.out.println("Enter Year");
		int y=Utill.isInteger();
		
		/* Printing First 3 Rows */ 
		System.out.println("  Calender " + m + " " + y);
		
		String[] month = { "0", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		System.out.println("  " + month[m] + " " + y);
		
		System.out.println("   S   M   T   W  TH   F   S");
		
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		
		/*  Checking the condition of Leap Year */
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
			days[2] = 29;
		}
		
		
		//System.out.println(days[2]);
		
		int d = Utill.dayOfWeek(1 ,m, y);

		/* Printing Initial Spaces */ 
		for (int i = 0; i < d; i++) {
			cal[0][i] = "    ";
		}

		/*  Taking values in array */
		int tempDay = 0;
		for (int i=0; i<cal.length; i++) 
		{
			for (int j=0; j<cal[i].length; j++) 
			{
				if (!(i == 0 && j < d))
				{
					if (tempDay <= days[m] ||(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))) 
					{
						//System.out.println(days[2]);
						tempDay++;
						if (tempDay < 10) 
						{
							cal[i][j] = "   " + tempDay;
						} else 
						{
							cal[i][j] = "  " + tempDay;
						}
					} 
					else 
					{
						break;
					}
				}

			}
		}
		
		
		/* Printing an array */ 
				tempDay = 0;
				for (int i = 0; i < cal.length; i++) 
				{
					for (int j = 0; j < cal[i].length; j++) 
					{
						if (days[m] >= tempDay) 
						{
							tempDay++;
							System.out.print(cal[i][j]);
						} 
						else 
						{
							break;
						}
					}
					System.out.println();
				}
			

	}

}
