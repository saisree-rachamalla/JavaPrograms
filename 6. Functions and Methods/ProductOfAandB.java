

public class ProductOfAandB 
{
	
		  public static int multiply(int a, int b)
		  {
		        
		        int product = a * b;                          //  Product of a and B using Function.
		        
		        return product;
		   }
			public static void main(String[] args) {
			    int a = 3;
			    int b = 5;
			    int prod = multiply(a,b);
			    System.out.println("a * b = " + prod);
			    
			    prod = multiply(10, 20);
			    System.out.println("a * b = " + prod);
		        
			}

	}


