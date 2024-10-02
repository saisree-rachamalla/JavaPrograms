package com.sai.sree.javabasics;

public class TernaryOperator 
{
	public static void main(String args[]) 
	{
		 
        System.out.println("Ternary operator");
        
        System.out.print(" Checking num is even or odd using ternary operator  --->  ");
        int number = 7;

        String type = (number%2 == 0) ? "EVEN" : "ODD";         // Ternary operator
        System.out.println(type);                
       

        System.out.println("-----------------------");
        
        
        
        
        System.out.print(" Checking student will pass or fail using ternary operator  --->  ");
        int marks = 31;
        String ReportCard = (marks >= 33) ? "PASS" : "FAIL";      //check if a student will pass or fail using ternary operator.
        System.out.println(ReportCard);


		
	}

}
