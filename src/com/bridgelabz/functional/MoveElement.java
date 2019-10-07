package com.bridgelabz.functional;

public class MoveElement {

	public static void main(String[] args) {
		int[] arr= {1,0,6,0,1,0,4,8};
		int n=arr.length;
		int count=0;
		int temp;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count=count+1;
			}
		}
		
		System.out.println("After Moving Elements");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}

	}

}
