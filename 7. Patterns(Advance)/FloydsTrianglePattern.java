package com.saisree.patternspartwo;

public class FloydsTrianglePattern 
{
	 public static void floyds_triangle(int n){
	      int counter = 1;
	     //outer loop
	      for(int i = 1; i<=n; i++){
	          // inner loop - how many times will counter be printed.
	          for(int j = 1; j <= i; j++){
	              System.out.print(counter + " ");              
	              counter++;
	              
	          }
	          System.out.println();                       // Floyds_triangle Pattern
	      }                                                  //    1
	  }                                                       //   2 3 
		public static void main(String[] args) {          //   4 5 6 
		    floyds_triangle(4);                            //  7 8 9 10 
		    
		}

}
