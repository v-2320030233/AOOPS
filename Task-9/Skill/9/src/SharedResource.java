import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class SharedResource
{
    private int count = 0;
    private final Lock lock = new ReentrantLock();
    public void increment()
    {
        lock.lock();
        try
        {
            count++;
            System.out.println("Count incremented: " + count);
        }
        finally
        {
            lock.unlock();
        }
    }
    public int getCount()
    {
        lock.lock();
        try
        {
            return count;
        }
        finally
        {
            lock.unlock();
        }
    }
}