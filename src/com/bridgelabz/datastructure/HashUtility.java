package com.bridgelabz.datastructure;

import java.io.File;
import java.util.Scanner;

import com.bridgelabz.datastructure.TestLinked.Node;

import Utility.Utill;

public class HashUtility {
	
	  Node head;
	
	public  class Node
	{
		int data;
		Node next=null;
	}
	
	public  int insert(int data)
	{
		Node node= new Node();
		 node.data=data;
		 node.next=null;
		 
		 if(head==null)
		 {
			 head=node;
		 }
		 else
		 {
			 Node current = head;
			 Node temp=null;
			 
			 while(current!=null && (current.data<node.data))
			 {
				 temp=current;
				 current=current.next;
			 }
			 node.next=current;
			// temp.next=node;
			
		 }
		return data;
		
	}
	
	public static int[] readFile()
	{
	try 
	{
		File file= new File("/home/bridgeit/Downloads/order.txt");
		
		Scanner sc= new Scanner(file);
		
		int count=0;
		
		while(sc.hasNextInt())
		{
			count++;
			sc.nextInt();
		}
		
		int[] arr= new int[count];
		
		Scanner s= new Scanner(file);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		
		return arr;
		
	} 
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
	
}
	
	
	 /**
	  * search element from linklist
	  * @param data
	  */
	 
	   public  void searchData()
	   {
	        Node temp = head;
	        int count=0;
	        System.out.println("Enter a number to Search");
	        int s =Utill.isInteger();
	        int flag=0;
	        while(temp.next != null)
	        {
	            count++;
	            if( temp.data==s)
	            {
	                System.out.println(" number is found At "+count);
	                flag++;
	                break;
	            }
	            temp=temp.next;
	        }

	        if(flag == 1)
	        {
	            removeData(count);
	        }
	        else
	        {
	            insert(s);
	            System.out.println("After Adding a LIst ");
	            show();
	        }
	    }
	   
	
	   
	    /*for removing data */
	   void removeData(int count)
	    {
	        Node temp = head;
	        if(count==1)
	        {
	            head =head.next;
	            System.out.println("After Deleting LIst is ");
	            show();
	        }
	        else
	        {
				for(int i=1;i<count-1;i++)
				{
				 	temp=temp.next;
				}
	        temp.next =temp.next.next;
	        System.out.println("After Deleting LIst is ");
	        show();
	        }
	    }
	  
	
	public  void show() 
	  { 
		Node node = head;

		while (node != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}

		System.out.println();
	  
	  }

}
