package com.sai.sree.functions;
import java.util.*;
public class AvgOfThreeNumbers 
{
	  public static double avg(double x, double y, double z)
	  {
	      
	       return (x+y+z)/3;                        // Average of three numbers using function.
	       
	   }
		public static void main(String[] args) 
		{
		    
		    Scanner sc = new Scanner(System.in);
	        System.out.println("Enter x");
		    double x = sc.nextDouble();
		    System.out.println("Enter y");
	        double y = sc.nextDouble();
	        System.out.println("Enter z");
	        double z = sc.nextDouble();
			
			System.out.println("Average is " + avg(x,y,z));
			
		}

}
