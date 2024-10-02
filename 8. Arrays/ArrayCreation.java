
import java.util.*;
public class ArrayCreation 
{
	public static void main(String[] args) 
	{
		int marks[] = new int[100];
		Scanner sc = new Scanner(System.in);
		
		marks[0] = sc.nextInt();                        
		marks[1] = sc.nextInt();                   // Array Creation 
		marks[2] = sc.nextInt();
		
		System.out.println("phy :" + marks[0]);
		System.out.println("chem :" + marks[1]);
		System.out.println("math :" + marks[2]);
	
	    marks[2] = 100;
	     System.out.println("math : "+ marks[2]);               // Updation of math marks.
	
	     marks[2] = marks[2]+1;
	     System.out.println("math : "+ marks[2]);              //  Updation of math marks.
			
		int percentage = (marks[0] + marks[1] + marks[2])/3;
		System.out.println("percentage = " + percentage + "%");
			
			
		System.out.println("length of an array = " + marks.length);
	 }

}
