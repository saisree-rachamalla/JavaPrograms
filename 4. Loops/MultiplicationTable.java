
import java.util.*;
public class MultiplicationTable 
{
	public static void main(String args[]) 
	{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();                           //Multiplication Table.

        for(int i = 1; i <= 10; i++){
            System.out.println(n +  " * "+ i + " = " + n*i);
        }

		
	}

}
