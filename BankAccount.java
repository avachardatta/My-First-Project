import lombok.Getter;
import lombok.Setter;


// this is use for getter and setter this are anotations

@Getter
@Setter

// Encapsilation Example

public class BankAccount {

    private String accountHolder;  
    private String accountNumber;
    private double balance;




    public BankAccount(String accountHolder,String accountNumber,double balance) // Constructor 
    {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

// Getters Methods

public String getAccountHolder()
{
    return accountHolder;
}

public String getAccountNumber()
{
    return accountNumber;
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
    System.out.println("Account Holder : " + accountHolder);
    System.out.println("Account Number : " + accountNumber);
    System.out.println(Current Balance: ₹ " + balance);
}









}
