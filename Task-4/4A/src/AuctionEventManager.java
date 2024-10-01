import java.util.ArrayList;
import java.util.List;
public class AuctionEventManager implements Subject
{
    private List<Observer> observers;
    public AuctionEventManager()
    {
        this.observers = new ArrayList<>();
    }
    @Override
    public void subscribe(Observer observer)
    {
        observers.add(observer);
        System.out.println("Observer subscribed.");
    }
    @Override
    public void unsubscribe(Observer observer)
    {
        observers.remove(observer);
        System.out.println("Observer unsubscribed.");
    }
    @Override
    public void notifyObservers(String eventType, String itemName)
    {
        for (Observer observer : observers)
        {
            observer.update(eventType, itemName);
        }
    }
    public void itemAvailable(String itemName)
    {
        notifyObservers("Item Available", itemName);
    }
    public void biddingStarted(String itemName)
    {
        notifyObservers("Bidding Started", itemName);
    }
    public void biddingEnded(String itemName)
    {
        notifyObservers("Bidding Ended", itemName);
    }
}
