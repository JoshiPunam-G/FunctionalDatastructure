
/*  Purpose: binarySearch method for integer.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.algorithmic;

import Utility.Utill;

public class SearchSort {
	
	public static void main(String[] args) {
		System.out.println("--Binary Search for Integer--");
		//Object of Utill class
		Utill u=new Utill();
		
		//initialization of Binary search for Integer
		int[] a= { 0 , 1 , 2 , 3 , 4 , 5 , 6 };
		int n=a.length;
		int x=5;
		int left,right;

		int  result=u.integerBinary(a, 0, n-1, x);
		if(result==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at index"+result);
		}
		
		SearchSort s=new SearchSort();
	
	}
}
