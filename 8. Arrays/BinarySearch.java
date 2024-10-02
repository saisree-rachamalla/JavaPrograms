
public class BinarySearch 
{
	 public static int BinarySearch(int numbers[],int key)
	 {
	       int start = 0, end = numbers.length-1;
	       
	       while(start <= end){
	           int mid = (start + end)/2;                  //Binary Search Using Arrays and Functions.
	           
	           //comparisons
	           if(numbers[mid] == key)
	           { //found
	               return mid;
	           }
	           
	           if(numbers[mid] < key)
	           { // right -> 2nd half
	               start = mid + 1;
	           }
	           else
	           {
	               end = mid - 1;
	           }
	       }
	       return -1;
	   }
		public static void main(String[] args) 
		{
		    
		    int numbers[] = {2,4,6,8,10,12};
		    int key = 2;
		     System.out.println("index of key is : " + BinarySearch(numbers,key));
		    
		}

}
