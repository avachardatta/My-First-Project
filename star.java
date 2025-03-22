
import java.util.Arrays;
import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        // int n = 5;

        // // Upper half of the diamond
        // for (int i = 1; i  <= n; i++) {
        //     // Print left half of the row
        //     for (int j = 1; j  <= i; j++) {
        //         System.out.print("*");
        //     }
        //     // Print spaces in the middle
        //     for (int j = 1; j  <= 2 * (n - i); j++) {
        //         System.out.print(" ");
        //     }
        //     // Print right half of the row
        //     for (int j = 1; j  <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Lower half of the diamond
        // for (int i = n; i  >= 1; i--) {
        //     // Print left half of the row
        //     for (int j = 1; j  <= i; j++) {
        //         System.out.print("*");
        //     }
        //     // Print spaces in the middle
        //     for (int j = 1; j  <= 2 * (n - i); j++) {
        //         System.out.print(" ");
        //     }
        //     // Print right half of the row
        //     for (int j = 1; j  <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // int num1 = 4;

        // if( num1 % 2 ==0)
        // {
        //     System.out.println("Its Even");
        // }else{
        //     System.out.println("Its odd");
        // }

// Marks >= 90: A
// Marks >= 80: B
// Marks >= 70: C
// Marks >= 60: D
// Marks < 60: F

// double marks = 80;

// if( marks <=100 && marks >=90)
// {
//     System.out.println("A");
// }else if( marks <= 89 && marks >= 80)
// {
//     System.out.println("B");
// }
// else if( marks <= 79 && marks >= 70)
// {
//     System.out.println("C");
// }else if( marks <= 69 && marks >= 60)
// {
//     System.out.println("D");
// }else{
//     System.out.println("Fail");
// }

//Write a program that takes three integers as input and prints the largest of the three.



//     int a = 10;
//     int b = 20;
//     int c = 30;



// if( a > b && a > c)
// {
//     System.out.println(" A is Greter");
// }else if ( b > a && b > c)
// {
//     System.out.println(" B is greter");
// }else
// {
//     System.out.println("C is greter");
// }


//  Write a program that calculates the sum of the first n natural numbers using a for loop


// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the number");

// int num = sc.nextInt();

// int sum = 0;

// for( int i = 1; i <= num; i++)
// {
//     sum+=i;

// }
// System.out.println("Sum of first " + num + " natural numbers is " + sum);



//Write a program that calculates the factorial of a given number using a while loop.


// int number = sc.nextInt();


// if( number < 0 )
// {
//     System.out.println("Please enter positive number");
// }


// int factorial = 1;
// int i = 1;

// while ( i <= number )
// {
//     factorial *=i;
//     i++;
// }

// System.out.println("Factorial of " + number + " is: " + factorial);


// Write a program that prints the multiplication table of a given number up to 10 using a for loop.


// int number = sc.nextInt();


// for ( int i =1; i <=10; i++)
// {
// System.out.println(number + " x " + i + " = " + (number * i) );
// }


// for ( int i = 10; i >= 1; i --)
// {
//     System.out.println(i);
// }


//Write a program to print all even numbers between 1 and 20.


// for ( int i = 1; i <= 20; i++)
// {
//     if( i % 2 == 0)
//     {
//         System.out.println(i);
//     }
// }



//Write a program to calculate the sum of numbers from 1 to 100.



// int number = 0;

// for ( int i = 1; i <=100; i++)
// {
//     number +=i ;
//     System.out.println(number);
// }


// Write a program to calculate the factorial of a given number.


// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number");
// int number = sc.nextInt();

// if ( number < 0)
// {
//     System.out.println("Enter non negative integer");
// }else{
//     long  factorial = 1;
//     for ( int i = 1; i <= 10; i++)
//     {
//         factorial *= i;
//     }
//     System.out.println(factorial);
// }


//Write a program to print the following diamond pattern:


// for ( int i =1 ; i<=5; i++)
// {
//     for( int j = 5; j>=i ; j--)
//     {
//         System.out.print(" ");
//     }
//     for( int k = 1; k<=i ; k++)
//     {
//         System.out.print(" *");
//     }
//     System.out.println(" ");
// }

// for ( int i =1 ; i<=5; i++)
// {
//     for( int j = 1; j<=i ; j++)
//     {
//         System.out.print(" ");
//     }
//     for( int k = 5; k>=i ; k--)
//     {
//         System.out.print(" *");
//     }
//     System.out.println(" ");
// }


// int sum = 0;
//         for ( int i = 1; i <=50; i++)
//         {
//             if( i % 2 != 0)
//             {
//                 sum+=i;
//             }

//         }
//             System.out.println(sum);




//Write a program to calculate the factorial of a given number using a while loop.



// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the number");
// int number = sc.nextInt();

// if( number < 0)
// {
//     System.out.println("Enter non negative number");
// }else{
//     long factorial = 1;
//     for ( int i = 1 ; i <=10; i++)
//     {
//         factorial *= i;
//     }
// System.out.println(factorial);

// }



// int n = 10; // Number of terms in the Fibonacci series
//         int a = 0, b = 1, c;

//         System.out.println("Fibonacci Series up to " + n + " terms:");
//         System.out.print(a + " " + b + " "); // Print the first two terms

//         for (int i = 2; i < n; i++) {
//             c = a + b;
//             System.out.print(c + " ");
//             a = b;
//             b = c;
//         }



// for ( int i = 1; i<=5; i++)
// {
//     for( int j = 1; j<=i; j++)
//     {
//         System.out.print(j);
//     }
//     System.out.println();
// }

// int n = 5;


// for (int i = 1; i <= n; i++) {
//     for (int j = n; j > i; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k <= i; k++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }





// int year = 2021;

// if (( year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
// {
//     System.out.println("leap year");
// }else{
//     System.out.println("no leap year");
// }

    // String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

    
    //     System.out.println(Arrays.toString(names));
    //     System.out.println(names[0]);
    //     System.out.println(names[1]);
    //     System.out.println(names[2]);
    //     System.out.println(names[3]);
    //     System.out.println(names[4]);



            















    }
}
