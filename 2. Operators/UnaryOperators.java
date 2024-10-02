package com.saisree.operators;

public class UnaryOperators 
{
	public static void main(String args[]) 
	{
		  
		
	        System.out.println("pre increment");
	        int a = 10;
	        int b =  ++a;                          //Unary operator -> pre increment 
	        System.out.println(a);
	        System.out.println(b);
	        
	        
	        
	        System.out.println("post increment");
	         a = 10;
	         b =  a++;                          // Unary operator -> post increment 
	        System.out.println(a);                
	        System.out.println(b);
	        
	        
	
	        System.out.println("pre decremenrt");
	         a = 10;
	         b = --a;                          // Unary operator -> pre decrement 
	        System.out.println(a);                
	        System.out.println(b);
	
	        
	
	        System.out.println("post decrement");
	         a = 10;
	         b = a--;                           //Unary operator -> post decrement 
	        System.out.println(a);                
	        System.out.println(b);
	        
		    
		
	}

}
