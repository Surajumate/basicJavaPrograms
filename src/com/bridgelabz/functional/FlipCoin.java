/******************************************************************************
 *  
 *  Purpose:The number of time to flip coin
 *
 *  @author surajumate
 *  @version 1.0
 *  @since   28-07-2019
 ****
 ***************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
	public class FlipCoin 
	{
		public static void main(String[] args) 
		{
			
			System.out.println("enter number");
			int number=Utility.integerInput();
			System.out.println("Number:"+number);
			Utility.flipCoin(number);
			
			
					
			
		}

	}



