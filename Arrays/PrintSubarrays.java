package com.sai.sree.arrays;

public class PrintSubarrays 
{

	public static void printSubarrays(int numbers[])
   {                                                                         //PrintSubarrays
     int ts = 0;
    for(int i = 0;i<numbers.length;i++)
    {
        int start = i;
          for(int j = i;j<numbers.length;j++)
          {
              int end = j;
              
              for(int k =start; k<=end;k++)
              {
                  System.out.print(numbers[k] + " ");
              }
              ts++;
              System.out.println();
          }
          System.out.println();
        }
        System.out.println("total subarrays = " + ts);
 }
	public static void main(String[] args) {
		int numbers[] = {2,3,4,5,6};
		printSubarrays(numbers);
	}
}
