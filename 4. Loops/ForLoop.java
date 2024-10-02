
import java.util.*;
public class ForLoop
{
	public static void main(String args[]) 
	{
		
		 for(int i=1; i <= 10; i++)                     // print hello world using for loop.
	        {                           
	            System.out.println("Hello World");
	        }
		 
		 
		 System.out.println("---------");
		 
		 
		 
		 	System.out.println("square pattern using for loop");
	        for(int line = 1; line <= 4; line++){
	            System.out.println("****");             // print square pattern using for loop.
	        }


	   	 System.out.println("---------");
	   	 
	   	 
	   	 
	   	System.out.println("Using Break Statement");
	        for(int i = 1; i <= 5; i++)
	        {
	            if( i == 3)
	            {
	                break;
	            }                                     //Using Break Statement.
	            System.out.println(i);
	        }
	        System.out.println("i am out of the loop");

	        
	        
	   	    System.out.println("---------");
	   	    
	   	    
	   	 
		   	System.out.println("Using Continue Statement");
	        for(int i = 1; i<=5; i++){
	            if(i == 3){
	                continue;                        //Using Continue Statement.
	            }
	            System.out.println(i);

	        }
		
	}

}
