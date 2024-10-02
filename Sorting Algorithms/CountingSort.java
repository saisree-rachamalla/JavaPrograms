package com.sai.sree.basicsorting;

public class CountingSort 
{
	  public static void countingSort(int arr[])          //  Counting Sort, conting how many 
	    {                                                //  times the number has occired in the array
	        int largest = Integer.MIN_VALUE;             // Input = int arr [] = {1,4,1,3,2,4,3,7};
	        for(int i =0; i<arr.length;i++)               // Output = 1 1 2 3 3 4 4 7 
	        {
	            largest = Math.max(largest, arr[i]);

	        }

	        int count[] = new int[largest+1];
	        for(int i = 0; i<arr.length;i++)
	        {
	            count[arr[i]]++;
	        }

	        //sorting
	        int j = 0;
	        for(int i=0;i<count.length;i++)
	        {
	            while(count[i] > 0)
	            {
	                arr[j] = i;
	                j++;
	                count[i]--;

	            }
	        }
	    }

	    public static void printArr(int arr[]){
	        for(int i =0; i<arr.length;i++){
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String args[]){
	        int arr [] = {1,4,1,3,2,4,3,7};
	        countingSort(arr);
	        printArr(arr);
	    }

}
