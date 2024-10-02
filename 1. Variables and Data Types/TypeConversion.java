
import java.util.*;
public class TypeConversion 

{

	public static void main(String args[]) 
	{
		System.out.print("type conversion from int to long --> ");
		int  m = 25;
	    long n = m;                        //type conversion from int to long.
	    System.out.println(m);
	    
	    System.out.println("-----------------------");
	    
	 /* int number = sc.nextFloat();
	    System.out.println(number);       //gives error: incompatible types: possible lossy conversion from float to int
	*/
	
	    
	       Scanner sc = new Scanner(System.in); 
	       
	        System.out.println("Enter int value");
	        
	        float num = sc.nextInt();      //conversion from int to float
	        System.out.print("conversion from int to float --> ");
	        System.out.println(num);
	
	        
	        System.out.println("-----------------------");
	        
	
	    /*  float a = 25.0;    //gives error lossy conversion from float to int
	        int b = a;
		*/
	        
	        
	        System.out.print("type casting from float to int  ---> ");
	        float c = 25.0f;
	        int d = (int) c;                //type casting from float to int.
	        System.out.println(d);
	        
	        

	        System.out.print("type casting from double to int  ---> ");
            double e = 4.5;
            int f = (int)e;                   // type casting from doule to int.
            System.out.println(f);

	        
	        System.out.println("-----------------------");
	        
	        
	        
	        
	        char ch = 'a';        // value of char a is 97.
	        char ch2 = 'b';        //value of char b is 98.
	        int number = ch;
	        int number2 = ch2;
	        System.out.print("Printing value of char a ---> ");
	        System.out.println(number);   //it prints 97.
	        System.out.print("Printing value of char b ---> ");
	        System.out.println(number2);  //it prints 98.
	        
	        
	        System.out.println("-----------------------");
	
	        

            char a = 'a';
            char b = 'b';
            System.out.println((int)(a));
            System.out.println((int)(b));
            System.out.println(a);           //  There will be no type promotion when it is a normal variable.
            System.out.print("b-a value --> ");
            System.out.println(b-a);
            
            System.out.println("-----------------------");
            
        /*    
            short p = 5;
            byte  q = 25;
            char  r = 'c';
            byte bt = p + q + r;          // it gives error: lossy conversion from int to byte.
            System.out.println(bt);
         */

            

            System.out.print("Type casting from int to byte ---> ");
            short x = 5;
            byte y = 25;
            char z = 'c';
            byte bt = (byte) (x + y + z);   //  we are forcely converting that is type casting from int to byte 
            System.out.println(bt);
            
            
            System.out.print("Type casting from int to byte ---> ");
            byte s = 5;
            byte r = (byte) (s * 2);        // output will be 10, because we have type casted into byte.
            System.out.println(r);
            
            	
            System.out.println("-----------------------");

            
            
            

            System.out.print("converting int,float,long into double  ---> ");
            int i = 10;                         // converts int, float, long into double.
            float j = 20.25f;
            long k = 25;
            double l = 30;                       //  {  int ans = a + b + c + d; this gives error because lossy conversion 
            double ans = i + j + k + l;          //    from double to int , because everything is converted into double.
            System.out.println(ans);             //     double can not be stored into int.  }

            System.out.println("-----------------------");
 
            
            
       /*
            byte b = 5;					it gives error lossy conversion from int to byte,
            byte a = b * 2;  		   	because java automatically converts b into int 
            System.out.println(a);      because there is * between b and 2, so it becomes an expression.
            								
		*/




            
	

		
	}
	    
}
