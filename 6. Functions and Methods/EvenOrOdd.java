package com.saisree.functions;
import java.util.*;
public class EvenOrOdd 
{
	 public static boolean isEven(int n){
	      
	       if(n % 2 == 0){                  //  Checking if number is even or odd.
	           return true;
	       }
	       else{
	           return false;
	       }
	       
	   }
		public static void main(String[] args) {
		    
		    Scanner sc = new Scanner(System.in);
	        System.out.println("Enter n");
		    
	        int num = sc.nextInt();
			
		    if(isEven(num)) {
		        System.out.println("Number is Even");
		    }
		    else {
		        System.out.println("Number is Odd");
		    }
		    
			
		}

}
