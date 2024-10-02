package com.saisree.variables;

import java.util.*;


public class VariablesAndDataTypes 
{
	public static void main(String[] args) 
	{
		

	        int a = 10;
	        int b = 5;
	        System.out.println(a);
	        System.out.println(b);
	        
	        System.out.println("-----------------------");
	        
	        
	
	        String name = "Tony Stark";
	        System.out.println(name);
	        
	        System.out.println("-----------------------");
	
	        a = 50; 
	        System.out.println(a);
	
	        a = b;
	        System.out.println(a);
		    
	        System.out.println("-----------------------");
	        
	        
		    int c = 10;
		    int d = 5;
		    int sum = c + d;
		    System.out.println(sum);
		    
		    System.out.println("-----------------------");
		    
		    
		    
	
		                         
		    int $ = 29;        				 //  No, the statement will not give any error.
		    System.out.println($);	  	    //  Names of variables are called identifiers in Java.
											// Identifier rule says,identifier scan start with any alphabet
										    // or underscore (“_”) or dollar (“$”). 
										    // According to the rule the given variable name is a valid identifier.
															              
					               
		    System.out.println("-----------------------");
	    
	
	
		    
		    
			Scanner sc = new Scanner(System.in); 
	
			 System.out.print("Enter a word");
		    String input = sc.next();            //.next() is input for single word.
		    System.out.println(input);
	
			/* String Name = sc.nextLine();     // .nextLine is input for multiple words, multiple line and for paragraphs.
		      System.out.println(Name);
		      */
		    System.out.println("-----------------------");
		    
		    
		    
		    
		    
		    System.out.print("Enter number");
		      int number = sc.nextInt();         // .nextInt() is input for integer.
		      System.out.println(number);
		
		   System.out.println("-----------------------");
		   
		   
		   
		   
		   System.out.println("Enter 'A' value");
		     int A = sc.nextInt();
		     
		     System.out.println("Enter 'B' value");
		     int B = sc.nextInt();
		     
		     System.out.println("Enter 'C' value");
		     int C = sc.nextInt();
		     
		    
		     int Sum = A + B;							 	//	sum of A and B.
		     int product = A * B;							// product of A and B.
		     int avg = (A + B + C) / 3;          			 // Average of 3 numbers.
		     
		     System.out.print("Sum of a and b ---> ");
		     System.out.println(Sum);
		     
		     System.out.print("product of a and b ---> ");
		     System.out.println(product);
		     
		     System.out.print("Average of a,b and c---> ");
		     System.out.println("average is : " + avg);  
		                     
	        
		   System.out.println("-----------------------");
		   
		   
		   
		   
		   
		   System.out.println("Calculating area of circle");
		   System.out.print("Enter float value");
		     float rad = sc.nextFloat();    
		     float area = 3.14f * rad * rad;              // area of circle 
		     System.out.println(area);
		     
		    System.out.println("-----------------------");
		    
		    
		    
		    
		    
		    System.out.println("Calculating Area of square");
		    System.out.print("Enter int value");
		    int side = sc.nextInt();                                     //Area of square.
	        int Area = side * side;        
	        System.out.println("area of the square is : " + Area);
	        
	        
		    System.out.println("-----------------------");
		    
		    
		    
		    
		    
		    System.out.println("Calulating total cost of pencil, pen, eraser with tax");
		    
		    System.out.print("Enter pencil value in float");
	        float pencil = sc.nextFloat();
	        
	        System.out.print("Enter pen value in float");
	        float pen    = sc.nextFloat();   
	        
	        System.out.print("Enter eraser value in float");
	        float eraser = sc.nextFloat();
	        
	        float total_cost = pen + pencil + eraser;           
	        System.out.println("Bill is : " + total_cost); 
	
	        //Add on - with 18% tax
	        float newTotal = total_cost + (0.18f * total_cost);
	        System.out.println("Bill with 18% tax : "  + newTotal);
	        
	        System.out.println("-----------------------");
	        
	  

	}


}
