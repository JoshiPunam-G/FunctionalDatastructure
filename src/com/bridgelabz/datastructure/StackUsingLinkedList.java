package com.bridgelabz.datastructure;

public class StackUsingLinkedList {

	public static class Node
	{ 
		 /*integer data*/  
	   int data;
	  // String data1;
	   Node link; /* reference variavle Node type*/  
		} 
	
	
		static Node top; /* create globle top reference variable */  
		 
		StackUsingLinkedList() 
		{ 
				StackUsingLinkedList.top = null; 
		} 
		/* Utility function to add an element x in the stack */ 
		public static void push(int x) /*  insert at the beginning */ 
		{  
			
			Node temp = new Node(); 
			
			temp.data = x;         /* initialize data into temp data field*/  
			
			temp.link = top;      /* put top reference into temp link*/ 

			top = temp;          /*  update top reference*/ 
			              
		} 
		
		
		public static void push(String str) /*  insert at the beginning */ 
		{  
			
			Node temp = new Node(); 
			
			int data1 = 0;
			temp.data = data1;         /* initialize data into temp data field*/  
			
			temp.link = top;      /* put top reference into temp link*/ 

			top = temp;          /*  update top reference*/ 
			              
		} 


		/* Utility function to check if the stack is empty or not*/  
	  public boolean isEmpty() 
		{ 
			return top == null; 
		} 
	  
	  /*  Utility function to return top element in a stack */ 
	 public int peek() 
       { 
	
			if (!isEmpty()) { 
				return top.data; 
				} 
				else { 
				System.out.println("Stack is empty"); 
				return -1; 
				} 
				} 

	/* Utility function to pop top element from the stack */  
		public static void pop() 
		{ 
			if (top == null) { 
			System.out.print("\nStack Underflow"); 
			return; 
			} 

			/*  update the top pointer to point to the next node */ 
			top = top.link; 
		} 

		
		/*  */
		public static void display() 
		{ 
			 
			if (top == null)            /* check for stack underflow */ 
			{                                   
			System.out.printf("\nStack Underflow"); 
			} 
			else 
			{ 
				Node temp = top; 
				while (temp != null)                
				{                                    
			     int num=temp.data;                  /* print node data */  
				System.out.print(num+" ");
				  temp = temp.link;                  /* assign temp link to temp */
				} 
			} 
		} 
		
				
		
		
			

}
