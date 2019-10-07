
/* 
/*  Purpose:takes two integer command­line arguments x
 *  and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
 *  @author  BridgeLabz
 *  @version 1.0 
 *  @since   12-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import Utility.Utill;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter t and v");
		//int t=0,v=0;
		int t=sc.nextInt();
		int v=sc.nextInt();
		Utill.isWind(t,v);
	}

}
