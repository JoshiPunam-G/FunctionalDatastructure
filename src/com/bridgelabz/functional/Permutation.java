/* 
/*  Purpose:static functions to return all permutation of a String using iterative method and
 *  Recursion method. Check if the arrays returned by two string functions are equal.*  @author  BridgeLabz
 *  @version 1.0 
 *  @since   12-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import Utility.Utill;

//import Utility.Utill;

public class Permutation {

	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Input String");
		
        String inputString=Utill.isString();
        
        String outputString=" ";
        
        Utill.isPermute(inputString,outputString);
        
	}
	
	
}
