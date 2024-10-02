package com.saisree.oops;

public class SettersAndGetters 
{
	 public static void main(String args[])
	    {
	        P p1 = new P();
	        p1.setColor("Blue");
	        System.out.println(p1.getColor());

	        p1.setTip(5);
	        System.out.println(p1.getTip());

	        p1.setColor("Yellow");
	        System.out.println(p1.getColor());
	    

	    }
	}

	class P
	{
	    String color;
	    int tip;

	    String getColor()                          //Setters and Getters
	    {
	        return this.color;
	    }

	    int getTip()
	    {
	        return this.tip;
	    }

	    void setColor(String newColor)
	    {
	        this.color = newColor;

	    }

	    void setTip(int tip)
	    {
	        this.tip = tip;
	    }


}
