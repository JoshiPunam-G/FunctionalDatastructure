/**  Purpose: implementation of linkedlist.
 *  @author  Punam Joshi
 *  @version 1.0
 *  @since   23-09-2017
 *
 ******************************************************************************/

//**************Utility for orderedLinked List******************

package com.bridgelabz.datastructure;

import java.io.File;
import java.util.Scanner;

import Utility.Utill;


public class TestLinked {
	 static Node head;

	 static class Node
	 {
       int element ;
		int data;
		 Node next;
	 }
	 
	 public static void insert(int data)
	 {
		
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
		  Node node1=head;      //temperory node
		  while(node1.next!=null)
		  {
			  node1=node1.next;
		  }
		  node1.next=node;
		}
	 }
	 
	 /**
	  * insert element at start
	  * @param data
	  */
	 public void insertAtstart(int data)
	 {
		 Node node=new Node();
			node.data=data;
			node.next=null;
			
			node.next=head;
			head=node;
			
	 }
	 

	 
	 /**
	  * insertAtposition 
	  * @param data
	  * @param index
	  */
	 public void insertAtpos(int data,int index)
	 
	 {
		 Node node=new Node();
			node.data=data;
			node.next=null;
			
			Node node1=head;
			 
			
			if(index==0)
			{
				insertAtstart(data);
			}
			else
			{
				for(int i=0;i<index-1;i++)
				{
					node1=node1.next;
				}
				
				node.next=node1.next;
				node1.next=node;	
			}
	}
	 /**
	  * delete node from linkedlist
	  * @param index
	  */
	 public void deleteAtPos(int index)
	 {
		 if(index==0)
		{
		   head=head.next;		
		}
		 else
		 {
			Node node = head;
			Node node1=null;
			for(int i=0;i<index-1;i++)
			{
				node1=node1.next;
			}
			
			node1=node.next;
			node.next=node1.next;
		 }
	 }
	 
	 
	 
	 
	 
	 /**
	  * search element from linklist
	  * @param data
	  */
	 
	   public static  void searchData()
	   {
		   System.out.println("----");
	        Node temp =head;
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

	        if(flag ==1)
	        {
	            removeData(count);
	        }
	        else
	        {
	            insert(s);
	            System.out.println("After Adding a LIst ");
	            display();
	        }
	    }
	   
	   
	  
	   
	   
	   
	   static /*for removing data */
	   void removeData(int count)
	    {
	        Node temp = head;
	        if(count==1)
	        {
	            head =head.next;
	            System.out.println("After Deleting LIst is ");
	            display();
	        }
	        else
	        {
				for(int i=1;i<count-1;i++)
				{
				 	temp=temp.next;
				}
	        temp.next =temp.next.next;
	        System.out.println("After Deleting LIst is ");
	        display();
	        }
	    }
	   
	  
	/**
	 * Purpose : Method for Reading content of file .   
	 * @return
	 */
	
		
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
				System.out.println(arr[i]);
			}
			//System.out.println(arr);
			
			 int size=arr.length;
			 for(int i=size;i>0;i--)
			 {
				 for(int j=1;j<size;j++)
				 {
					 if(arr[j-1]>arr[j])
					 {
						 int temp=arr[j-1];
						 arr[j-1]=arr[j];
						 arr[j]=temp;
					 }
				 }
				 size--;
			 }
			 
		System.out.println("After Sorting");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
			//sortList(arr);
			display();
		//	System.out.println("Enter");
			searchData();
			return arr;
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		
		}
		
		
		
	    public static void sortList() {  
	        //Node current will point to head  
	        Node current = head, index = null;  
	        int temp;  
	          
	        if(head == null) {  
	            return;  
	        }  
	        else {  
	            while(current != null) {  
	                //Node index will point to node next to current  
	                index = current.next;  
	                  
	                while(index != null) {  
	                    //If current node's data is greater than index's node data, swap the data between them  
	                    if(current.data > index.data) {  
	                        temp = current.data;  
	                        current.data = index.data;  
	                        index.data = temp;  
	                    }  
	                    index = index.next;  
	                }  
	                current = current.next;  
	            }      
	        }  
	    }  

	
		  
		  /**
		   * sort the linkedlist in ascending order.
		 * @return 
		
		
		 public static  int[] sortList(int[] array) {
			 int size=array.length;
			 for(int i=size;i>0;i--)
			 {
				 for(int j=1;j<size;j++)
				 {
					 if(array[j-1]>array[j])
					 {
						 int temp=array[j-1];
						 array[j-1]=array[j];
						 array[j]=temp;
					 }
				 }
				 size--;
			 }
		
				return array;
			}
		     */
		
		
		 /**
		   * Display Linked List
		   */
	   
	   public static  void display()
	   {
	        Node temp =head;
	        while( temp != null)
	        {
	            System.out.print(temp.data+" ");
	            temp=temp.next;
	        }
	        System.out.println(" ");
	    }

	   
	 
	 /**
	  * delete node
	  * @param element
	  */
	 public  void deleteNode(String element)
	 {
		// System.out.println("Delete Method");
		Node temp = head, prev = null;

		while (temp != null) {
			int str = temp.data;
			if (element.equals(str)) { // Changed head
				prev = temp;
				prev.next = temp.next;

			} else {
				temp = temp.next;
			}
		}
	        
		 

	 }
	
	  
	  
	  
	  /**
	   * length of linkedlist
	   * @return
	   */
	  
	  public int lengthOfLinkedList()
	  {
	     Node temp=head;
	     int count = 0;
	     while(temp!=null)
	     {
	       temp=temp.next;
	       count++;  
	     }
	     return count;
	  }
	  
	  
	

	
	 

}
