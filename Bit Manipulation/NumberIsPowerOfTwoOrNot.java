package com.sai.sree.bitmanipulation;

public class NumberIsPowerOfTwoOrNot 
{

    public static boolean isPowerOfTwo(int n)         //check if a number is power of 2 or not.
    {
        return (n & (n-1)) == 0;
    }

    public static void main(String args[])
    {
        System.out.println(isPowerOfTwo(29));

    }

}
