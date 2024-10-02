

public class AbstarctClassAndAbstarctFunctions 
{
	 public static void main(String args[])
	    {
	        Horse h = new Horse();             // Implementing Abstarct class and Abstarct Functions
	        h.eat();
	        h.walk();

	        Chicken c = new Chicken();
	        c.eat();
	        c.walk();

	    }
	}

	abstract class Animal                                    // Abstract class
	{
	    void eat()
	    {
	        System.out.println("eats");
	    }

	    abstract void walk();                                 //Abstarct Function
	}

	class Horse extends Animal
	{
		
	    void walk()
	    {
	        System.out.println("walks on 4 legs");

	    }
	}

	class Chicken extends Animal
	{
	    void walk()
	    {
	        System.out.println("walks on 2 legs");

	    }

}
