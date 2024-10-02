package com.saisree.strings;

public class ComparingStrings 
{
	 public static void main(String args[])
	    {
	        String s1 = "Tony";
	        String s2 = "Tony";
	        String s3 = new String("Tony");

	        if(s1 == s2)                                     //Comparing the Strings using "==" Symbol.
	        {                                                 // it gives the output as Strings are equal.
	            System.out.println("Strings are equal");
	        }
	        else
	        {
	            System.out.println("Strings are not equal");
	           
	        }


	        if(s1 == s3)
	        {
	            System.out.println("Strings are equal");
	        }                                                   // it gives the output as Strings are not equal.
	        else                                               //because in Strings when you want to compare 
	                                                            //2 Strings you have to use .equals() function. 
	        {                                                    // But if you use "==" symbol the s2 String 
	            System.out.println("Strings are not equal");         //will be pointing to the s1 String which
	        }                                                        //is already created in the memory.
	           




	        if(s1.equals(s3))                                   //Comparing the Strings using .equals() function.
	        {                                                   //Which checks value of the strings.
	            System.out.println("Strings are equal");
	        }
	        else
	        {
	            System.out.println("Strings are not equal");
	           
	        }
	 

	    }

}
