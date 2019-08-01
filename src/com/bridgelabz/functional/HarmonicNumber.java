/******************************************************************************
 *  
 *  Purpose:Determine the harmonic number 
 *
 *  @author surajumate
 *  @version 1.0
 *  @since   28-07-2019
 ****
 ***************************************************************************/

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class HarmonicNumber 
{
	public static void main(String[] args) 
	  {
		  System.out.println("enter harmonic number");
		  double result=Utility.integerInput();
		 System.out.println("Number"+result);
		 Utility.harmonicNumber(result);
      } 
}


