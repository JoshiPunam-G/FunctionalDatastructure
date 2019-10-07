

 /* 
/*  Purpose:Stopwatch Program for measuring the time that elapses between
 *  the start and end clicks
 *  @version 1.0 
 *  @since   12-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import Utility.Utill;

public class StopWatch {
    private final long start=0;
    
    
    
	public static void main(String[] args) {
		
		long startTime=0;
		long stopTime=0;
		long elapsed=0;
		System.out.println("Enter key to start");
		String str=Utill.isString();
	   
		startTime=Utill.startWatch(startTime);

		System.out.println("Enter key to end");
		
		String str1=Utill.isString();
		
		stopTime=Utill.stopWatch(startTime);
		
		
		System.out.println("Elapsed Time");
		
		Utill.Elapsed(startTime, stopTime, elapsed);
		
		

	}

}
