package com.saisree.bitmanipulation;

public class CountSetBitsInANumber 
{
	public static int countSetBits(int n)             //count set bits in a number.
    {
        int count = 0;
        while(n > 0)
        {
            if((n & 1) != 0)
            {
                count ++;

            }

            n = n>>1;
        }

        return count;

    }

    public static void main(String args[])
    {
        System.out.println(countSetBits(16));

    }

}
