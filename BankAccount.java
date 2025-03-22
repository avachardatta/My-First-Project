public class BankAccount {

    private String name;  
    private String accNumber;
    private double balance;




    public BankAccount(String name,String accNumber,double balance) // Constructor 
    {

        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;

    }

// Getters Methods

public String getAccountHolder()
{
    return name;
}

public String getAccountNumber()
{
    return accNumber;
}

public double getBalance()
{
    return balance;
}


// Methods to use 
// Depost methods 

public void deposit(double amount)
{
    if(amount > 0)
    {
        balance += amount;
        System.out.println("Deposit successful : " + balance);
    }else{
        System.out.println("Invalid deposit amount");
    }
}

// withdraw method

public void withdraw(double amount)
{
    if(amount > 0 && amount <= balance)
    {
        balance -= amount;
        System.out.println("withdrown : " + balance);
    }else
    {
        System.out.println("Invalid amount or insuffcient funds ");
    }
}

public void displayAccountInfo()
{
    System.out.println("Account details");
    System.out.println("Account Holder : " + name);
    System.out.println("Account Number : " + accNumber);
    System.out.println("Current Balance: ₹ " + balance);
}




}
