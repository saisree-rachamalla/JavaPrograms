package com.saisree.functions;

public class FunctionOverloadingUsingParameters 
{
	// Function to cal sum of 2 nums
    public static int sum(int a, int b){
        return a + b;
    }                                         //Function Overloading Using Parameters.
    
  // Function to cal sum of 3 nums
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
	public static void main(String[] args) {
		System.out.println(sum(3,5));
		System.out.println(sum(5,2,3));
	}

}
