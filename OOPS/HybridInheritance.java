package com.sai.sree.oops;

public class HybridInheritance 
{
	 public static void main(String args[])
	    {
	       Whale whal = new Whale();                               //Hybrid Inheritance
	       whal.swim(); 

	       Peacock peacoc = new Peacock();
	       peacoc.fly();

	       Dogg blanco = new Dogg();
	       blanco.walk();
	    }
	}

	//Base class
	class Anima
	{
	    String color;

	    void eat()
	    {
	        System.out.println("eats");
	    }

	    void breathe()
	    {
	        System.out.println("breathes");
	    }
	}


	//Derived class of Animal
	class Fis extends Anima
	{
	    void swim()
	    {
	        System.out.println("swims");
	    }
	}

	//Derived class of Fish
	class Whale extends Fis
	{
	    int fins;
	}

	//Derived class of Animal
	class Birds extends Anima
	{
	    void fly()
	    {
	        System.out.println("fly");
	    }
	}

	class Peacock extends Birds
	{
	    void dance()
	    {
	        System.out.println("dance");
	    }
	}

	//Derived class of Animal
	class Mamma extends Anima
	{
	    void walk()
	    {
	        System.out.println("walks");
	    }
	}

	//Derived class of Mammal
	class Dogg extends Mamma
	{
	    String breed;
	}
