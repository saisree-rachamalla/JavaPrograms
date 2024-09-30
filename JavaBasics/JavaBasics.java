// import java.util.*;
// public class JavaBasics
// {
//     public static void  main(String args[])
//     {
       /*   System.out.println("Hello World");
            System.out.println("Hello World");
       */


        /*  System.out.println("****");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");    
        
       */

    /*  int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);

        String name = "Tony Stark";
        System.out.println(name);

        a = 50; 
        System.out.println(a);

        a = b;
        System.out.println(a);

    */


    // int a = 10;
    // int b = 5;
    // int sum = a + b;
    // System.out.println(sum);



    //  Scanner sc = new Scanner(System.in); 

    // String input = sc.next();      .next() is input for single word.
    // System.out.println(input);

    //    String name = sc.nextLine();   .nextLine is input for multiple words, multiple line and for paragraphs.
    //    System.out.println(name);

        //   int number = sc.nextInt();  .nextInt() is input for integer,
        //   System.out.println(number);


//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int sum = a + b;
//             System.out.println(sum);


//     }
// }







// import java.util.*;
// public class JavaBasics
// {
//     public static void main(String args[])
//     {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();                 product of a and b.
        // int product = a * b;
        // System.out.println(product);


            // Scanner sc = new Scanner(System.in);
        //    float rad = sc.nextFloat();    
        //    float area = 3.14f * rad * rad;     area of circle 
        //    System.out.println(area);


            //   int a = 25;
            //   long b = a;             type conversion from int to long.
            //   System.out.println(b);

                 
            // int number = sc.nextFloat();
            // System.out.println(number);    gives error: incompatible types: possible lossy conversion from float to int


                // Scanner sc =  new Scanner(System.in);
                // float number = sc.nextInt();  conversion from int to float
                // System.out.println(number);



                // float a = 25.0;    gives error lossy conversion from float to int
                // int b = a;

                // float a = 25.0f;
                // int b = (int) a;        type casting from float to int.
                // System.out.println(b);


                // char ch = 'a';         value of char a is 97.
                // char ch2 = 'b';        value of char b is 98.
                // int number = ch;
                // int number2 = ch2;
                // System.out.println(number);   it prints 97.
                // System.out.println(number2);  it prints 98.



                // char a = 'a';
                // char b = 'b';
                // System.out.println((int)(a));
                // System.out.println((int)(b));
                // System.out.println(a);                  There will be no type promotion when it is a normal variable.
                // System.out.println(b-a);



                // short a = 5;
                // byte b = 25;
                // char c = 'c';
                // byte bt = a + b + c;           it gives error: lossy conversion from int to byte.
                // System.out.println(bt);
 



                // short a = 5;
                // byte b = 25;
                // char c = 'c';
                // byte bt = (byte) (a + b + c);     we are forcely converting that is type casting from int to byte 
                // System.out.println(bt);




                // int a = 10;                          converts int, float, long into double.
                // float b = 20.25f;
                // long c = 25;
                // double d = 30;                         {  int ans = a + b + c + d; this gives error because lossy conversion 
                // double ans = a + b + c + d;                  from double to int , because everything is converted into double.
                // System.out.println(ans);                      double can not be stored into int.  }




                // byte b = 5;
                // byte a = b * 2;                  it gives error lossy conversion from int to byte, because java automatically 
                // System.out.println(a);              converts b into int because there is * between b and 2, so it becomes an expression.




                // byte b = 5;
                // byte a = (byte) (b * 2);         output will be 10, because we have type casted into byte.
                // System.out.println(a);




                // Scanner sc = new Scanner(System.in);
                // int a = sc.nextInt();
                // int b = sc.nextInt();
                // int c = sc.nextInt();
                // int avg = (a + b + c) / 3;       Average of 3 numbers.
                // System.out.println("average is : " + avg);         




                // Scanner sc = new Scanner(System.in);
                // int side = sc.nextInt();                  Area of square.
                // int Area = side * side;        
                // System.out.println("area of the square is : " + Area);



                // Scanner sc = new Scanner(System.in);
                // float pencil = sc.nextFloat();
                // float pen    = sc.nextFloat();             
                // float eraser = sc.nextFloat();
                // float total_cost = pen + pencil + eraser;           
                // System.out.println("Bill is : " + total_cost); 

                // //Add on - with 18% tax
                // float newTotal = total_cost + (0.18f * total_cost);
                // System.out.println("Bill with 18% tax : "  + newTotal);




                // int $ = 24;         No, the statement will not give any error.
                //                         Names of variables are called identifiers in Java. 
                //                         Identifier rule says,identifier scan start with any alphabet or underscore (“_”) or dollar (“$”). 
                //                         According to the rule the given variable name is a valid identifier.



                // int A = 10;
                // int B = 5;
                // System.out.println("add = " + (A+B));
                // System.out.println("subtract = " + (A-B));
                // System.out.println("multiply = " + (A*B));
                // System.out.println("divide = " + (A/B));
                // System.out.println("modulo(remainder) = " + (A%B));



                // int a = 10;
                // int b =  ++a;                          Unary operator -> pre increment 
                // System.out.println(a);
                // System.out.println(b);


                // int a = 10;
                // int b =  a++;                           Unary operator -> post increment 
                // System.out.println(a);                
                // System.out.println(b);



                // int a = 10;
                // int b = --a;                           Unary operator -> pre decrement 
                // System.out.println(a);                
                // System.out.println(b);




                // int a = 10;
                // int b = a--;                           Unary operator -> post decrement 
                // System.out.println(a);                
                // System.out.println(b);



                // int A = 10;
                // int B = 5;                          Relational Operators -> == (equal) 
                // System.out.println(A == B);



                // int A = 10;
                // int B = 10;
                // System.out.println(A != B);            Relational Operators -> != (not equal) 



                // int A = 10;
                // int B = 5;
                // System.out.println(A > B);               Relational Operators -> > (greater than)



                // int A = 10;
                // int B = 5;
                // System.out.println(A < B);               Relational Operators -> < (less than)  



                // int A = 10;
                // int B = 10;
                // System.out.println(A >= B);                 Relational Operators -> >= (greater than equal to) 


                // int A = 10;
                // int B = 10;
                // System.out.println(A <= B);                    Relational Operators -> <= (less than equal to)



                // System.out.println((3>2) && (5>0));               Logical operator -> logical AND


                // System.out.println( (3<2) || (5<0) );               Logical operator -> logical OR


                // System.out.println( !(3>2) );                          Logical operator -> logical NOT




                // int A = 10;
                //   // A = A +10;
                //   A += 10;                 Assignment operator ->  plus Assignment Operator
                // System.out.println(A);



                // int B  = 5; 
                //    // B = B - 5;
                //    B -= 5;                    Assignment operator ->  Minus Assignment Operator
                // System.out.println(B);



                // int B = 5;
                //   // B = B * 5;
                //   B *= 5;                       Assignment operator ->  Multiply Assignment Operator
                // System.out.println(B);



                // int B = 5;
                //    // B = B / 5;
                //    B /= 5;                          Assignment operator ->  Divide Assignment Operator
                // System.out.println(B);




                // int B = 5;
                //    //B = B % 5;
                //    B %= 5;                          Assignment operator ->  modulo Assignment Operator
                // System.out.println(B);



                // int age = 16;
                // if(age >= 18)              if else conditional statement.
                // {
                //     System.out.println("adult: drive, vote");
                // }
                // if(age > 13 && age < 18)
                // {
                //     System.out.println("teenager");         
                // }

                // else {
                //     System.out.println("not adult");

                // }



                // int A = 10;
                // int B = 5;           largest of 2 numbers.

                // if(A >= B){
                //     System.out.println("A is largest of 2");
                // }                                            
                // else { 
                //     System.out.println("B is largest of 2");
                // }


