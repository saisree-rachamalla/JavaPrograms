package com.sai.sree.bitmanipulation;

public class ClearBitsInRange 
{
	public static int clearBitsinRange(int n, int i, int j)      //clear bits in range (from i to j)
    {
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }


    public static void main(String args[])
    {
        System.out.println(clearBitsinRange(10, 2, 4));
    }

}
