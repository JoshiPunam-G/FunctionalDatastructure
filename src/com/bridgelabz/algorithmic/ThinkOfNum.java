/**  Purpose: guesses the answer with n questions.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   14-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.algorithmic;

import java.util.Scanner;

import Utility.Utill;

public class ThinkOfNum {

	public static void main(String[] args) {
		  int range,count,low,up,mid;
			 String inputstring;
			
				
			try
			{

				System.out.println("Enter any Number:");
				int n=Utill.isInteger();
				range=(int)(Math.pow(2,n-1));                
				System.out.println("Take number between '0' to "+range);
				count=0;
				inputstring=null;
				low=0;
				up=range;
				mid=(low+up/2);
				Utill.cheking(low, up, mid, count, inputstring, n);
				
			}
			catch (ArrayIndexOutOfBoundsException ae)
			{
				ae.printStackTrace();
			}
			}	    
	    
	    
		
	}


