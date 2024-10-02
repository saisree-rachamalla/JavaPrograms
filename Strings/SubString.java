package com.sai.sree.strings;

public class SubString 
{
	public static String substring(String str, int si, int ei)      
    {
        String substr = "";                      //printing the substring using normal function.
        for(int i=si; i<ei; i++)
        {
            substr+= str.charAt(i);

        }
        return substr;

    }
    public static void main(String args[])
    {
        //substring
        String str = "HelloWorld";
        System.out.println(str.substring(0,5));    //substring using inbuilt substring function.
        System.out.println(substring(str,0,4));   // printing the substring using normal function.

    }

}
