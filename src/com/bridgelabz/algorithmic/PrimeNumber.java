package com.bridgelabz.algorithmic;

import java.util.Scanner;

import Utility.Utill;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter lower number:");
		
		int a=Utill.isInteger();
		
		System.out.println("Enter Higher number:");
		
		int b=Utill.isInteger();
		
		Utill.isRange(a,b);
			}

}
