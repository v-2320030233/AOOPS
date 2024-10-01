class Consumer implements Runnable
{
    private final BoundedBuffer buffer;
    public Consumer(BoundedBuffer buffer)
    {
        this.buffer = buffer;
    }
    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                String message = buffer.take();
                System.out.println("Consumed: " + message);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
}
