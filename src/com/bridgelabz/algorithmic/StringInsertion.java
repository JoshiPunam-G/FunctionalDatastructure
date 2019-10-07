/**  Purpose: insertionSort for String
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.algorithmic;

import java.util.Scanner;

import Utility.Utill;

public class StringInsertion {
	
	public static void main(String[] args){
		
		//String[] arr ={"beta","theta","alpha","gamma"};
		int i;
		
		System.out.println("How Many String you want to sort");
	
		int n=Utill.isInteger();
		
		String[] arr=new String[n];
		
		for(i=0;i<n;i++)
		{
		   arr[i]=Utill.isString();
		}
		
		String sortedArray[] = Utill.sort(arr);
		
		System.out.println("--Sorted Array--");
		
		for( i=0;i<n;i++)
		{
		  System.out.println(sortedArray[i]);
		}
	}
				
	
}

