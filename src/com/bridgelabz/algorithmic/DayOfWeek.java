package com.bridgelabz.algorithmic;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month and day");
		int month=sc.nextInt();
		int day=sc.nextInt();
		int year=sc.nextInt();
		boolean result=((month==3 && day>=20 && day<=31)||
				(month==4 && day>=1 && day<=30)||
				(month==5 && day>=1 && day<=31)||
				(month==6 && day>=1 && day<=30));
		System.out.println(result);
	}

}
