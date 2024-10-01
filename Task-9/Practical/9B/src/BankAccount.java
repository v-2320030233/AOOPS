public class BankAccount
{
    private double balance;
    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }
    public synchronized void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
        }
    }
    public synchronized void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + balance);
        }
        else
        {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + amount + ". Insufficient funds.");
        }
    }
    public synchronized double getBalance()
    {
        return balance;
    }
}
