

public class GetLargest 
{
	public static int getLargest(int numbers[])
	{
        int largest = Integer.MIN_VALUE;  // -infinity
        int smallest = Integer.MAX_VALUE;   
        
        for(int i =0; i<numbers.length;i++){
            if(largest < numbers[i]){               // To find Largest number in the array. 
                largest = numbers[i];
            }
            
            if(smallest > numbers[i]){              //  To find smallest number in the array
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
          return largest; 
    }
	public static void main(String[] args) 
	{
	    
	    int numbers[] = {1,2,6,3,5};
	     System.out.println("largest value is : " + getLargest(numbers));
	    
	}

}
