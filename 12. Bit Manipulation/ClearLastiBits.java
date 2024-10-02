package com.saisree.bitmanipulation;

public class ClearLastiBits 
{
	public static int clearIthBit(int n, int i)          //clear last i Bits
    {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String args[])
    {
        System.out.println(clearIthBit(15,2));

    }

}
