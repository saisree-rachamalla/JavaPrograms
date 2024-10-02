package com.sai.sree.arrays;

public class UpdateFunction 
{
	 public static void update(int marks[], int nonChangable){
	        nonChangable = 10;
	        for(int i=0; i<marks.length; i++){
	            marks[i] = marks[i] + 1;          //  Changing the values of array in the 'update' function 
	        }                                     //    and which gets even updated in the main function.
	    }                                         //   Because Array uses Pass by Reference.
		public static void main(String[] args) {
			int marks[] = {97,98,99};
			int nonChangable = 5;
			update(marks,nonChangable);          //   But nonChangable value will not get updated in the main function, 
			System.out.println(nonChangable);    //   because it is Pass by value.
			
			//Print our marks
			for(int i=0; i<marks.length; i++){
			    System.out.print(marks[i] + " ");
			}
			System.out.println();
		}

}
