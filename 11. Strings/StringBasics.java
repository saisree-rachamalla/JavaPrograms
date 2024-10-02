package com.saisree.strings;
import java.util.*;
public class StringBasics 
{
	  public static void main(String args[])
	    {
	        char arr[] = {'a', 'b', 'c', 'd'};         
	        String str = "abcd";
	        String str2 = new String("xyz");

	        // Strings are IMMUTABLE

	        Scanner sc = new Scanner(System.in);                // Taking Input from user
	        String name;

	        name = sc.nextLine();
	        System.out.println(name);


	        String fullName = "Tony Stark";
	        System.out.println(fullName.length());                // String Length


	        String firstName = "Sai Sree";
	        String lastName = "Rachamalla";
	        String fullname = firstName + " " + lastName;             //String Concatenation
	        System.out.println(fullname);




	        String firstname = "Saraswathi";
	        String lastname = "Thummarulu";
	        String Fullname = firstname + " " + lastname;                //String charAt() 
	        System.out.println(Fullname.charAt(0));



	        printLetters(Fullname);          //Printing  each letters of String using charAt() Function.
	    }


	    public static void printLetters(String str)   //Function of Printing each letters of String using charAt()
	    {
	        for(int i=0;i<str.length();i++)
	        {
	            System.out.print(str.charAt(i)+ " ");
	        }
	        System.out.println();

	    }

}
