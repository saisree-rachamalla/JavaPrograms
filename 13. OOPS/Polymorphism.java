package com.saisree.oops;

public class Polymorphism 
{
	  public static void main(String args[])                           //Polymorphism
	    {
	        Calculator cal = new Calculator();
	        System.out.println(cal.sum(1,2));
	        System.out.println(cal.sum((float)1.5, (float)2.5));
	        System.out.println(cal.sum(1 , 2, 3));
	        
	        
	        
	        Deer d = new Deer();
	        d.eat();
	    }
	}


	class Calculator
	{
	    int sum(int a, int b)                //Method Overloading --> which is also "Complile Time Polymorphism"  
	    {
	        return a + b;
	    }

	    float sum(float a, float b)
	    {
	        return a + b;
	    }

	    int sum(int a, int b, int c)
	    {
	        return a + b + c;
	    }
	    
    }
	
	
	

	class Anim
	{
	    void eat()
	    {
	        System.out.println("eats anything");
	    }
	}                                    //Method Overriding --> which is also "Run Time Polymorphism"
	
	class Deer extends Anim
	{
	    void eat()
	    {
	        System.out.println("eats grass");
	
	    }
	}
