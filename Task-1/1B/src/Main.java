public class Main 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(1000);
        account.viewBalance();
        UserSession session = UserSession.getInstance();
        session.login();
        account.viewBalance();
        account.deposit(500);
        account.withdraw(300);
        account.viewBalance();
        session.logout();
        account.viewBalance();
        account.deposit(100);
    }
}
