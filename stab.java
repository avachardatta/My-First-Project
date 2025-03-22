import java.util.InputMismatchException;
import java.util.Scanner;  // Import the Scanner class



public class stab {

public static void main(String [] args)
{


// int year = 2000;

// // leap year

// if((year % 400 == 0) || year % 4==0 && year % 100 !=0){


//     System.out.println("Leap Year : " + year);
// }else
// {
//     System.out.println("No leap year : " + year);
// }


// greter number

// int a = 10;
// int b = 20;
// int c = 30;



//  if(( a > b ) && a > c )
// {
//     System.out.println("A is greter");
// }else if ( (b > a) && b > c)
// {
//     System.out.println("B is greter");
// }else{
//     System.out.println("C is greter");
// }


// calculator



// double num1 = 500;
// double num2 = 2;
// char operator = '/';

// double result;



// switch (operator) {
//     case '+':
//         result = num1 + num2;
//         System.out.println("The sum calculation : " + num1 + " " + operator + " " + num2 + " = " + result);
//         break;
//     case '-':
//         result = num1 - num2;
//         System.out.println("The sub calculation : " + num1 + " " + operator + " " + num2 + " = "  + result);
//         break;
//     case '*':
//         result = num1 * num2;
//         System.out.println("The Multification calculation : " + num1 + " " + operator + " " + num2 + " = " + result);
//         break;
//     case '/':
//         if(num2 == 0)
//         {
//             System.out.println("Can not divide by zero");
//             return;
//         }
//         result = num1 / num2;
//         System.out.println("The divide calculation : " + num1 + " " + operator + " " + num2 + " = " + result);
//         break;
        
//     default:
//     System.out.println("Enter valid operator");
//         break;
                
// }

// while (true) {
  
// try {

//   Scanner sc = new Scanner(System.in);
//   System.out.println("Welcome to the world of calculator");
//   System.out.println("Enter the first Number");
//   double num1 = sc.nextDouble();
//   System.out.println("Enter Secound number");
//   double num2 = sc.nextDouble();
//   System.out.println("Choose Operator ( '+'  '-'  '/'  '*' )");
//   char operator = sc.next().charAt(0);

//   double result;

//   switch (operator) {
//     case '+':
//         result = num1 + num2;
//         System.out.println("The sum calculation : " + num1 + " " + operator + " " + num2 + " = " + result);
//         break;
//     case '-':
//         result = num1 - num2;
//         System.out.println("The sub calculation : " + num1 + " " + operator + " " + num2 + " = "  + result);
//         break;
//     case '*':
//         result = num1 * num2;
//         System.out.println("The Multification calculation : " + num1 + " " + operator + " " + num2 + " = " + result);
//         break;
//     case '/':
//         if(num2 == 0)
//         {
//             System.out.println("Can not divide by zero");
//             return;
//         }
//         result = num1 / num2;
//         System.out.println("The divide calculation : " + num1 + " " + operator + " " + num2 + " = " + result);
//         break;
        
//     default:
//     System.out.println("Enter valid operator");
//         break;
                
// }

// }catch(InputMismatchException e)
// {
//   System.out.println("Invalid input. Please enter a number.");
//   // sc.nextLine();
// }
// }
















// pattern printing



// for(int i = 1; i<=5; i++ )
// {
//     for( int j = 1; j<= i; j++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }

// for ( int a = 1; a <= 5; a++)
// {
//     for(int b = 5; b >= a; b--)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }


  // for( int i = 1; i<=5; i++ )
  // {
  //   for(int j = 1; j<=i; j++)
  //   {
  //     System.out.print(j);
  //   }
  //   System.out.println();
  // }


//   int a [] = { 10,20,30,40,50,60,70};

//   for( int b : a){
//     System.out.println("Value of A : " + b);
//   }

//   int [] emp_id = new int[5];

//   emp_id[0] = 1001;
//   emp_id[1] = 1002;
//   emp_id[2] = 1003;
//   emp_id[3] = 1004;
//   emp_id[4] = 1005;
  
//  for(int details : emp_id)
//  {
//   System.out.println("List of Emp Id " + details );
//  }

//  System.out.println("Dominic Emp_id : " + emp_id[0]);




  for( int i = 1; i<=5; i++)
  {
    for( int j = 1; j<=i; j++)
    {
      System.out.print("*");

    }
    
    System.out.println();
  }


  // for ( int i = 1; i<=5; i++)
  // {
  //   for( int j = 1; j<=i; j++)
  //   {
      
  //   }
  // }












  }


}
