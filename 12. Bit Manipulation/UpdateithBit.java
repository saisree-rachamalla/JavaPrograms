

public class UpdateithBit 
{
	 public static int updateIthBit(int n, int i, int oper)            //Update ith bit
	    {
	        int bitMask = 1<<i;
	        if(oper == 1){
	            //set
	            return n | bitMask;
	        
	        }
	        else
	        {
	            //clear
	            int newBitMask = ~(bitMask);
	            return n & newBitMask;
	        }

	    }
	    public static void main(String args[])
	    {
	        System.out.println(updateIthBit(5, 2,  0));

	    }

}
