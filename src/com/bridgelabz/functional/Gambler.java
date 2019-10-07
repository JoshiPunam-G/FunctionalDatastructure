/* 

/*  Purpose:Simulates a gambler who start with $stake and place fair $1 bets until
            he/she goes broke (i.e. has no money) or reach $goal.
 * 
 *  @author  BridgeLabz
 *  @version 1.0 
 *  @since   11-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import Utility.Utill;

public class Gambler {

	public static void main(String[] args) {
		
	System.out.println("Enter Stake , Goals and Time");
	int stake=Utill.isInteger();
	int goals=Utill.isInteger();
	int trial=Utill.isInteger();
	Utill.isGambler(stake, goals, trial);
	
}
}