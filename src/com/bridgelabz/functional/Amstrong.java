package com.bridgelabz.functional;

public class Amstrong {

	public static void main(String[] args) {
		System.out.println("Amstrong Number");
		int num=153 , rem ,res = 0 ;
		
		while(num!=0)
		{
			rem=num%10;
			res=(rem*rem*rem)+res;
			num=num/10;
			
		}
		System.out.println(res);
		
	}

}
