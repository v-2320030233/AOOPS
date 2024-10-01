public class BankAccount 
{
    private double balance;
    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }
    public void viewBalance()
    {
        if (UserSession.getInstance().isLoggedIn())
        {
            System.out.println("Your balance is: $" + balance);
        }
        else
        {
            System.out.println("Please log in to view your balance.");
        }
    }
    public void deposit(double amount)
    {
        if (UserSession.getInstance().isLoggedIn())
        {
            if (amount > 0)
            {
                balance += amount;
                System.out.println("Deposited $" + amount + ". New balance is: $" + balance);
            }
            else
            {
                System.out.println("Deposit amount must be positive.");
            }
        }
        else
        {
            System.out.println("Please log in to deposit money.");
        }
    }
    public void withdraw(double amount)
    {
        if (UserSession.getInstance().isLoggedIn())
        {
            if (amount > 0 && amount <= balance)
            {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance is: $" + balance);
            }
            else
            {
                System.out.println("Invalid withdraw amount.");
            }
        } 
        else
        {
            System.out.println("Please log in to withdraw money.");
        }
    }
}
