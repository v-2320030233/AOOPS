import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
class Producer implements Runnable
{
    private final BlockingQueue<String> sharedQueue;
    private int messageCount;
    public Producer(BlockingQueue<String> sharedQueue)
    {
        this.sharedQueue = sharedQueue;
        this.messageCount = 0;
    }
    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                String message = "Message-" + messageCount++;
                System.out.println("Produced: " + message);
                sharedQueue.put(message);
                TimeUnit.SECONDS.sleep(1);
            }
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
}