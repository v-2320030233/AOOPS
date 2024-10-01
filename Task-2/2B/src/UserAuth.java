public class UserAuth
 {
    private static UserAuth instance;
    private boolean isAuthenticated;
    private UserAuth()
    {
        this.isAuthenticated = false;
    }
    public static UserAuth getInstance()
    {
        if (instance == null)
        {
            instance = new UserAuth();
        }
        return instance;
    }
    public void login(String username, String password)
    {
        if (username.equals("user") && password.equals("password"))
        {
            isAuthenticated = true;
            System.out.println("User authenticated successfully.");
        } else
        {
            System.out.println("Authentication failed.");
        }
    }
    public void logout()
    {
        isAuthenticated = false;
        System.out.println("User logged out.");
    }
    public boolean isAuthenticated()
    {
        return isAuthenticated;
    }
}