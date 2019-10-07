package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.NodeNew;

public class LinkedStack<T> {

	NodeNew<T> head;
	
	public void add(T data) {
		NodeNew<T> n = new NodeNew<T>(data);
		if(head==null)
			head=n;
		else {
			n.next=head;
			head=n;
		}
	}
	
	public void display() {
		NodeNew<T> t=head;
		while(t!=null) {
			System.out.println(t.data);
			t=t.next;
		}
	}
	
	public void remove() {
		NodeNew<T> t=head;
		head = t.next;
	}
	public Integer pop(){
		NodeNew<T> t=head;
		Integer temp = (Integer) t.data;
		head = t.next;
		return temp;
	}
	
	public static void main(String[] args) {
		LinkedStack<Integer> l = new LinkedStack<Integer>();
		l.add(2);
		l.add(10);
		l.add(5);
		l.display();
		System.out.println("==");
		l.display();
	}
}
