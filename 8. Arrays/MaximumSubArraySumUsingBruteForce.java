

public class MaximumSubArraySumUsingBruteForce 
{
	 public static void maxsubarraysum(int numbers[])
	 {         
		 					       //Maximum Sub Array Sum - Brute Force

	        int currsum = 0;
	        int maxsum = Integer.MIN_VALUE;

	        for(int i=0; i<numbers.length;i++)
	        {
	                int start = i;
	            for(int j=i; j<numbers.length;j++)
	            {
	                int end = j;
	                currsum = 0;
	                for(int k=start; k<=end ; k++)
	                {

	                    currsum += numbers[k];
	                }
	                    System.out.println(currsum);
	                    if(maxsum < currsum)
	                    {
	                        maxsum = currsum;
	                    }
	                
	            }
	        }    
	    System.out.println("Maximum sum = " + maxsum);
	    }
	    public static void main(String args[]){
	        int numbers[] = {2,4,6,8,10};
	        maxsubarraysum(numbers);
	    }

}
