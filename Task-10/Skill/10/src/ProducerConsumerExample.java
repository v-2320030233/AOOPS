import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class ProducerConsumerExample
{
    public static void main(String[] args)
    {
        BlockingQueue<String> sharedQueue = new ArrayBlockingQueue<>(5);
        Producer producer = new Producer(sharedQueue, 10);
        Consumer consumer = new Consumer(sharedQueue);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
        try
        {
            producerThread.join();
            consumerThread.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("All messages processed. Exiting.");
    }
}