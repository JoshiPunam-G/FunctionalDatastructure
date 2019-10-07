/* 
/*  Purpose:Print print 2 Dimensional Array of integers, doubles, or booleans from
    standard input and printing them out to standard output..
 * 
 *  @author  BridgeLabz
 *  @version 1.0 
 *  @since   11-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.io.PrintWriter;
import java.util.Scanner;

import Utility.Utill;

public class Array2D {

	public static void main(String[] args)
	{
		PrintWriter pw=new PrintWriter(System.out,true);
		
		System.out.println("Enter M rows , N cols ");
		
		int m=Utill.isInteger();
		
        int n=Utill.isInteger();
        
        Utill.isArray(m,n);
        
		
			}
}
