public class BankAccountSimulation
{
    public static void main(String[] args)
    {
        BankAccount sharedAccount = new BankAccount(1000.0);
        Thread user1 = new BankUser(sharedAccount, true, 200);
        Thread user2 = new BankUser(sharedAccount, false, 150);
        Thread user3 = new BankUser(sharedAccount, true, 300);
        Thread user4 = new BankUser(sharedAccount, false, 500);
        user1.start();
        user2.start();
        user3.start();
        user4.start();
        try
        {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Final account balance: " + sharedAccount.getBalance());
    }
}
