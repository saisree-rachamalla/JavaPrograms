package com.saisree.oops;

public class MultiLevelInheritance 
{

    public static void main(String args[])
    {
        Dog blanco = new Dog();
        blanco.eat();                                              //Multi level Inheritance
        blanco.legs = 4;
        System.out.println(blanco.legs);

    }

}


//Base class or parent class
class Animall
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


//Derived class  or Child class or subclass
class Mammal extends Animall
{
    int legs;
}

                                                                
//Derived class  of Mammal
class Dog extends Mammal
{
    String breed;

}


