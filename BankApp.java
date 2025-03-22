import java.util.Scanner;

public class BankApp {


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to HDFC Bank");
        System.out.println("Enter Your Name");

        String name = sc.nextLine();
        System.out.println("Enter Account Number");

        String accNumber = sc.next();

        // Initialise Balance

        System.out.println("Enter intial deposit amount");

        double initialDeposit = sc.nextDouble();


        // creating an encapsulated bank account

        BankAccount account = new BankAccount(name, accNumber, initialDeposit);
        double initialDeposit = sc.nextDouble();

        // Banking App

        int choice;
        do {
            System.out.println("Banking Menu");
            System.out.println("1.Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter deposit Amount : ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                break;
            
                case 2:
                    System.out.println("Enter withdrwal Amount");
                    double depositAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                break;

                case 3 :
                    System.out.println("Your Current Balance is : " + account.getBalance());
                break;

                case 4 :
                    account.displayAccountInfo();
                break;

                case 5: 
                    System.out.println("Thank u for banking with us");
                break;

                default :
                    System.out.println("Invalid choice . Please try again later");

            }
            while (condition != 5);
            
            sc.close();

        }





    }









}
