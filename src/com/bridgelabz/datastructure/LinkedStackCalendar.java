package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.NodeNew;

public class LinkedStackCalendar<T> {
	
	NodeNew<T> head;
	
	public void add(Integer temp) {
		NodeNew<T> n = new NodeNew(temp);
		if(head==null)
			head=n;
		else {
			n.next=head;
			head=n;
		}
	}
	public void display() {
		NodeNew<T> t=head;
		int i=1;
		while(t!=null) {
			Integer value = (Integer) t.data;
			if(!value.equals(-1)) 
			{
				if(value<10)
					System.out.print(t.data+"  ");
				else
					System.out.print(t.data+" ");
			if(i%7==0)
				System.out.println();
			}
			else {
				System.out.print("   ");
			}
			t=t.next;
			i++;
			
		}
	}
	public void remove() {
		NodeNew<T> t=head;
		head = t.next;
	}

}
