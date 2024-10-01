public class Main
{
    public static void main(String[] args)
    {
        Bird bird = new Bird();
        bird.fly();
        Bird ostrich = new Ostrich();
        try
        {
            ostrich.fly(); // This will cause an exception, violating LSP
        }
        catch (UnsupportedOperationException e)
        {
            System.out.println(e.getMessage());
        }
    }
}