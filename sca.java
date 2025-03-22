import java.util.Scanner;

public class sca {
 
    



public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

Atm_Machine atm = new Atm_Machine();
        boolean exit = false;

        while (!exit) {
            System.out.println("ATM System:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: $" + atm.checkBalance());
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting ATM System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();








}

}
