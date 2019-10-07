package com.bridgelabz.functional;

public class Test {

	public static void main(String[] args) {
		String str="ABBAAABA";
		char[] ch=str.toCharArray();
		int l=str.length();
		int count=0;
		int flag=0;
		if(l%2==0)
		{
			 for(int i=count;i<ch.length-1;i++)
		       {
			    if((str.charAt(i)=='A' && str.charAt(i+1)=='B') || (str.charAt(i)=='B' && str.charAt(i+1)=='A') )
			    {
                   flag=1;	
                  
			    }
			    else
			    {
			    	flag=0;
			     
			    }
			    count=count+2;
		       }
				if(flag==1)
				{
					System.out.println("true");
					
				}
				else
				{
					System.out.println("false");
				}
		}
		else
		{
 		System.out.println("string invalid");
		}
	}

}
