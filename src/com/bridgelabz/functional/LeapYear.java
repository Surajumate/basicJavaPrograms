/******************************************************************************
 *  
 *  Purpose:Determine the leap year
 *
 *  @author surajumate
 *  @version 1.0
 *  @since   28-07-2019
 ****
 ***************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class LeapYear 
{
public static void main(String[] args) 
{
	System.out.println("Enter year ");
	int year=Utility.integerInput();
	System.out.println("Number:"+year);
	Utility.leapYear(year);
}
	
}