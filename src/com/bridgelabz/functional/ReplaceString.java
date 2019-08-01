/******************************************************************************
 *  Purpose: Determines the replace string 
 *
 *  @author surajumate
 *  @version 1.0
 *  @since   28-07-201  
 ********************************************************************************/



package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class ReplaceString 
{
	

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		String originalstring="Hello <<username>> How are you?";
		System.out.println("Enter user name");
		String name=scanner.next();
		utility.replaceString(originalstring,name);
		scanner.close();
	}
}