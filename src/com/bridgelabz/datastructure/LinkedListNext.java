package com.bridgelabz.datastructure;
import java.util.ArrayList;
import java.util.List;


public class LinkedListNext<T> {

	Node<T> head;
	
	Object[] queue = new Object[10];
	int front;
	int rear;
	int size;
	
	public class Node<T>
	{
		public T data;
		public Node<T> next;
	}

	/**
	 * Purpose: method for insert node
	 * 
	 * @param data input from user
	 */
	
	public void add(Object data) 
	{
		Node<T> nodenew = new Node<T>();
		nodenew.data = (T) data;
		if (head == null) {
			head = nodenew;
			size++;
		}
		else {
			Node<T> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = nodenew;
			size++;
		}
	}
	
	
	
//	/**
//	 * Purpose: method for display the nodes
//	 */
//	public String show()
//	{
//		String str = "";
//		Node<T> n = head;
//		if (head == null) 
//		{
//			return "no data";
//		} else 
//		{
//			while (n.next != null) 
//			{
//				str += n.data + " ";
//				n = n.next;
//			}
//			str += n.data;
//		}
//
//		return str;
//	}
	
	/**
	 * Purpose :Method for inserting elements 
	 * @param data
	 */
	 
		public void enQueue(T data) {
			queue[rear] = data;
			rear = (rear + 1) ;
			size = size + 1;
			if (isFull()) {
				//System.out.println("Queue is full removing first value");
			}
		}

		/**
		 * Purpose: method for dequeue the element
		 * 
		 * @return	returns the element which is deleted
		 */
		public T deQueue() {
			@SuppressWarnings("unchecked")
			T data = (T) queue[front];
			if (!isEmpty()) {
				front = (front + 1) % 5;
				size = size - 1;
			} else {
				System.out.println("Queue is empty nothing to delete");
			}

			return data;

		}

		/**
		 * Purpose: method for showing the whole queue
		 */
		public void show() {
		
			int length = queue.length;
			int count = rear;
			if (isFull()) {
				while (length > 0) {
					System.out.print(queue[count] + " ");
					count++;
					if (count == 7) {
						count = 0;
					}
					length--;
				}
			} else {
				for (int i = 0; i < size; i++) {
					System.out.print(queue[(front + i) % 7] + " ");
				}
			}

		}

		/**
		 * Purpose: method for getting size of queue
		 * 
		 * @return		returns the size of queue
		 */
		public int getSize() {
			return size;
		}

		/**
		 * Purpose: method for checking queue is empty
		 * 
		 * @return	returns true if empty else returns false
		 */
		public boolean isEmpty() {
			return getSize() == 0;
		}

		/**
		 * Purpose: method for checking queue is full
		 * 
		 * @return	returns true if full else returns false
		 */
		public boolean isFull() {
			return getSize() == 5;
		}

}
