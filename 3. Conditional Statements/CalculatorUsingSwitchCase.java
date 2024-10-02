
import java.util.*;
public class CalculatorUsingSwitchCase 
{
	public static void main(String args[]) 
	{
		 
			Scanner sc = new Scanner(System.in);
	    
	       System.out.println("enter a : ");
	       int a = sc.nextInt();
	       System.out.println("enter b : ");
	       int b = sc.nextInt();
	       System.out.println("enter operator : ");
	       char operator = sc.next().charAt(0);

	       switch(operator)
	       {                                      //calculator using switch case.
	           case '+' : System.out.println(a+b);
	                       break;
	           case '-' : System.out.println(a-b);
	                       break;
	           case '*' : System.out.println(a*b);
	                       break;
	           case '/' : System.out.println(a/b);
	                       break;
	           case '%' : System.out.println(a/b);
	                       break;
	           default  : System.out.println("wrong operator");

	       }
	       
		
	}

}
