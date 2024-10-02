

public class BinaryToDecimalConversion 
{
	 public static void binToDec(int binNum)
	 {
	       int myNum = binNum;
	       int pow = 0;
	       int decNum = 0;
	       						 // Binary to Decimal Conversion.
	       while(binNum > 0)
	       {
	           int lastDigit = binNum % 10;                                 
	           decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
	           
	           pow ++;
	           binNum = binNum / 10;
	       }
	       System.out.println("decimal of " + myNum + " = " + decNum);
	   }
		public static void main(String[] args) 
		{
			binToDec(1010011);
			
		}

}
