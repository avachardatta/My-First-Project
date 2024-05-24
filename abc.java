// import java.util.Scanner;

import java.util.Scanner;

public class abc {

    

    public static void main(String[] args) {

        // Data Type
        
        // byte a = 10;
        // boolean b = true;
        // char c = 'A';
        // short d = 5000;
        // int e = 500000;
        // float f = 50000.500f;
        // long h = 506516561321l;
        // double i = 512.512;


        // System.out.println("Byte : " + a);
        // System.out.println("Boolean : " + b);
        // System.out.println("Char : " + c);
        // System.out.println("Short : " + d);
        // System.out.println("Int : " + e);
        // System.out.println("Float : " + f);
        // System.out.println("Long : " + h);
        // System.out.println("Double : " + i);

        // calculator


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 1st Number");
        // double num1 = sc.nextDouble();
        // System.out.println("Enter Operator (+ ,-,*,/) : ");
        // char operator = sc.next().charAt(0);
        // System.out.println("Enter 2nd Number");
        // double num2 = sc.nextDouble();


        // double result;
        // switch (operator) {
        //     case '+':
        //         result = num1 + num2;
        //         break;
        
        //     case '-':
        //         result = num1 - num2;
        //         break;
            
        //     case '*':
        //         result = num1 * num2;
        //         break;
        
        //     case '/':
        //     if(num2 == 0)
        //     {
        //         System.out.println("Can Not Divide by zero");
        //         return;
        //     }
        //     result = num1 / num2;
        //     break;

        //     default :
        //     System.out.println("Enter valid operator");
        //     return;

        // }

        // System.out.println("Result : " + num1 + " " +  operator + " " +  num2 + " = " + result);


        // Simple Banking System

            // steps
            // welcome message print
            // enter your name
             // print what type of service we are offering only to create account in our bank
             //  print (saving , current , fixed deposit , Recurring deposit , investmnet in mf / bonds)
            // user input
            // enter your details ( name , address , type of account / investment)
            // 

            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to the HDFC Bank");
            System.out.println("Enter your Account Number");
            int a = sc.nextInt();
            int ac_num1 = 123;
            int ac_num2 = 234;
            int ac_num3 = 345;
            int ac_num4 = 456;
            int ac_num5 = 789;
                        
            String result = ( ac_num1 == 123) ? "Enter Service" : 
                            ( ac_num2 == 234) ? "Enter Service" :
                            ( ac_num3 == 345) ? "Enter Service" :
                            ( ac_num4 == 456) ? "Enter Service" :
                            ( ac_num5 == 789) ? "Enter Service" : "Enter valid Account Number";

             System.out.println(result + " ( Account Balance , Deposit, Withdrow )"); 
             String service = sc.next();
                String service1 = "Account Balance";
                String service2 = "Deposit";
                String service3 = "Withdrow";
                    

             int result1 =  ( ac_num1 == 123 && service1 == "Account Balance") ? 5000 : 
                            ( ac_num2 == 234 && service1 == "Account Balance") ? 15000 :
                            ( ac_num3 == 345 && service1 == "Account Balance") ? 8000 :
                            ( ac_num4 == 456 && service1 == "Account Balance") ? 4000 :
                            ( ac_num5 == 789 && service1 == "Account Balance") ? 3000 : 0;
                            System.out.println("Your Account Balance is : " + result1); 
            
            
                


















































































    }    
}

