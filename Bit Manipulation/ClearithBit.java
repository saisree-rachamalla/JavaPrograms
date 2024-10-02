package com.sai.sree.bitmanipulation;

public class ClearithBit 
{
	 public static int clearIthBit(int n, int i)      //Clear ith Bit (means make ith bit as 0)
	    {
	        int bitMask = ~(1<<i);
	        return n & bitMask;

	    }
	    public static void main(String args[])
	    {
	        System.out.println(clearIthBit(10,1));

	    }

}
