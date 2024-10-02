
import java.util.*;
public class EvenSumAndOddSumUsingDoWhileLoop 
{
	public static void main(String args[]) 
	{

        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        
        do{
            System.out.println("Enter the number");
            number = sc.nextInt();

            if(number % 2 ==0 )
            {
                evensum += number;                          // EvenSum and OddSum.
            }
            else
            {
                oddsum += number;                            
            }

            System.out.println("Do you want to continue? Press 1 for yesor 0 for no");

            choice = sc.nextInt();

        }while(choice==1);

        System.out.println("Sum of even numbers sum: " + evensum);
        System.out.println("Sum of odd numbers sum: " + oddsum);
		
	}

}
