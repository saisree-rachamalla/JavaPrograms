package com.saisree.strings;

public class StringIsPalindromeOrNot 
{
	public static boolean isPalindrome(String str)    //Checking whether if a String is palindrome or not.
    {
        for(int i=0; i<str.length();i++)
        {
          
            if(str.charAt(i) != str.charAt(str.length()-1-i))
            {
                //not a palindrome condition
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]){
        String str = "amma";
        System.out.println(isPalindrome(str));
    }

}
