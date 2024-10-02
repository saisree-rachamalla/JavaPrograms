

public class CharaterPattern 
{
	public static void main(String args[]) 
	 {								//  Charater Pattern 
	        int n = 6;
	        char ch = 'A';						//    A                               
	        for(int line =1; line <=n; line++)			//    BC
	        {							//    DEF
	            for(int chars = 1; chars <= line; chars++)		//    GHIJ
	            {							//    KLMNO
	                System.out.print(ch);				//    PQRSTU
	                ch++;
	            }
	            System.out.println();
	        }
	 }
	

}
