package com.sai.sree.oops;

public class HierarchialInheritance 
{
	  public static void main(String args[])
	    {
	        Bird pigeon = new Bird();                             //Hierarchial Inheritance
	        pigeon.eat();

	        Fish whale = new Fish();
	        whale.breathe();

	    }
}

	//Base class
	class Ani
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
	class Mammall extends Ani
	{
	    void walk()
	    {
	        System.out.println("walks");
	    }
	}

	//Derived class of Animal 
	class Fishh extends Ani
	{
	    void swim()
	    {
	        System.out.println("swims");
	    }
	}

	//Derived class of Animal 
	class Bird extends Ani
	{
	    void fly()
	    {
	        System.out.println("fly");
	    }
	}

