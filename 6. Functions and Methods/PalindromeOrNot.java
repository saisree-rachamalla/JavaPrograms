
import java.util.*;
public class PalindromeOrNot 
{
    public static boolean isPalindrome(int number){
        int palindrome = number;                     
        
        int reverse = 0;
        
        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if(palindrome == reverse){       // Checking whether palindrome or not using function.
            return true;
        }
        return false;
        
    }
 
	public static void main(String[] args) {
	    
	    System.out.println("Enter the number");
	    Scanner sc = new Scanner(System.in);
	    int palindrome = sc.nextInt();
	    
	    if(isPalindrome(palindrome)){
	        System.out.println("Number : " + palindrome + " is a palindrome");
	    }
	    
	    else {
	        System.out.println("Number : " + palindrome + " is not a palindrome");
	    }
	    
	    	
	}

}
