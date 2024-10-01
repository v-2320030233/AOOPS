import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
class Consumer implements Runnable
{
    private BlockingQueue<String> sharedQueue;
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
                if ("DONE".equals(message))
                {
                    System.out.println("Consumer received termination signal.");
                    break;
                }
                System.out.println("Consumer consumed: " + message);
                Thread.sleep(150);
            }
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
}