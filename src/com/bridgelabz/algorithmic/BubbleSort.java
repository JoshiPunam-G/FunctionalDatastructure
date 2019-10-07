/**  Purpose: BubbleSort for integer
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.algorithmic;

import java.util.Scanner;

import Utility.Utill;

public class BubbleSort {

	public static void main(String[] args) {
		
		System.out.println("--Bubble sort--");
		
		System.out.println("Enter elements for bubble sort:");
		
		int num=Utill.isInteger();
		
		int[] a=new int[num];
		
		System.out.println("Enter element");
		
        System.out.println("--Elements After Bubble sort--");
        
        for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]+"");
		}
        
        Utill.intBubble(a);
	}

}
