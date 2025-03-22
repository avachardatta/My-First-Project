import java.util.Scanner;

public class BankApp {

public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to HDFC Bank");
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNumber = sc.next();

        System.out.print("Enter Initial Deposit Amount: ");
        double initialDeposit = sc.nextDouble();

        // Create Encapsulated BankAccount
        BankAccount account = new BankAccount(name, accNumber, initialDeposit);

        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Your Current Balance: ₹" + account.getBalance());
                    break;

                case 4:
                    account.displayAccountInfo();
                    break;

                case 5:
                    System.out.println("Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        sc.close();


	}









}
