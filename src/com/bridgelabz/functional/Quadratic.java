
 /* 
 *  Purpose: find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots.
 *  the start and end clicks
 *  @version 1.0 
 *  @since   13-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import Utility.Utill;

public class Quadratic {

	public static void main(String[] args) {
		
		System.out.println("Enter a , b, c");
		int a=Utill.isInteger();
		int b=Utill.isInteger();
		int c=Utill.isInteger();
		System.out.println("--Quadratic Equation--");
		Utill.isQuadratic(a, b, c);
		}

}
