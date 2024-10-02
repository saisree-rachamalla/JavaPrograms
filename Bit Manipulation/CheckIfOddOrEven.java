package com.sai.sree.bitmanipulation;

public class CheckIfOddOrEven 
{
	public static void oddOrEven(int n)                       //Check if odd or even
    {
        int bitMask = 1;
        if((n & bitMask) == 0)
        {
            System.out.println("Even Number");
        }
        else 
        {
            System.out.println("Odd Number");
        }

    }

    public static void main(String args[])
    {
        oddOrEven(2);
        oddOrEven(25);
        oddOrEven(12);

    }

}
