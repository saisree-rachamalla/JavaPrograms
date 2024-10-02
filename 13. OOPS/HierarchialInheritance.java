

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
	class Animal
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
	class Mammal extends Animal
	{
	    void walk()
	    {
	        System.out.println("walks");
	    }
	}

	//Derived class of Animal 
	class Fishh extends Animal
	{
	    void swim()
	    {
	        System.out.println("swims");
	    }
	}

	//Derived class of Animal 
	class Bird extends Animal
	{
	    void fly()
	    {
	        System.out.println("fly");
	    }
	}

