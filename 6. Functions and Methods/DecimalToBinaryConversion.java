

public class DecimalToBinaryConversion 
{
	 public static void decToBin(int n)
	 {
	       int myNum = n;
	       int pow = 0;
	       int binNum = 0;
	                                                  // Decimal to Binary Conversion.
	       while(n > 0)
	       {
	           int rem = n % 2;                                            
	           binNum = binNum + (rem * (int)Math.pow(10, pow));
	           
	           pow ++;
	           n = n / 2;
	       }
	       System.out.println("binary of " + myNum + " = " + binNum);
	   }
		public static void main(String[] args)
		{
			decToBin(5);
			
		}

}
