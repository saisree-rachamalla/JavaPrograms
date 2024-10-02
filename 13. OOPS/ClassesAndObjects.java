package com.saisree.oops;

public class ClassesAndObjects 
{
	 public static void main(String args[])
	    {
	        Pen p1= new Pen();                           //Classes and Objects.
	        p1.setColor("Blue");
	        System.out.println(p1.color);

	        p1.setTip(5);
	        System.out.println(p1.tip);

	        p1.color = "Yellow";
	        System.out.println(p1.color);

	        

	        BankAccount myAcc = new BankAccount();             //Example of Access Modifier.
	        myAcc.username = "sai sree";
	        // myAcc.password = "abcde";                 //This line shows error because password is private thing in BankAccount class.
	        myAcc.setPassword("abcde");

	    }

	}


	class BankAccount
	{
	    public String username;                         //Access Modifiers
	    private String password;

	    public void setPassword(String pwd){
	        password = pwd;
	    }

	}




	class Pen                                                           //Classes and Objects.
	{
	    String color;                                           
	    int tip;

	    void setColor(String newColor)
	    {
	        color = newColor;
	    }

	    void setTip (int newTip)
	    {
	        tip = newTip;
	    }

	}

	class Stud
	{
	    String name;
	    int age;
	    float percentage;  //cgpa

	    void calcPercentage(int phy, int chem, int math)
	    {
	        percentage = (phy + chem + math) / 3;
	    }

}