//     }
// }










// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]){

        // Scanner sc = new Scanner(System.in);

        // int number = sc.nextInt();          

        // if(number % 2 == 0){                     Number is odd or even.
        //     System.out.println("EVEN");
        // } else {
        //     System.out.println("ODD");
        // }


        // int age = 13;

        // if(age >= 18){
        //     System.out.println("Adult");
        // } else if(age >=13 && age < 18) {            else if conditional statement.
        //     System.out.println("teenager");
        // } else {
        //     System.out.println("Child");
        // }


        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax = 0;                          Income Tax Calculator
                                    
        // if(income < 500000){
        //     tax = 0;                     
        // } 
        // else if(income >= 500000 && income < 1000000){
        //     tax = (int) (income * 0.2);
        // }                                    
        // else {
        //     tax = (int) (income * 0.3);
        // }

        // System.out.println("Your tax is : " + tax);




        // int C = 1, B = 3, A = 6;

        // if(A >= B  && A >= C){
        //     System.out.println("largest is A");
        // }                                            Largest of 3 numbers.
        // else if(B >= C){
        //     System.out.println("largest is B");
        // }
        // else {
        //     System.out.println("largest is C");
        // }



            // int number = 7;

            // String type = (number%2 == 0) ? "EVEN" : "ODD";          Ternary operator
            // System.out.println(type);                




            // int marks = 31;
            // String ReportCard = (marks >= 33) ? "PASS" : "FAIL";     check if a student will pass or fail using ternary operator.
            // System.out.println(ReportCard);




            // int number = 2;
            // switch(number){                                                 Switch Statement using int.
            //     case 3 : System.out.println("samosa");
            //                 break;
            //     case 1 : System.out.println("burger");
            //                  break;
            //     case 2 : System.out.println("mango shake");
            //                  break;
            //     default : System.out.println("we wake up");

            // }
                
            

            // char ch = 'c';
            // switch(ch){                                                    Switch Statement using char.
            //     case 'd' : System.out.println("samosa");
            //     break;
            //     case 'a' : System.out.println("burger");
            //     break;
            //     case 'c' : System.out.println("mango shake");
            //     break;
            //     default : System.out.println("we wake up");

            // }



            // Scanner sc = new Scanner(System.in);
            // System.out.println("enter a : ");
            // int a = sc.nextInt();
            // System.out.println("enter b : ");
            // int b = sc.nextInt();
            // System.out.println("enter operator : ");
            // char operator = sc.next().charAt(0);

            // switch(operator){                                    calculator using switch case.
            //     case '+' : System.out.println(a+b);
            //                 break;
            //     case '-' : System.out.println(a-b);
            //                 break;
            //     case '*' : System.out.println(a*b);
            //                 break;
            //     case '/' : System.out.println(a/b);
            //                 break;
            //     case '%' : System.out.println(a/b);
            //                 break;
            //     default  : System.out.println("wrong operator");

            // }





                // Practice Questions for Conditional Statements.


            
            // Scanner sc = new Scanner(System.in);
            // int number = sc.nextInt();

            // if(number > 0){                               print whether the number is positive or negative.
            //     System.out.println("Positive Number");
            // }
            // else{
            //     System.out.println("Negative Number");
            // }




            // double temp = 103.5;
            // if(temp > 100){
            //     System.out.println("You have a fever");
            // }                                                checking whether you have fever or not.
            // else {
            //     System.out.println("You don't have a fever");
            // }



            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter week number : ");
            // int week_number = sc.nextInt();

            // switch(week_number){
            
            
            // case 1 : System.out.println("Monday");
            //             break;
            // case 2 : System.out.println("Tuesday");
            //             break;                           print day of week name using switch case
            // case 3 : System.out.println("Wednesday");
            //             break;
            // case 4 : System.out.println("Thursday");
            //             break;
            // case 5 : System.out.println("Friday");
            //             break;
            // case 6 : System.out.println("Saturday");
            //             break;
            // case 7 : System.out.println("Sunday");
            //             break;
            // default : System.out.println("Wrong input");
            // }



            // Scanner sc = new Scanner(System.in);
            // int year = sc.nextInt();
            // if(year % 4 == 0 && year % 100 !=0 && year % 400 == 0 )
            // {
            //     System.out.println("Leap Year");
            // }                                        print whether that year is a leap year or not

            // else {                                   
            //     System.out.println("Not a leap Year");
            // }



