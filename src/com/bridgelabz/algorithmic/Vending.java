
/**  Purpose: Find the Fewest Notes to be returned for Vending Machine
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   14-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.algorithmic;

public class Vending {

	public static void calculate(int amount)
	{
		int[] notes= {2000,500,200,100,50,20,10,5,1};
		int[] countNotes=new int[9];
		int total = 0;
		
		//counting notes
		for(int i=0;i<9;i++)
		{
			if(amount>=notes[i])
			{
				countNotes[i]=amount/notes[i];
				amount=amount-countNotes[i]*notes[i];      
				 total=countNotes[i]+notes[i];
			}
		}
		
		for(int i=0;i<9;i++)
	    {
		  if(countNotes[i]!=0)
		  {
			
			
			  System.out.println(notes[i]+ ":" +countNotes[i]);
		  }
 		
     	 }
		System.out.println("Total number of notes:"+total);
	}
	 
	public static void main(String[] args) {
		int amount=-100;
		calculate(amount);
	}

}
