
/**  Purpose: representation of the decimal number typed as the input.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   14-08-2017
 *
 ******************************************************************************/

//*********************Decimal To Binary Conversion*****************

package com.bridgelabz.algorithmic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Binary {


	private static int temp;
	
	static String result;

	public static void main(String arg[]) 
	{   
		//------accepting input----------
		int num;
		System.out.println("Enter number");
		
		Scanner sc=new Scanner(System.in);
		
	    num=sc.nextInt();
	    
		int[] rem=new int[8];
			
		Binary b=new Binary();
		
		Binary.toBinary(rem, num);
		
		//Binary.toDecimal();

		Binary.showArr(rem);
	}
	
	
	
	/* Decimal to binary Conversion */
	static int[] toBinary(int[] rem ,int num)
	{
		   
		
		    int i,j,k;
		    
			int l=0;
			
			l=rem.length;
			
			String str="";
			
			System.out.println(" Decimal to Binary Conversion of " +num+ " is");
			
			//int low=0,high=l-1,mid;
			int count=0;
			
			while(num>0)
			{
				rem[count]=num%2;
				
				count++;
				
				num=num/2;
			}
			
		
			for( i=rem.length-1;i>=0;i--)
			{
				str=str+rem[i];
			}
			
			System.out.println("Before swappnig:"+str);
			
			int n=str.length();
			
			String str1="";
			
			String str2="";
			
			char[] ch=str.toCharArray();
			
		    for( i=0;i<n/2;i++)
		    {
		    	str1=str1+ch[i];
		    }
		    
		    for(j=n/2;j<=n-1;j++)
		    {
		    	str2=str2+ch[j];
		    }
			
		    result=str2.concat(str1);
		    
			System.out.println("");
			
		return rem;

	}

	
	/*public static int toDecimal(int num)
	{
	        int decimal = 0;  
	        int num = 0;  
	        while(true){  
	          if(binary == 0)
	          {  
	            break;  
	          }
	          else 
	          {  
	              int temp = binary%10;  
	              decimal += temp*Math.pow(2, n);  
	              binary = binary/10;  
	              n++;  
	           }  
	        }  
	        return decimal;  
    }  
		*/
	
	
	static void showArr(int[] rem) {
		
		System.out.println("After Swappnig:"+result);
		
		//System.out.println("Before Swappnig:"+);
	}
 
	
}
