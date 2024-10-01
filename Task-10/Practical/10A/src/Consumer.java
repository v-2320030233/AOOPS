import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
class Consumer implements Runnable
{
    private final BlockingQueue<String> sharedQueue;
    public Consumer(BlockingQueue<String> sharedQueue)
    {
        this.sharedQueue = sharedQueue;
    }
    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                String message = sharedQueue.take();
                System.out.println("Consumed: " + message);
                TimeUnit.SECONDS.sleep(2);
            }
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
}