//     }
// }







// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]){



        // int counter = 0;
        // while(counter < 10){
        //     System.out.println("Hello World");
        //     counter++;
        // }                          printing hello world using While loop 

        // System.out.println("Printed HW 10x");


        // int counter = 1;
        // while(counter <= 100){
        //     System.out.print(counter + " ");
        //     counter ++;
        // }                            printing numbers from 1 to 10 using while loop
        //     System.out.println();




        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 1;
        // while(counter <= range){
        //     System.out.print(counter + " ");
        //     counter ++;
        // }                            Printing numbers from 1 to 10.
        //     System.out.println();




        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;

        // int i = 1;
        // while(i <= n){                   sum of first n natural numbers.
        //     sum = sum + i;
        //     i++;
        // }
        //  System.out.println("sum is : " +  sum);



        // for(int i=1; i <= 10; i++)        print hello world using for loop.
        // {                           
        //     System.out.println("Hello World");
        // }



        // for(int line = 1; line <= 4; line++){
        //     System.out.println("****");          print square pattern using for loop.
        // }



        // int line = 1;
        // while(line <= 4){                    print square using while loop.
        //     System.out.println("****");
        //     line ++;
        // }




        // int  n = 10899;

        // while(n > 0){
        //     int lastDigit = n % 10;          print Reverse of a number.
        //     System.out.print(lastDigit);
        //     n = n / 10;  //n/=10
        // }
        // System.out.println();




        // int n = 10899;
        // int rev = 0;

        // while(n > 0){                            Reverse the given number.
        //     int lastDigit = n % 10;
        //     rev = (rev * 10) + lastDigit;
        //     n = n / 10;
        // }
        // System.out.println(rev);




        // int counter = 1;
        // do{                                          Hello world using do-while loop.
        //     System.out.println("Hello World");
        //     counter ++;
        // }while(counter <= 10);




        // for(int i = 1; i <= 5; i++){
        //     if( i == 3){
        //         break;
        //     }                                    Using Break Statement.
        //     System.out.println(i);
        // }
        // System.out.println("i am out of the loop");




        // Scanner sc = new Scanner(System.in);

        // do{
        //     System.out.println("enter your number : ");
        //     int n = sc.nextInt();

        //     if(n % 10 == 0){
        //         break;                       Question regarding break keyword - keep entering numbers 
        //     }                                                                            till user enters a multiple of 10.
        //     System.out.println(n);
        // }while(true);





        // for(int i = 1; i<=5; i++){
        //     if(i == 3){
        //         continue;                        Using Continue Statement.
        //     }
        //     System.out.println(i);

        // }




        // Scanner sc = new Scanner(System.in);

        // do{                                                    Question regarding continue keyword - Display all numbers 
        //     System.out.println("enter your number : ");                               entered by user except multiples of 10.
        //     int n = sc.nextInt();

        //     if(n % 10 == 0){
        //         continue;
        //     }
        //     System.out.println("number was : " + n);
        // }while(true);







        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        


        // if(n == 2){
        //     System.out.println("n is prime");
        // }
        // else{                                            CHECK IF NUMBER IS PRIME OR NOT.
            
        //     boolean isPrime = true;
        // for(int i=2; i<=Math.sqrt(n); i++){
        //     if(n % i == 0){     // n is a multiple of i (i is not equal to  1 or n)
        //         isPrime = false;
        //     }
        // }

        // if(isPrime == true){
        //     System.out.println("n is prime");
        // }
        // else{
        //     System.out.println("n is not prime");
        // }

        // }
        





        // Scanner sc = new Scanner(System.in);
        // int number;
        // int choice;
        // int evensum = 0;
        // int oddsum = 0;

        
        // do{
        //     System.out.println("Enter the number");
        //     number = sc.nextInt();

        //     if(number % 2 ==0 ){
        //         evensum += number;                           EvenSum and OddSum.
        //     }
        //     else{
        //         oddsum += number;                            
        //     }

        //     System.out.println("Do you want to continue? Press 1 for yesor 0 for no");

        //     choice = sc.nextInt();

        // }while(choice==1);

        // System.out.println("Sum of even numbers: " + evensum);
        // System.out.println("Sum of odd numbers: " + oddsum);






        // Scanner sc = new Scanner(System.in);
        // int num;
        // int fact = 1;                                        Factorial of a number.

        // System.out.println("Enter positive number");
        // num = sc.nextInt();

        // for(int i = 1; i <= num; i++){
        //     fact *= i; 
        // }

        // System.out.println("Factorial : " + fact);








//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");

//         int n = sc.nextInt();                    Multiplication Table.

//         for(int i = 1; i <= 10; i++){
//             System.out.println(n +  " * "+ i + " = " + n*i);
//         }



//     }
// }











public class JavaBasics
{
    public static void main(String args[])
    {
        double d = 4.5;
        int i = (int)d;

        System.out.println(i);

    }

}




