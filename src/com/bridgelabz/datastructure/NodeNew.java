package com.bridgelabz.datastructure;

public class NodeNew<T> {
	
	public NodeNew<T> next;
	public T data;
	public Integer key;
	public NodeNew(T data) {
		this.data=data;
	}
	public NodeNew(Integer key, T data) {
		this.key=key;
		this.data=data;
	}

}
