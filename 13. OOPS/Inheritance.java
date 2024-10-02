

public class Inheritance 
{
	 public static void main(String args[])
	    {
	        Fish shark = new Fish();                      
	        shark.eat();
	    }

	}

	//Base Class or parent class                                  //Inheritance 
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


	//Derived class or sub class or child class                    //Single level Inheritance
	class Fish extends Animal
	{
	    int fins;

	    void swim()
	    {
	        System.out.println("swims in water");

	    }

}
