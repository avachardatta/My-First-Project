import java.util.Scanner;

public class FruitsMarket {


    public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Kashi Fruit Market");
            System.out.println("Choose fruit");
            System.out.println("1. Mango");
            System.out.println("2. Strawberry");
            System.out.println("3. Apple");
            System.out.println("4. Pineapple");
            System.out.println("5. Banana");

            int choice = sc.nextInt();

            int price1 = 100; // Per Piece Mango Price
            int price2 = 45;  // Per piece Strawberry price
            int price3 = 55;  // Per piece Apple 
            int price4 = 65;  // Pineapple price per piece
            int price5 = 8;   // Banana Per piece

            int discount = 10;

            switch (choice) {
                case 1:
                    System.out.println("Enter Qty");
                    int qty = sc.nextInt();
                    System.out.println("Do you want a discount (Yes/No)?");
                    String result = sc.next();

                    if (result.equalsIgnoreCase("YES")) {
                        int total = qty * price1;
                        total = total - (total * discount / 100);
                        System.out.println("Your Total Bill is : " + total);
                    } else if (result.equalsIgnoreCase("NO")) {
                        int total = qty * price1;
                        System.out.println("Your Total Bill is : " + total);
                    } else {
                        System.out.println("Invalid input for discount choice.");
                    }
                    break;

                case 2:
                    System.out.println("Enter Qty");
                    int qty2 = sc.nextInt();
                    System.out.println("Do you want a discount (Yes/No)?");
                    String result1 = sc.next();

                    if (result1.equalsIgnoreCase("YES")) {
                        int total = qty2 * price2;
                        total = total - (total * discount / 100);
                        System.out.println("Your Total Bill is : " + total);
                    } else if (result1.equalsIgnoreCase("NO")) {
                        int total = qty2 * price2;
                        System.out.println("Your Total Bill is : " + total);
                    } else {
                        System.out.println("Invalid input for discount choice.");
                    }
                    break;

                case 3:
                    System.out.println("Enter Qty");
                    int qty3 = sc.nextInt();
                    System.out.println("Do you want a discount (Yes/No)?");
                    String result2 = sc.next();

                    if (result2.equalsIgnoreCase("YES")) {
                        int total = qty3 * price3;
                        total = total - (total * discount / 100);
                        System.out.println("Your Total Bill is : " + total);
                    } else if (result2.equalsIgnoreCase("NO")) {
                        int total = qty3 * price3;
                        System.out.println("Your Total Bill is : " + total);
                    } else {
                        System.out.println("Invalid input for discount choice.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Qty");
                    int qty4 = sc.nextInt();
                    System.out.println("Do you want a discount (Yes/No)?");
                    String result3 = sc.next();

                    if (result3.equalsIgnoreCase("YES")) {
                        int total = qty4 * price4;
                        total = total - (total * discount / 100);
                        System.out.println("Your Total Bill is : " + total);
                    } else if (result3.equalsIgnoreCase("NO")) {
                        int total = qty4 * price4;
                        System.out.println("Your Total Bill is : " + total);
                    } else {
                        System.out.println("Invalid input for discount choice.");
                    }
                    break;

                case 5:
                    System.out.println("Enter Qty");
                    int qty5 = sc.nextInt();
                    System.out.println("Do you want a discount (Yes/No)?");
                    String result4 = sc.next();

                    if (result4.equalsIgnoreCase("YES")) {
                        int total = qty5 * price5;
                        total = total - (total * discount / 100);
                        System.out.println("Your Total Bill is : " + total);
                    } else if (result4.equalsIgnoreCase("NO")) {
                        int total = qty5 * price5;
                        System.out.println("Your Total Bill is : " + total);
                    } else {
                        System.out.println("Invalid input for discount choice.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

            // Ask the user if they want to continue shopping
            System.out.println("Do you want to continue shopping? (Yes/No)");
            String continueShopping = sc.next();

            if (continueShopping.equalsIgnoreCase("NO")) {
                System.out.println("Thank you for shopping with us!");
                break;  // Exit the loop and end the program
            } else if (!continueShopping.equalsIgnoreCase("YES")) {
                System.out.println("Invalid input. Exiting.");
                break;  // If the user enters an invalid response, exit
            }
        }

        sc.close();
    }


















}
