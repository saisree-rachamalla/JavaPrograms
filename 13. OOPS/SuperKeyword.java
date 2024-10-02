package com.saisree.oops;

public class SuperKeyword 
{
	 public static void main(String args[])
	    {
	        Horseo h = new Horseo();
	       System.out.println(h.color);

	    }

	}

	class Animalo
	{
	    String color;

	    Animalo()
	    {
	        System.out.println("animal constructor is called");

	    }

	}

	class Horseo extends Animalo
	{
	    Horseo()
	    {
	        super();                   //super keyword is used to refer immediate parent class object.
	        super.color = "brown";
	        System.out.println("horse constructor is called");

	    }


}
