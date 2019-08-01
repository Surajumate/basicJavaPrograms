package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility 
{
	
	/**
	 * purpose:this method accepts two input arguments and replaces the original string 
	 * with user entered string.
	 * @param originalString
	 * @param user
	 */
	static Scanner scanner = new Scanner(System.in);
	public void replaceString(String originalString,String user)
	{
		if(user.length()<3) 
		{
			System.out.println("INVALID INPUT\n(name should contain atleast 3 character)");
		} 
		else 
		{
			originalString=originalString.replaceAll("<<username>>",user);
			System.out.println(originalString);
		}
	
	}
	public static int integerInput()
	{
		int integerValue = scanner.nextInt();
		return integerValue;
	}
	public String stringInput()
	{
		String stringValue = scanner.next();
		return stringValue;
	}
	/**
	 * purpose: Number of time coin will be flip
	 * @param number
	 */
	public static void flipCoin(int number) {
		int head=0;
		int tail=0;
		for(int i=0;i<number;i++) 
		{
			if(Math.random()>0.5) 
			{
				head++;
				System.out.println("head"+head);
            }
			else 
			{
				tail++;
				System.out.println("tail"+tail);
			}	
		}
		float phead;
		float ptail;
		phead=(float)head/number*100;
		ptail=(float)tail/number*100;
		System.out.println("no of phead"+phead);
		System.out.println("no of ptail"+ptail);
	}
	
	/**
	 * purpose:The number trial win the cash and number of trial loss cash and number of trial
	  completed my goal
	 * @param stake
	 * @param goal
	 * @param trial
	 */
	public static void gambler(int stake,int goal,int trial)
	{

		int win=0,loss=0,total=0;
		for(int i=0;i<trial;i++) 
		{
			int cash=stake;
			while(cash>0&&cash<goal)
			if(Math.random()>0.5) 
			{
				cash++;
			}
			else 
			{
				cash--;

				
			}	
			
			if(cash==goal) 
			{
				 win++;

						
			}
					else 
					{
						loss++;
				    }
		}
		System.out.println("win"+ win +"out of "+trial);
		System.out.println("loss"+loss+"out of"+trial);
		double totalwin=(double)win/trial*100;
		double totalloss=(double)loss/trial*100; 
		System.out.println("total no win"+totalwin);
		System.out.println("total no loss"+totalloss);
	}
	/**
	 * purpose:Enter 4digit number &creat leap year
	 * @param year
	 */
	public static void leapYear(int year)
	{
		
		if(year%4==0) 
		{
			if(year%100==0) 
			{
				if(year%400==0) 
				{
					System.out.println("leap year");
				}
				else 
				{
					System.out.println("not leap year");
			    }
			}
				else 
				{
					System.out.println("leap year");
				}
		}
			    else 
			    {
			    	System.out.println("not leap year");
			    }
			
		
	}
	/**
	 * purpose:To creat power of 2
	 * @param number
	 */
	public static void powerOf2(int number) 
	{

	int power=1;
	for(int i=1;i<=number;i++) 
	{
		power=power*2;
		
	}
	System.out.println(power);
}
	/**
	 * purpose:To accept the input and to show till the number of i
	 * @param result
	 */
	public static void harmonicNumber(double result) 
	{
		 double h=0;
		  for(double i=1;i<=result;i++)
		  {
			  h=h+1/i;
		  }
		   System.out.println(h);
		  
	}
	public static void factor(int number) 
	{
		for(int i=2;i<=number;i++) 
		{
			while(number%i==0);
			{
				System.out.println(i+"");
				{
					number=number/i;
					
				}
			}
		}
        if(number>2) 
        {
        	System.out.println(number+"");
        	
        }


	}
	
}
  




