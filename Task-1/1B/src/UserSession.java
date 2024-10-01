public class UserSession
{
    private static UserSession instance;
    private boolean isLoggedIn;
    private UserSession() 
    {
        this.isLoggedIn = false;
    }
    public static UserSession getInstance()
    {
        if (instance == null) 
        {
            instance = new UserSession();
        }
        return instance;
    }
    public void login()
    {
        if (!isLoggedIn)
        {
            isLoggedIn = true;
            System.out.println("User has logged in.");
        } 
        else
        {
            System.out.println("User is already logged in.");
        }
    }
    public void logout()
    {
        if (isLoggedIn)
        {
            isLoggedIn = false;
            System.out.println("User has logged out.");
        }
        else
        {
            System.out.println("User is not logged in.");
        }
    }
    public boolean isLoggedIn()
    {
        return isLoggedIn;
    }
}
