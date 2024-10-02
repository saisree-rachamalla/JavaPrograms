package com.saisree.bitmanipulation;

public class SetithBit 
{
	 public static int setIthBit(int n, int i)         //Set ith Bit(means make ith bit as 1)
	    {
	        int bitMask = 1<<i;
	        return (n | bitMask);

	    }
	    public static void main(String args[])
	    {
	        System.out.println(setIthBit(10,0));

	    }

}
