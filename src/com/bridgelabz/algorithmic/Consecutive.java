package com.bridgelabz.algorithmic;

public class Consecutive {

	public static void main(String[] args) {
		String s="ABABAAABBBB";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				System.out.println("False");
			}
			else
			{
				System.out.println("True");
			}
		}
		

	}

}
