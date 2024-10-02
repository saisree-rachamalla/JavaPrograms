

public class HalfPyramidPattern 
{
	public static void main(String args[]) 
	 {								 //Half Pyramid Pattern
							
	        int n = 4;						//    1		
	        for(int line =1; line <= n; line++)			//    12
	        {							//    123
	            for(int number = 1; number <= line; number++)	//    1234

	            {
	                System.out.print(number);                     
	            }
	            System.out.println();
	        }	 
	 }

}
