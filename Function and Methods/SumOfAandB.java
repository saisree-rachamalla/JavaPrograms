package com.sai.sree.functions;
import java.util.*;
public class SumOfAandB 
{
	 public static int calculateSum(int a, int b){
	        
	        int sum = a + b;
	        
	        return sum;
	    }
		public static void main(String[] args) {                //  Sum of a and b using Function.
		    Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int sum = calculateSum(a,b);
	        System.out.println("sum is : " + sum);

	        
		}

}
