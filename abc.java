// import java.util.Scanner;

// import java.util.Scanner;

public class abc {


        // int sum()
        // {
        //     int a = 10;
        //     int b = 20;
        //     int c;

        //     c = a + b;
        //     System.out.println("Total : " + c);
        //     return c;
        // }

        // String name()
        // {
        //     String a = "Datta";
        //     String b = "Avachar";
        //     String abc;
            
        //     abc = a  + " " + b;
            

        //     System.out.println("Full Name : " + abc);
        //     return abc;
        // }



    public static void main(String[] args) {


        // abc a1 = new abc();
        // // int calculation = a1.sum();
        // // System.out.println("Total : " + calculation);
        // a1.sum();
        // a1.name();



        // for( int i = 1; i<=5; i++)
        // {
        //     for(int j = 5; j>=i; j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k<=i; k++)
        //     {
        //         System.out.print(" *");
        //     }
        //     System.out.println(" ");
        // }

        // for( int a = 1; a<=5; a++)
        // {
        //     for( int b = 5; b>=a; b--)
        //     {
        //         System.out.print(" ");

        //     }
        //     for(int c=1; c<=a; c++)
        //     {
        //         System.out.print(" *");

        //     }
        //     System.out.println(" ");
        // }



        for( int i = 1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a = 1; a<=5; a++)
        {
            for( int b = 4; b>=a; b--)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        for ( int f = 1; f<=5; f++)
        {
            for(int g = 5; g>=f; g--)
            {
                System.out.print(" ");
            }
            for(int h=1; h<=f; f++)
            {
                System.out.print("*");
            }
            System.out.println();
        }






    }
}

