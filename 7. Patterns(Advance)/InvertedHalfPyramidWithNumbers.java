package com.saisree.patternspartwo;

public class InvertedHalfPyramidWithNumbers 
{
	 public static void inverted_half_pyramid(int n){
	      // outer loop
	      for(int i = 1; i <= n; i++){
	          for(int j = 1; j <= n-i+1; j++){
	              System.out.print(j + " ");              // Inverted Half Pyramid with Numbers.
	          }                                              
	          System.out.println();                        //  1 2 3 4 5 
	      }                                                //  1 2 3 4
	  }                                                    //  1 2 3
		public static void main(String[] args) {           //  1 2
		    inverted_half_pyramid(5);                      //  1
		    
		}

}
