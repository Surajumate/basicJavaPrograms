/******************************************************************************
 *  Purpose: Determine the replace string
 *
 *  @author surajumate
 *  @version 1.0
 *  @since   28-07-201  
 ********************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility; 
public class gambler 
{
	public static void main(String[] args) 
	{
		System.out.println("enter stake");
		int stake=Utility.integerInput();
		System.out.println("enter goal");
		int goal=Utility.integerInput();
		System.out.println("enter trial");
		int trial=Utility.integerInput();
		Utility.gambler(stake,goal,trial);
		
		
		
		
	}

}
