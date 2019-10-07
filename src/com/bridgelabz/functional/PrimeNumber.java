package com.bridgelabz.functional;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower number:");
		int a=sc.nextInt();
		System.out.println("Enter Higher number:");
		int b=sc.nextInt();
		int i,j,count=0;

		for(i=a;i<b;i++)
		{
			for(j=2;j<i;j++)
			{
			 if(i%j==0)
			 {
				count=0;
				 break;
			 }
			 else
			 {
				 count=1;
			 }
			
			}
			if(count==1)
			{
				System.out.println(i);
			}
		}
	}

}
