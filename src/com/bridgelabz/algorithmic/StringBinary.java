
/*  Purpose: binarySearch method for String.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.algorithmic;

import Utility.Utill;

public class StringBinary {
	

	public static void main(String[] args) {

		System.out.println("--Binary Sort for String--");
		StringBinary sb=new StringBinary();
		
		String[] sArray= {"FIRST" , "SECOND" ,"THIRD" ,"FOURTH","FIFTH"};
		int left = 0 , right = sArray.length-1;
		
	
	  Utill.stringBinary(left,right,sArray);
	
	
	           
	}
}
	
	
