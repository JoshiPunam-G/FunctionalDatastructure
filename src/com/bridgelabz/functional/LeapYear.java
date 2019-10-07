
/*  Purpose: Determine whether year is leap year or not .
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import Utility.Utill;

public class LeapYear {

	public static void main(String[] args) {
	System.out.println("Enter year:");
	int year=Utill.isInteger();
		Utill.isLeapYear(year);
		
	}

}
