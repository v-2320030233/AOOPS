public class BoundedBufferExample
{
    public static void main(String[] args)
    {
        BoundedBuffer buffer = new BoundedBuffer(10);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}