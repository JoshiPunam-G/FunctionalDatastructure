

/**  Purpose: representation of the decimal number typed as the input.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   14-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.algorithmic;

public class BinToDec {
	public static void main(String[] args) {
		
		//BinToDec b=new BinToDec();
		System.out.println("Binary to Decimal Conversion is:"+getDecimal(111));
		

	}
	
	
	
 /*private static void getDecimal(int binary) {
		 int decimal=0;
			int n=0;
			while(true)
			{
			if(binary==0)
			{
				break;
			}
			else
			{
			    int temp=binary%10;
			    decimal+=(int) (temp*Math.pow(2, n));
				binary =binary/10;
				n++;
		
			}
			
			}
			return;
			
	 }*/



	public static int getDecimal(int binary)
	    {  
	        int decimal = 0;  
	        int n = 0;  
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
	

}
