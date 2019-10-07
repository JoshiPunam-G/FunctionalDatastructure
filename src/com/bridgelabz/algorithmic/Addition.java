package com.bridgelabz.algorithmic;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
	//********************Addition of number****************************
		
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int sum=0;
		while(num1>0)
		{
			int res=num1%10;
			sum=sum+res;
			num1=num1/10;
		} 
		System.out.println("Addition of is:"+sum);
		
  //*****************Addition of first and last**************************		
		int num=123;
		int l;
		l=num%10;
		int f=num;
	   while(num>10)
	   {
		   
		    num=num/10 ;  
		   System.out.println(num);
	   }
	   f=num;
	   int sum1=f+l;
	   System.out.println("Addition of first and last:"+sum1);
       } 
}


