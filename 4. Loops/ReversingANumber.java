package com.saisree.loops;

public class ReversingANumber 
{
	public static void main(String args[]) 
	{
		
		 System.out.println("print reverse of a number");
	        int  n = 10899;
	
	        while(n > 0)
	        {
	            int lastDigit = n % 10;             // print Reverse of a number.
	            System.out.print(lastDigit);
	            n = n / 10;   // n/=10
	        }
	        System.out.println();
	        
	        
	        System.out.println("----------");
	        

	        
	        System.out.println("Reverse the given number");
	        n = 10899;
	        int rev = 0;

	        while(n > 0)
	        {                             // Reverse the given number.
	            int lastDigit = n % 10;
	            rev = (rev * 10) + lastDigit;
	            n = n / 10;
	        }
	        System.out.println(rev);


		
	}

}
