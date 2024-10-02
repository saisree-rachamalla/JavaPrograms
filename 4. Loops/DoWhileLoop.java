
import java.util.*;
public class DoWhileLoop 
{
	public static void main(String args[]) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		 
		  int counter = 1;
	        do{                                          // Hello world using do-while loop.
	            System.out.println("Hello World");
	            counter ++;
	        }while(counter <= 10);
	        
	        
	        System.out.println("--------------");
	        
	        
		 
		 /*  Question regarding break keyword - keep entering numbers 
		     till user enters a multiple of 10.   */
		 
	        do{
	            System.out.println("enter your number : ");
	            int n = sc.nextInt();

	            if(n % 10 == 0)
	            {						 
	                break;                  
	            }                                     
	            System.out.println(n);
	        }while(true);


	        System.out.println("--------------");
	        System.out.println("--------------");
	        
	        
	        /* Question regarding continue keyword - Display all numbers 
	   	        entered by user except multiples of 10.   */
		 
	        do{                                            
	            System.out.println("enter your number : ");                    
	            int n = sc.nextInt();
	            if(n % 10 == 0)
	            {				          
	            	 continue;				
	            }
																	 
	            System.out.println("number was : " + n);
	        }while(true);
	        
	        
	        
	        
		
	}

}
