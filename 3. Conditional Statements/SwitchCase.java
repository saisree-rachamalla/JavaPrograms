
import java.util.*;
public class SwitchCase 
{
	public static void main(String args[])
	{
		  
        System.out.print("Switch Statement using int ---> ");
       int Number = 2;
       switch(Number)
       {                                                // Switch Statement using int.
            case 3 : System.out.println("samosa");
                        break;
            case 1 : System.out.println("burger");
                         break;
            case 2 : System.out.println("mango shake");
                         break;
            default : System.out.println("we wake up");

        }
        
       System.out.println("---------");
       
       
       
       System.out.print("Switch Statement using char ---> ");
       char ch = 'a';
       switch(ch)
       {                                                   // Switch Statement using char.
           case 'd' : System.out.println("samosa");
           break;
           case 'a' : System.out.println("burger");
           break;
           case 'c' : System.out.println("mango shake");
           break;
           default : System.out.println("we wake up");
       }
       
       System.out.println("----------");
       
       
       
     
       System.out.println("print day of week name using switch case");
       System.out.println("Enter week number : ");
       

       Scanner sc = new Scanner(System.in);
       
       int week_number = sc.nextInt();

       switch(week_number)
       {
      
       case 1 : System.out.println("Monday");
                   break;
       case 2 : System.out.println("Tuesday");
                   break;                              //print day of week name using switch case
       case 3 : System.out.println("Wednesday");
                   break;
       case 4 : System.out.println("Thursday");
                   break;
       case 5 : System.out.println("Friday");
                   break;
       case 6 : System.out.println("Saturday");
                   break;
       case 7 : System.out.println("Sunday");
                   break;
       default : System.out.println("Wrong input");
       
       }

       

		
	}

}
