public class SavingAccount implements Bank {
    
    public SavingAccount(double initialBalance) {
        this.balance = initialBalance;
      }
    

        private double balance;
    
            public void deposit(double amount)
            {
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposit Successful! New balance: $" + balance);
                  } else {
                    System.out.println("Invalid deposit amount. Please enter a positive value.");
                  }
              
            }
    
            public void withdrow(double amount)
            {
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawal Successful! New balance: $" + balance);
                  } else {
                    if (amount <= 0) {
                      System.out.println("Invalid withdrawal amount. Please enter a positive value.");
                    } else {
                      System.out.println("Insufficient funds. Current balance: $" + balance);
                    }
                  }
              
            }
    
            public double getBalance()
            {
                return balance;
            }
    
            public static void main(String[] args) {
                SavingAccount account = new SavingAccount(100); // Create an account with initial balance
            
                while (true) {
                  System.out.println("\nBank Menu:");
                  System.out.println("1. Deposit");
                  System.out.println("2. Withdraw");
                  System.out.println("3. Check Balance");
                  System.out.println("4. Exit");
                  System.out.print("Enter your choice: ");
            
                  int choice = Integer.parseInt(System.console().readLine()); // Read user input
            
                  switch (choice) {
                    case 1:
                      System.out.print("Enter amount to deposit: $");
                      double depositAmount = Double.parseDouble(System.console().readLine());
                      account.deposit(depositAmount);
                      break;
                    case 2:
                      System.out.print("Enter amount to withdraw: $");
                      double withdrawAmount = Double.parseDouble(System.console().readLine());
                      account.withdrow(withdrawAmount);
                      break;
                    case 3:
                      System.out.println("Your current balance: $" + account.getBalance());
                      break;
                    case 4:
                      System.out.println("Exiting Bank Application.");
                      System.exit(0); // Terminate program
                    default:
                      System.out.println("Invalid choice. Please try again.");
                  }
                }
              }
            


    }






