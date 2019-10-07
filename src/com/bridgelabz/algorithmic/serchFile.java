/**  Purpose: Binary Search the Word from Word List
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   14-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.algorithmic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class serchFile {
	
	static int num ;
	private static int flag;
	static int left = 0;
	static Integer[] temp;
    static int right = 0;
	int mid=0;
	 
  public static void main(String[] args)throws Exception {
	Scanner file=null;
	Scanner sc=new Scanner(System.in);
	
  System.out.println(" Word File Contains integer Data as Follow ");
  ArrayList<Integer> list = new ArrayList<>();
  try
  {
     file= new Scanner(new File("/home/bridgeit/Downloads/test.txt"));          
  }
  catch(FileNotFoundException ex)
  {
	 System.out.println("File is not found!");
  }
  
  while(file.hasNext())
  {
	 if(file.hasNextInt()) ((AbstractCollection<Integer>) list).add(file.nextInt());
	 else 
		 file.next();
  }
  
  
 Collections.sort(list);
  
  for(Integer i : list)
	 System.out.println(i);
 
	
  while(file.hasNextInt())
  {
	  list.add(sc.nextInt());
  }
  System.out.println(list);
 
  temp=list.toArray(new Integer[list.size()]);
   System.out.println("this is conversion of list into array");
   System.out.println(Arrays.toString(temp));
   System.out.println("Enter number which you want to search from word file:");
   num=sc.nextInt();
   
   //int flag=0;
  // int index=0;

	int  result=serchFile.integerBinary(temp, num);


  }
   
  
    
  /*  if(list.contains(snum))
    {
        System.out.printf("List contains %d\n", snum);
    }
    else
    {
        System.out.printf("List does not contain %d\n", snum);
    }
 
  }8*/

    
   
  private static int integerBinary(Integer[] temp, int num)  {
	right=temp.length-1;
	   boolean status=false;
		if(right>=left)
		{
			 int mid = left+(right-left)/2;
			 
			 if(temp[mid]==num) 
				 return mid;
			
			  if(temp[mid]>num)
			  {
				  status=true;
		    
		       
			  }
			  else
			  {  
				  status=false;
			   
			  }
			 
			
		}
		
		
		if(status==true)
		{
			System.out.println("Element  found");
		}
		else
		{
			System.out.println("Element not found  ");
		}
		
		return num;
		
	}




	
}
