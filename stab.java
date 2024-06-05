public class stab {

public static void main(String [] args)
{


int year = 2000;

// leap year

if((year % 400 == 0) || year % 4==0 && year % 100 !=0){


    System.out.println("Leap Year : " + year);
}else
{
    System.out.println("No leap year : " + year);
}


// greter number

int a = 10;
int b = 20;
int c = 30;



 if(( a > b ) && a > c )
{
    System.out.println("A is greter");
}else if ( (b > a) && b > c)
{
    System.out.println("B is greter");
}else{
    System.out.println("C is greter");
}


// calculator



double num1 = 500;
double num2 = 2;
char operator = '/';

double result;



switch (operator) {
    case '+':
        result = num1 + num2;
        System.out.println("The sum calculation : " + num1 + " " + operator + " " + num2 + " = " + result);
        break;
    case '-':
        result = num1 - num2;
        System.out.println("The sub calculation : " + num1 + " " + operator + " " + num2 + " = "  + result);
        break;
    case '*':
        result = num1 * num2;
        System.out.println("The Multification calculation : " + num1 + " " + operator + " " + num2 + " = " + result);
        break;
    case '/':
        if(num2 == 0)
        {
            System.out.println("Can not divide by zero");
            return;
        }
        result = num1 / num2;
        System.out.println("The divide calculation : " + num1 + " " + operator + " " + num2 + " = " + result);
        break;
        
    default:
    System.out.println("Enter valid operator");
        break;
}






















  }


}
