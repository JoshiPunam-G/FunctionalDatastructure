/**  Purpose: Program for Merge sort
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   20-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.algorithmic;

public class MergeSort {
	
	int[] array;
	int[] temparray;
	int length;

	public static void main(String[] args) {
	    MergeSort m=new MergeSort();
		int[] input= {48,36,13,52,19,94,21};
		m.sort(input);
		int low=0, high=input.length;
		for(int i:input)
		{
			System.out.println(i+"");
		}
		
	}
	
	public void sort(int[] input)
	{
		this.array=input;
		this.length=input.length;
		this.temparray=new int[length];
		divideArray(0,length-1);
	}
	
	public void divideArray(int low, int high)
	{
		
		if(low<high)
		{
			int mid=low+(high-low)/2;
			
			divideArray(low,mid);//sort left side of an array(recursion)
			
		    divideArray(mid+1,high);//sort right sideof an array
		    
		    mergeArray(low,high,mid);
		}
	}
	
	public void mergeArray(int low ,int high, int mid)
	{ 
		for(int i=low;i<=high;i++)
		{
			temparray[i]=array[i];
		}
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<=mid && j<=high)
		{
			if(temparray[i]<=temparray[j])
			{
				array[k]=temparray[i];
				i++;
			}
			else
			{
				array[k]=temparray[i];
				j++;
			}
			k++;
		}
		while(i<=mid)
		{
			array[k]=temparray[i];
			k++;
			i++;
		}
	}
}

