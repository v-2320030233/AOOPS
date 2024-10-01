import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
class Producer implements Runnable
{
    private BlockingQueue<String> sharedQueue;
    private int messageCount;
    public Producer(BlockingQueue<String> sharedQueue, int messageCount)
    {
        this.sharedQueue = sharedQueue;
        this.messageCount = messageCount;
    }
    @Override
    public void run()
    {
        for (int i = 1; i <= messageCount; i++)
        {
            String message = "Message " + i;
            try
            {
                System.out.println("Producer produced: " + message);
                sharedQueue.put(message);
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
        try
        {
            sharedQueue.put("DONE");
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
}