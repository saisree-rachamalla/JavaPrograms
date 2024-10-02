package com.sai.sree.functions;

public class PrimeOrNot 
{
	 public static boolean isPrime(int n){
	       boolean isPrime = true;   
	       for(int i = 2; i<= n-1; i++){
	           if(n % i == 0){      //completely dividing.                   // Prime or Not.
	               isPrime = false;
	               break;
	           }
	       }
	       return isPrime;
	   }
		public static void main(String[] args) 
		{
			System.out.println(isPrime(12));
			

        }
}