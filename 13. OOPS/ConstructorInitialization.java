package com.saisree.oops;

public class ConstructorInitialization 
{

    public static void main(String args[])
    {
        Student2 s1 = new Student2("Phani");                 //Constructor initialization.
        System.out.println(s1.name); 
    }
}


class Student2
{
    String name;
    int roll;

    Student2(String name)                        //Constructor
    {
        this.name = name;

    }

}
