package com.saisree.basicsorting;
import java.util.*;
public class SortingAnArrayInReverseOrder 
{
	public static void printArr(Integer arr[])
	{
        for(int i =0 ; i<arr.length;i++)
        {
            System.out.print(arr[i] + " " );
        }

    }


    public static void main(String args[])
    {
        Integer arr[]= {29,12,30,25,17,13,06};          // we use Integer arr[] instead of small int, 
        Arrays.sort(arr, Collections.reverseOrder());   // because reverseOrder() function always works on objects.
        printArr(arr);                                  // Does not work on int arr[], because it is a 
                                                        // primitive data type(which is basic)
    }

}



/*
	java uses comaparator in inbuilt sorting.
	 
	comparator
 	public static int compare(int a, int b)
  {
	  a < b ---> -ve (return negative)
	  a == b ----> 0 (return zero)
	  a >b  ----> +ve (return positive)
	 return a - b;   // (in increasing order)
	 return b - a;   //(in decreasing order) ---> while using Collections.reverseOrder() function.  
   } 
*/

