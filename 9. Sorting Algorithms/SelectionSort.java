

public class SelectionSort 
{
	public static void selectionSort(int arr[])
	{                  				 //Selection Sort
        for(int i=0;i<arr.length-1;i++){
            int minpos = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minpos] < arr[j]){          // if we change the < symbol to > symbol it will print,
                    minpos = j;                    // the output in increasing order. like  "1 2 3 4 5"
                }
            }
            //swap 
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);



    }

}
