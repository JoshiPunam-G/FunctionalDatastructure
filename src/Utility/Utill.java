package Utility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Utill {
	
	static Scanner sc=new Scanner(System.in);
	
	public static int isInteger()
	{
		return sc.nextInt();
	}
	
	public static String isString()
	{
		return sc.nextLine();
	}
	
	public static double isDouble()
	{
		return sc.nextDouble();
	}
	
	public static float isFloat()
	{
		return sc.nextFloat();
	}
	public static String isChar()
	{
		return sc.next();
				
	}
	

	
	
	
	/**
	 * Function For Replace String
	 * 
	 * @param s1
	 */
	
	public static void isName(String s1)
	{
		
		 
		if(s1.length()>=3)
		{
			System.out.println("Hello "  +s1+  " How are you?");
		}
		else
		{
			System.out.println("invalid string");
		}
	
	}
	
	/**
	 * Function For percentage of Heads and Tails.
	 * 
	 */
	
	public void isFlip()
	{
		int Count= 1;
		double result;
		int newhead=0;
		int newtail=0;
        int n=2;
		for(int i=1;i<=n;i++)
		{
		result = Math.random();
		if(result <= 0.5)
		{
		System.out.println("fliped is heads.");
		newhead++;
		}
		else
		{
		System.out.println("fliped is tails.");
		newtail++;
		}
		
		}
		System.out.println("Newhead count:"+newhead);
		System.out.println("Newtail count:"+newtail);
		
		System.out.println("---Average of Coin is---");
		
		int h=(newhead/n)*100;
		System.out.println("Average of Head Coin is: "+h);
		
		int t=(newtail/n)*100;
		System.out.println("Average of Tail Coin is: "+t);
	
	}
	
	
	/**
	 * Function For Determining if it is a Leap Year or not..
	 * 
	 * @param year
	 */
	
	
	public static boolean isLeapYear(int year)
	{
		
		if(year>999 && year<9999)
		{
		  if( (year%4==0 && year%100!=0 )|| year%400==0   )
		  {
			 System.out.println(true);
			 
		  }
		 else
		 {
			System.out.println( false);
		 }
		}
		else
		{
			System.out.println("invalid year");
		}
		return false;
	}
	
	
	/**
	 * Function For finding Power of 2
	 * 
	 * @param n
	 */
	
	public static void isPower(int n)
	{
		  int i = 0;                
	        int powerval = 1;       
	        // repeat until i equals n
	        if(n>0 && n<31)
	        while (i <= n) 
	        {
	            System.out.println( " 2^"+i + " Power Value " + powerval);  
	            powerval = 2 * powerval;               
	            i++;
	        }
	}
	
	/**
	 * Function for Calculating Harmonic Number.
	 * 
	 * @param number
	 */
	
	public static void isHarmonic(int number)
	{
		double HarmonicNum=0;
		double i;
	 if(number!=0)
	{
		//for(i=1;i<=number;i++)
		
		    	/*if(i!=number)
	     		{
			    	System.out.print(" 1/" +i+ " + ");
	     		}
		    	else if(i==number)
		    	{
		    		System.out.print(" 1/"+ i );
		    	}*/
			
			for(i=1;i<=number;i++)
			{
				HarmonicNum=HarmonicNum+(1/i);
			}
			System.out.println("Harmonic Number is:"+HarmonicNum);

	}
	 else
	 {
		 System.out.println("invalid number");
	 }
	
		
	}
	
	
	/**
	 * Function for Factors
	 * 
	 * @param num
	 */
	
	public static void isFactor(int num)
	{
		int i;
		while(num%2==0)
		{
			System.out.println(2+ "");
			num/=2;
		}
		for(i=3;i<Math.sqrt(num);i+=2)
		{
		  if(num%i==0 )
		  {
			System.out.println(i+" ");
			num=num/i;
		  }
		}
		if(num >2) 
		{
	         System.out.println(num);
	    }
	}
	
   /**
    * Function for calculating Number of Wins and Percentage of Win and Loss.
    * 
    * @param stake
    * @param goals
    * @param trial
    */
	
	public static void isGambler(int stake,int goals ,int trial)
	{
		int i;
		 int bets=0,win=0,cash;
		// while(stake<=goals)
		 
			for(i=0;i<trial;i++)
			{
				cash=stake;
				while(cash>0  && cash<goals)
				{
					bets++;
					if(Math.random()<0.5)
					{
						cash++;
						bets++;
					}
					else
					{
						cash--;
						bets++;
						
					}
				}
				  if (cash == goals) {
					  win++;
					 // System.out.println(win); 
				  }
				  else
				  {
					  win--;
				//System.out.println();
				  }
			}
		 
			int percentwin=100*win/trial;
			
			int loss=100-percentwin;
			
			System.out.println(win + " wins of " + trial);
			
			 System.out.println("Percent of games win   = " + percentwin);
			
			System.out.println("Percentage of loss:"+loss);
		    
		    System.out.println("Avg  bets              = " + bets / trial);
	}
	
	
	/**
	 * Function to generate random number and to process distinct coupons.
	 * @return 
	 * 	
	 */
	public static String isCoupon()
	{
       /* String ch="0123456789";
        char[]	arr=ch.toCharArray();
		
		int max=1000;
		
		for(int i=0;i<arr.length;i++)
	    {
			 arr[i] =arr[Math.random()ch];
     	}*/
		
		    char[] chars = "1234567890".toCharArray();
		    
	        StringBuilder sb = new StringBuilder();
	        
	        Random random = new Random();
	        
	        for (int i = 0; i <chars.length; i++)
	        {
	           // Random random = null;
	        	
				char c = chars[random.nextInt(chars.length)];
				
	            sb.append(c);
	        }
	        String output = sb.toString();
	        
	        System.out.println(output);
	        
	        return output ;
	
	}
	
	
	/**
	 * Function For 2D Array
	 * 
	 * @param m
	 * @param n
	 */
	
	public static void isArray(int m, int n)
	{
		int i,j;
		
		int [][] a = new int[m][n];
		
		double[][] b = new double[m][n];
		
		boolean [][] c = new boolean[m][n];
		
		//accepted int array
		
		System.out.println("--Enter Integer array--");
		
		for( i=0;i<m;i++)
		{
			for( j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		//acceepted double array
		System.out.println("--Enter Double array--");
		
		for( i=0;i<m;i++)
		{
			for( j=0;j<n;j++)
			{
		
				b[i][j]=sc.nextDouble();
			}
		}
		
		//accepted boolean array
		System.out.println("--Enter Boolean array--");
		
		for( i=0;i<m;i++)
		{
			for( j=0;j<n;j++)
			{
				c[i][j]=sc.nextBoolean();
			}
		}
		
		//printing int array
		
		System.out.println("--2D Integer Array--");
		for( i=0;i<m;i++)
		{
			//System.out.println("--");
			for( j=0;j<n;j++)
			{
			  System.out.print("\t"+a[i][j]+"");
			}
			System.out.println("\t");
		}

		
		
		//printing double array
		System.out.println("--2D Double Array--");
		for( i=0;i<m;i++)
		{
			for( j=0;j<n;j++)
			{
				System.out.print("\t"+b[i][j]+"");
			}
			System.out.println("\t");
		}
		
		//printing boolean array
		System.out.println("--2D Boolean Array--");
		for( i=0;i<m;i++)
		{
			for( j=0;j<n;j++)
			{
		
				System.out.print("\t"+c[i][j]+"");
			}
			System.out.println("\t");
		}

	}
	
	
	
	/**
	 * Function for calculating Sum of three Integer adds to ZERO
	 * 
	 * @param array
	 */
	
	public static void isSum(int[] array,int num)
	{	
        for(int i=0;i<num;i++)
        {
        	array[i]=Utill.isInteger();
        }
	
		for (int i = 0; i <num; i++) 
	    {
	        HashSet<Integer> set = new HashSet<Integer>();
	    	   
	           int a=array[i];
	           
	           for (int j=i+1; j<array.length; j++) 
	           {
	               int b=array[j];
	              
	               int c=-(a+b);
	           
	               if(set.contains(c))
	               {
	                   //System.out.println("Found 3 elements whose sum is = 0");
	                   
	                   System.out.println("Elements are " + a + " " + b + " " + c);
	                   
	                   
	               }
	               else
	                   set.add(b);
	           }
	          // System.out.println(count);
	    
	       }
	}
		
	
	
	/**
	 * Function for printing the Euclidean distance from the point (x, y) to the origin (0, 0).
	 * @param x
	 * @param y
	 */
	
	public static void isCalculate(int x,int y)
	{
		double Distance=Math.sqrt(x*x+y*y);
		System.out.println( "distance from (" + x + ", " + y + ") to (0, 0) = " + Distance);
	}
	
	/**
	 *  permutation of a String using iterative method
	 * @param inputString
	 * @param outputString
	 */
	 
	
	public static void isPermute(String inputString, String outputString)
	{
		
		if(inputString.length()==0)
		{
			System.out.println(outputString);
			return ;
		}
		for(int i=0;i<inputString.length();i++)
		{
			char first=inputString.charAt(i);
		    String result=inputString.substring(0, i)+inputString.substring(i+1);
			//System.out.println(outputString);
			isPermute(result,outputString+first);
		}
	}
	

	
	/**
	 * Function for Stopwatch Program
	 */
	public static long startWatch(long startTime)
	{
    	startTime=System.currentTimeMillis();
    	System.out.println(startTime);
    	return startTime;
    }
    
    public static long stopWatch(long stopTime)
    {
         stopTime=System.currentTimeMillis();
         System.out.println(stopTime);
		return stopTime;
    }
    
    public static void Elapsed(long startTime,long stopTime,long elapsed)
    {
    	 elapsed=(startTime-stopTime);
    	System.out.println(elapsed);
    }
	
	/**
	 * Function for Tic-Toc-Toe 
	 */
	
	
     /**
      * function to find the roots of the equation a*x*x + b*x + c.
         Since the equation is x*x, hence there are 2 roots.
      * @param a
      * @param b
      * @param c
      */
    
    public static void isQuadratic(int a, int b, int c)
    {
    	if(a<b && c>b )
    	{
    	double delta=((Math.pow(b, b))-(4*a*c));
		double Root1=(-b + Math.sqrt(delta))/(2*a);
		double Root2=(-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("Root1--"+Root1);
		System.out.println("Root2--"+Root2);
    	}
    	else
    	{
    		System.out.println("invalid value");
    	}

    }
	
	
	/**
	 *  Function for printing the wind chill.
	 * @param t
	 * @param v
	 */
	 
	public static void isWind(int t, int v)
	{
    if(t<50  && (v<120 && v>3))
	{
		double w=((35.74 + 0.6215*t) + (0.4275*t-35.75*Math.pow(v, 0.16)));		
	    
		System.out.println("Windchill :"+w);

	}
	else
	{
		System.out.println("value are not in range");
		}
	
	}
	
	
	
	
	
	
	
	//***************************Algorithm Programs ********************************
	
	/**
	 * Function for Anagram
	 */
	
	
	public static boolean isAnagram(String s1 ,String s2)
    {
    	char[] str1=s1.toCharArray();
    	char[] str2=s2.toCharArray();
    	int flag=0;
    	
    	if(s1.length()!=s2.length())
    	{
    		System.out.println("String is not equal");
    	}
    	else
    	{
    		for(int i=0;i<s1.length();i++)
        	{
        		for(int j=i+1;j<s2.length();j++)
        		{
        			if(s1.charAt(i)==s2.charAt(i))
        			{
        				flag=1;
        			
        			}
        		}
        		
        	}
    	}
    	if(flag==1)
    	{
    		System.out.println("String is Anagram");
    	}
    	else
    	{
    	    System.out.println("String is not Anagram");	
    	}
		return false;
    }
    
    	
    	
   /**
    * Function for finding prime number between range.
    * @param a
    * @param b
    */
	
	public static void isRange(int a , int b)
	{
		int i,j,count=0;
		if(a>=1)
		{ System.out.println(2);
       
          for(i=a;i<b;i++)
		{
			for(j=2;j<i;j++)
			{
			 if(i%j==0)
			 {
				count=0;
				 break;
			 }
			 else
			 {
				 count=1;
			 }
			
			}
			if(count==1)
			{
				System.out.println(i);
			}
		 }
       }
	}
      
	
	
	
	/**
	 * Function for integer binary search
	 * @param a
	 * @param left
	 * @param right
	 * @param x
	 * @return
	 */

	public int integerBinary(int[] a, int left, int right, int x) {
		int mid;
		if(right>=left)
		{
			 mid=left+(right-left)/2;
			 
			 if(a[mid]==x)
				 return mid;
			 
			 if(a[mid]>x)
				 return integerBinary(a ,left ,mid-1 ,x );
			 
			 else
				 return integerBinary(a ,mid+1,right ,x );
		}
		return x;
		
	}

	 
	public static void stringBinary(int left,int right, String[] sArray)
	{
		int result = 0;
		String x=" ";
		
	   while(left<=right)
	  {
		int mid=left+(right-left)/2;
		
		result = x.compareTo(sArray[mid]);
		
		 if(result==0)
			 System.out.println("Element found at index"+mid);
		 else
			  System.out.print("Element not present");
		 if (result > 0) 
             left = mid + 1;
		 
		 else
             right = mid - 1; 
   }
	}
		
	
  
   /**
    * Sorting Function insertion sort
    * @param arr
    */
	
	  public static void sort(int arr[])
	   { 
		   int n = arr.length; 
          for (int i = 1; i < n; ++i) 
          { 
            int key = arr[i]; 
            int j = i - 1; 

           while (j >= 0 && arr[j] > key) 
           { 
              arr[j + 1] = arr[j]; 
              j = j - 1; 
           } 
           arr[j + 1] = key; 
          } 
	   }
	  
	  
	  /**
	   *   printing Function insertion sort
	   * 
	   * @param arr
	   */
	   public static void printArray(int arr[])
	   {
		   int n = arr.length;
		   System.out.println("Sorted Elements are:");
	        for (int i = 0; i < n; ++i) 
	        System.out.println(arr[i] + " "); 
	        System.out.println();
	   }

	
	   /**
	    * Sorting Function For Insertion Sort
	    * @param arr
	    * @return
	    */
	   
	   public static String[] sort(String arr[])
		{
		 String temp="";
		 for(int i=0;i<arr.length-1;i++)
		  {
			for(int j=i+1;j<arr.length;j++)
			{
			  if(arr[i].compareToIgnoreCase(arr[j])>0)
			  {
			    temp = arr[i];
			    arr[i]=arr[j];
			    arr[j]=temp;
			  }
			}
		  }
		 return arr;
		 
		}
			
	   /**
		 * Function integer bubble sort
		 * 
		 * @param a
		 */
	   
	   public static void intBubble(int[] a)
	   {
		   int i,j;
	       for(i=0;i<a.length;i++)
		   {
			  a[i]=sc.nextInt();
		   }
		   for(i=0;i<a.length;i++)
		   {
		 	  for(j=1;j<a.length-i;j++)
		 	  {
		 		  if(a[j-1]>a[j])
		 		  {
		 			  int temp=0;
		 			  temp=a[j-1];
		 			  a[j-1]=a[j];
		 			  a[j]=temp;
		 		  }
		 	  }	
		   }
	   }
	   
	   /**
	    * Function for StringBubbleSort
	    * @param str
	    * @param n
	    */
	   
	  
	  public static void stringBubble(String[] str,int n)
	  {
		  int i,j;
	     for(i=0;i<str.length;i++)
		 {
			for(j=0;j<str.length-1;j++)
			{
				if (str[j].compareTo(str[j+1])> 0) {
					String temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
	  }
	  
	 
	  /**
	   * Function for guess number.
	   * @param low
	   * @param up
	   * @param mid
	   * @param count
	   * @param inputstring
	   * @param n
	   */
	  public static void cheking(int low,int up,int mid,int count,String inputstring,int n)
		{
			

	       	System.out.println("Is your number:"+mid);
			System.out.println();
			System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
			   inputstring=sc.nextLine();
	       	do
	        {
	            if (inputstring.equals("high"))
	            {
					low= mid;
					count++;
	            }
				else if (inputstring.equals("yes"))
	            {
					System.out.println("The number you thought was: "+mid);
					int no=count+1;
					System.out.println("It takes "+no+" times to find your exact number");
					break;
	            }
				else if(inputstring.equals("low"))
	            {
					up=mid;
					count++;
				}
	            if(count<n)
	            {
					mid=(low+ up+1)/2;
					System.out.println("Is your number "+mid+":");
				   inputstring=sc.nextLine();
				}
			}while(low<=up);
				if (count>n)
				{
					System.out.println("Number not found");
				}
				else
				{
					//System.out.println("Number not found");
					System.exit(0);
				}
		}

	public static int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Purpose : Find Prime number Between 0 - 1000.
	 * @param number
	 * @return
	 */
	
	public static boolean PrimeLogic(int number)
	{
		if( number==0 || number==1)
		{
			return false;
		}
		else
		{
			for(int i=2;i<number;i++)
			{
				if(number %i==0)
				{
					return false;
				}
			}
		}
		return true;
		
	}
	
	/**
	 * Purpose : find Anagram taking two input string.
	 * @param str1
	 * @param str2
	 * @return
	 */
	
	public static boolean isAnagram1(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		if (str1.length() != str2.length() || str1.equals(str2)) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}
		
	
	/**
	 * Purpose: Method for DayOfWeek 
	 * @param d
	 * @param m
	 * @param y
	 * @return
	 */

	public static int dayOfWeek(int d,int m, int y) 
	{
		d = 1;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	
	

	/**
	 * Finding if a year is Leap Year or not
	 * 
	 * @param year
	 * @return true if year is leap and false if year is not leap year
	 */
	public static boolean leapYear(int year)
	{
		if (year % 100 != 0 && year % 4 == 0)
		{
			return true;
		} 
		else if (year % 100 == 0 && year % 400 == 0) 
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	/**
	 * method for calendar
	 * @param month
	 * @param year
	 * @return
	 */
	
	public static int[][] calenderQueue(int month, int year) {
		
		int year1, month1, x, day = 1, day1;
		year1 = year - (14 - month) / 12;
		x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
		month1 = month + 12 * ((14 - month) / 12) - 2;
		day1 = (day + x + (31 * month1) / 12) % 7;
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] monthDays = { 0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int monthDay = 0;
		for (int i = 0; i < monthDays.length; i++) {
			if (i == month - 1) {
				monthDay = monthDays[i];
			}
		}
		int[][] totalDays = new int[6][7];
		boolean leap = isLeapYear(year);
		if (leap && month == 1) {
			monthDay = 29;
		}
		int z = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < day1) {
					totalDays[i][j] = -1;
				} else if (z <= monthDay) {
					totalDays[i][j] = z;
					z++;
				} else {
					totalDays[i][j] = -1;
				}
			}
		}
		for (int i = 0; i < 12; i++) {
			if (month == i + 1) {
				System.out.print(monthName[i] + " " + year);
			}
		}
		System.out.println();
		return totalDays;

	}

}
