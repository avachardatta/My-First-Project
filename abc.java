// import java.util.Scanner;

// import java.util.Scanner;

public class abc {


        int sum()
        {
            int a = 10;
            int b = 20;
            int c;

            c = a + b;
            System.out.println("Total : " + c);
            return c;
        }

        String name()
        {
            String a = "Datta";
            String b = "Avachar";
            String abc;
            
            abc = a  + " " + b;
            

            System.out.println("Full Name : " + abc);
            return abc;
        }



    public static void main(String[] args) {


        abc a1 = new abc();
        // int calculation = a1.sum();
        // System.out.println("Total : " + calculation);
        a1.sum();
        a1.name();



    }
}

