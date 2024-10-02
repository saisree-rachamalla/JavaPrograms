package com.saisree.oops;

public class PrintConstructorThree 
{

    public static void main(String args[])
    {
        Stu s1 = new Stu();                            
        Stu s2 = new Stu("Raminenni");
        Stu s3 = new Stu(29);

        System.out.println(s3.roll);           // to print the roll of constructor 3 in the main function.

    }

}


class Stu
{
    String name;
    int roll;

    Stu()                                      //Non-Parameterized Constructor
    {
        System.out.println("constructor is called...");
    }

    Stu(String name)                             //Parameterized Constructor
    {
        this.name = name;
        System.out.println(name);                   //to print the name in here in constructor.

    }
    Stu(int roll)                                //Parameterized Constructor
    {
        this.roll = roll;

    }

}
