
import java.util.*;
public class FactorialOfNumber 
{
	public static void main(String args[]) 
	{
		 Scanner sc = new Scanner(System.in);
	        int num;
	        int fact = 1;                                        //Factorial of a number.

	        System.out.println("Enter positive number");
	        num = sc.nextInt();

	        for(int i = 1; i <= num; i++)
	        {
	            fact *= i; 
	        }

	        System.out.println("Factorial : " + fact);

		
		
	}

}
