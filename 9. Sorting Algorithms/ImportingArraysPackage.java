package com.saisree.basicsorting;
import java.util.Arrays;    			//Importing Arrays Package instead of *
public class ImportingArraysPackage 
{
	public static void printArr(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,8,2};
        Arrays.sort(arr);                                    //Inbuilt Sort
        printArr(arr);
    }

}
