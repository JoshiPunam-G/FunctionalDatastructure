
/**  Purpose:Create a Slot of 10 to store Chain of Numbers that belong to each Slot to
        efficiently search a number from a given set of number
        
 *  @author  Punam Joshi
 *  @version 1.0
 *  @since   1-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.HashUtility;

import Utility.Utill;

public class HashFunction {

	public static void main(String args[])
	{	
		HashUtility list[] = new HashUtility [11];
	 
	 
	 for(int i=0;i<=10;i++)
	 {
		 list[i]=new HashUtility ();
	 }
	 
	 
	 int[]  number=new int[50];
	 
	 number=HashUtility.readFile();
	 
	 System.out.println("Enter key to serch: ");
	 
	 int searchkey=Utill.isInteger();
	 
	 int intNum,remainder=0;
	 
	 for(int i=0;i<number.length;i++)
	 {
		 intNum =number[i];
		 
		 remainder =intNum%11;
		 
         int key = list[remainder].insert(intNum);
         
         if(key==searchkey)
		   {
        	 
		    	System.out.println("key found At"+ remainder );
		    	
		   }

	 }
	
	 
	 for(int i=0;i<11;i++)
	 {
		 System.out.print(i+"--->");
		 
		 list[i].show();
	 }
	 
	 System.out.println();
	 
	 int key=0 ;
	 int rem=0;
	 for(int i=0;i<11;i++)
	 {
		// if(key% 11)
		 {
			 
		 }
	 }
	 
	 
	
   }
}
