import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Main
{
    public static void main(String[] args)
    {
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(new IncrementTask(sharedResource));
        Thread thread2 = new Thread(new IncrementTask(sharedResource));
        thread1.start();
        thread2.start();
        try
        {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Final Count: " + sharedResource.getCount());
    }
}