

public class AbstractClass 
{
	 public static void main(String args[])
	    {
	        Mustang myHorse = new Mustang();        //Abstract class implementing constructor of 
	        //Animal -> Horse -> Mustang          // abstract class and each class.

	    }
	}
	//Base class 
	abstract class Animal
	{
		String color;
	    Animal()
	    {
	        System.out.println("animal constructor is called");

	    }
	    void eat()
	    {
	        System.out.println("eats");
	    }

	    abstract void walk();

	}
	//Derived class of Animal
	class Horse extends Animal
	{
	    Horse()
	    {
	        System.out.println("Horse constructor is called");
	    }

	    void changeColor()
	    {
	        color = "dark brown";
	    }

	    void walk()
	    {
	        System.out.println("walks on 4 legs");
	    }

	}
	
	//Derived class of Horse
		class Mustang extends Horse
		{
		    Mustang()
		    {
		        System.out.println("Mustang constructor is called");

		    }
		}

	
	class Chickenn extends Animal
	{
		void changeColor()
	    {
	        color = "yellow";
	    }
		
		void walk()
	    {
	        System.out.println("walks on 4 legs");
	    }

	}
	
	
