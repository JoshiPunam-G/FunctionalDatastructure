/* 
/*  Purpose:Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 * 
 *  @author  BridgeLabz
 *  @version 1.0 
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import Utility.Utill;

public class Harmonic {

	public static void main(String[] args) {
	
		System.out.println("--Enter Number--");
		int number=Utill.isInteger();
		Utill.isHarmonic(number);
		
		
		
	}

}
