import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class IncrementTask implements Runnable
{
    private final SharedResource sharedResource;

    public IncrementTask(SharedResource sharedResource)
    {
        this.sharedResource = sharedResource;
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            sharedResource.increment();
        }
    }
}