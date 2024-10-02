package com.saisree.conditionalstatements;
import java.util.*;
public class IfElse 
{
	public static void main(String args[]) 
	{
		
	
		 System.out.print("if else conditional statements  ---> ");
		 
		 int age = 16;
         if(age >= 18)                                   //if else conditional statement.
         {
             System.out.println("adult: drive, vote");
         }
         if(age > 13 && age < 18)
         {
             System.out.println("teenager");         
         }

         else {
             System.out.println("not adult");

         }
         
         
         System.out.println("------");
         
         
         
         

         System.out.print("largest of 2 numbers ---> ");
         int E = 10;
         int F = 5;                                        // largest of 2 numbers.

         if(E >= F)
         {
             System.out.println("E is largest of 2");
         }                                            
         else 
         { 
             System.out.println("F is largest of 2");
         }
         
         
         System.out.println("------");
         
         
         
         System.out.print(" Checking Number is odd or eve ---> Enter Number");
         
         
         Scanner sc = new Scanner(System.in);
        
         int number = sc.nextInt();          

         if(number % 2 == 0)
         {                                  // Number is odd or even.
             System.out.println("EVEN");
         } else 
         {
             System.out.println("ODD");
         }
         

         System.out.println("------");
         
         
       
         System.out.println("Number is positive or negative.");
         System.out.println("Enter any number +ve or -ve ");
          int n = sc.nextInt();

         if(n > 0)
         {                                //print whether the number is positive or negative.
             System.out.println("Positive Number");
         }
         else
         {
             System.out.println("Negative Number");
         }

         
         System.out.println("------");
         
         
         
         
         System.out.print("checking whether you have fever or not");
         double temp = 103.5;
         if(temp > 100)
         {
             System.out.println("You have a fever");
         }                                                 //checking whether you have fever or not.
         else 
         {
             System.out.println("You don't have a fever");
         }
         
         
         System.out.println("-------");
         
         
         
         
         System.out.print("year is a leap year or not");
         System.out.print("Enter Year");
         
         int year = sc.nextInt();
         if(year % 4 == 0 && year % 100 !=0 && year % 400 == 0 )
         {
             System.out.println("Leap Year");
         }                                           //print whether that year is a leap year or not

         else
         {                                   
             System.out.println("Not a leap Year");
         }
         
         
         System.out.println("-------");
         
       
         
         
         System.out.print("else if conditional statement  ---> ");
         age = 13;
         if(age >= 18)
         {
             System.out.println("Adult");
         }
         else if(age >=13 && age < 18) 				 //else if conditional statement.
         {                                       
             System.out.println("teenager");
         } 
         else 
         {
             System.out.println("Child");
         }
         

         System.out.println("-------");
         
      
         
         System.out.print("Largest of 3 numbers  ---> ");
         int C = 1, B = 3, A = 6;

         if(A >= B  && A >= C)
         {
             System.out.println("largest is A");
         }                                                 //Largest of 3 numbers.
         else if(B >= C)
         {
             System.out.println("largest is B");
         }
         else 
         {
             System.out.println("largest is C");
         }
         
         
         System.out.println("-----------------------");
       

	}

}
