package com.bridgelabz.datastructure;

public class NodeOrder {
	
	public String data1;
	public int data;
	public Node next;
	
	//constructor
	public NodeOrder()
	{
		this.next=null;
	}

	public void setData(String data1)
	{
		this.data1=data1;
		next=null;
	}
	
	public void setData(int data)
	{
		this.data=data;
		next=null;
	}

}
