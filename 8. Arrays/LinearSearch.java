

public class LinearSearch 
{
	 public static int LinearSearch(int numbers[], int key)
	 {
	        for(int i = 0; i<numbers.length;i++)
	        {
	            if(numbers[i] == key)
	            {
	                return i;
	            }                               // Linear Search using Function.
	        }
	        return -1;
	    
	 }
		public static void main(String[] args) 
		{
		    int numbers[] = {2,4,6,8,10,12};
		    int key = 10;
			int index = LinearSearch(numbers,key);
			if(index == -1)
			{
			    System.out.println("Not Found");
			}
			else 
			{
			    System.out.println("key found at index :" + index);
			}
		}

}
