/* 
/*  Purpose:This program takes a command­line argument N and prints a table of the
    powers of 2 that are less than or equal to 2^N.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import Utility.Utill;

public class PowerOf {

	public static void main(String[] args) {
	
		System.out.println("Enter Number");
		int n=Utill.isInteger();
		Utill.isPower(n);
      
	}
}


