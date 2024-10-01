class Producer implements Runnable
{
    private final BoundedBuffer buffer;
    private int messageCount;
    public Producer(BoundedBuffer buffer)
    {
        this.buffer = buffer;
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
                buffer.put(message);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
}