/******************************************************************************
 *  
 *  Purpose:Determine powerof2
 *
 *  @author surajumate
 *  @version 1.0
 *  @since   28-07-2019
 ****
 ***************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class PowerOf2 
{
public static void main(String[] args) 
{

	System.out.println("Enter number");
	int number=Utility.integerInput();
	System.out.println("Number:"+number);
	Utility.powerOf2(number);

}
}
