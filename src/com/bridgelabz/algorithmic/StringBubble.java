package com.bridgelabz.algorithmic;

import java.util.Scanner;

import Utility.Utill;

public class StringBubble {

	public static void main(String[] args) {
		
		System.out.println("--Bubble sort for String--");
		
		System.out.println("How many string you  want to sort:");
		
		int n=Utill.isInteger();
		
		String[] str=new String[n];
		
		System.out.println("Enter string:");
		
		for(int i=0;i<str.length;i++)
		{
			str[i]=Utill.isString();
		}
		
		System.out.println("Sorted String is:");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]+"");
		}
		
		Utill.stringBubble(str,n);
	}

}
