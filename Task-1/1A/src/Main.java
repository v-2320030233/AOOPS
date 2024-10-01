public class Main
{
    public static void main(String[] args) 
    {
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");
        logger1.log("This is the second log message.");
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the third log message.");
        if (logger1 == logger2)
        {
            System.out.println("Logger1 and Logger2 are the same instance.");
        } 
        else 
        {
            System.out.println("Logger1 and Logger2 are different instances.");
        }
    }
}
