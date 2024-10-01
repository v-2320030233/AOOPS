public class Bidder implements Observer
{
    private String name;
    public Bidder(String name)
    {
        this.name = name;
    }
    @Override
    public void update(String eventType, String itemName)
    {
        System.out.println("Notification to " + name + ": " + eventType + " for item: " + itemName);
    }
}
