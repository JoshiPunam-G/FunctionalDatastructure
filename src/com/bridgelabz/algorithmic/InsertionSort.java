
/**  Purpose: insertionSort  for integer
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.algorithmic;

import java.util.Scanner;

import Utility.Utill;

public class InsertionSort {
	
	 

	public static void main(String[] args) {
		System.out.println("--Insrtion Sort for String--");
		
		System.out.println("How many elements you want to sort:");
		int n=Utill.isInteger();
		
		System.out.println("Enter Elements in the array:");
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=Utill.isInteger();
		}
		
		
		Utill.sort(arr);
		Utill.printArray(arr);
	}

}
