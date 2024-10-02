package com.saisree.loops;
import java.util.*;
public class WhileLoop
{
	public static void main(String args[]) 
	{
		 int counter = 0;
	        while(counter < 10)
	        {											 // printing hello world using While loop 
	            System.out.println("Hello World");
	            counter++;
	        }                        

	        System.out.println("Printed HW 10x");
	        

	        System.out.println("---------");
	        
	        
	        
	        
	        System.out.println("Printing 1 to 10 using while loop");
	        counter = 1;
	        while(counter <= 10)
	        {									   //printing numbers from 1 to 10 using while loop
	            System.out.print(counter + " ");
	            counter ++;
	        }                           
	            System.out.println();

	            System.out.println("---------");
	            
	            
	            
	            
	            System.out.println("printing numbers in range");
	            System.out.println("Enter number");
	            
	            Scanner sc = new Scanner(System.in);
	            
	            int range = sc.nextInt();
	            counter = 1;
	            while(counter <= range){                    // printing numbers in range
	                System.out.print(counter + " ");
	                counter ++;
	            }                           
	                System.out.println();
	                
	                
	                System.out.println("---------");
	                
	                

	                System.out.println("sum of first n natural numbers");
	                System.out.println("Enter number");
	                int n = sc.nextInt();
	                int sum = 0;

	                int i = 1;
	                while(i <= n){                  // sum of first n natural numbers.
	                    sum = sum + i;
	                    i++;
	                }
	                 System.out.println("sum is : " +  sum);
	                 
	                 
	                 
		             System.out.println("-------------");
	                 
	                 
		             
		             System.out.println("printing square using while loop");
	                 int line = 1;
	                 while(line <= 4){                         //print square using while loop.
	                     System.out.println("****");
	                     line ++;
	                 }


		
	}

}
