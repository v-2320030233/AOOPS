import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class MultiThreadedNumberPrinter
{
    private static final int MAX_NUMBER = 15;
    private static final Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= MAX_NUMBER; i++)
        {
            final int number = i;
            executor.execute(() -> printTwo(number));
            executor.execute(() -> printThree(number));
            executor.execute(() -> printFour(number));
            executor.execute(() -> printFive(number));
            executor.execute(() -> printNumber(number));
        }
        executor.shutdown();
    }
    public static void printTwo(int number)
    {
        lock.lock();
        try
        {
            if (number % 2 == 0)
            {
                System.out.println("Divisible by 2: " + number);
            }
        }
        finally
        {
            lock.unlock();
        }
    }
    public static void printThree(int number)
    {
        lock.lock();
        try
        {
            if (number % 3 == 0)
            {
                System.out.println("Divisible by 3: " + number);
            }
        }
        finally
        {
            lock.unlock();
        }
    }
    public static void printFour(int number)
    {
        lock.lock();
        try
        {
            if (number % 4 == 0)
            {
                System.out.println("Divisible by 4: " + number);
            }
        }
        finally
        {
            lock.unlock();
        }
    }
    public static void printFive(int number)
    {
        lock.lock();
        try
        {
            if (number % 5 == 0)
            {
                System.out.println("Divisible by 5: " + number);
            }
        }
        finally
        {
            lock.unlock();
        }
    }
    public static void printNumber(int number)
    {
        lock.lock();
        try
        {
            if (number % 2 != 0 && number % 3 != 0 && number % 4 != 0 && number % 5 != 0)
            {
                System.out.println("Number: " + number);
            }
        }
        finally
        {
            lock.unlock();
        }
    }
}
