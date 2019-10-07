
/* 
/*  Purpose:A program with cubic running time. Read in N integers and counts the
    number of triples that sum to exactly 0.
 *  @author  BridgeLabz
 *  @version 1.0 
 *  @since   11-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.HashSet;
import java.util.Scanner;

import Utility.Utill;

public class SumOfThree {

	public static void main(String[] args) {
		  
		//int a []= {0, -2, 1, -4, 1, 6};
    //    Scanner sc=new Scanner(System.in);
		System.out.println("how many elemnts you want to add into array ");

		
		int num=Utill.isInteger();
		
	    int[] array=new int[num];
	    
		Utill.isSum(array,num);
		
	
		 }
	}

		
	



