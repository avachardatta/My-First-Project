public class Atm_machine implements project {
    


    private double balance;

   public Atm_Machine()
    {
        this.balance = 0.0; 
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance +=amount;

            System.out.println("Success fully amount deposit : " + amount);
        }else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    
    public double checkBalance() {
        return balance;
    }


}
