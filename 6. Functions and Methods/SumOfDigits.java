
import java.util.*;
public class SumOfDigits 
{
	 public static int sumDigits(int n)
	 {
	        int sumOfDigits = 0;
	        while(n > 0)
	        {
	            int lastDigit = n % 10;
	            sumOfDigits += lastDigit;
	            
	             n /= 10;
	       
	        }
	        return sumOfDigits;
	       
	    }
	 
		public static void main(String[] args) 
		{
		    
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Input an integer");
		  
		  int number = sc.nextInt();
		  System.out.println("The sum is " + sumDigits(number));
			
		}

}
