public class Main
{
    public static void main(String[] args)
    {
        AuctionEventManager auctionEventManager = new AuctionEventManager();
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        auctionEventManager.subscribe(bidder1);
        auctionEventManager.subscribe(bidder2);
        auctionEventManager.itemAvailable("Antique Vase");
        auctionEventManager.biddingStarted("Antique Vase");
        auctionEventManager.unsubscribe(bidder1);
        auctionEventManager.biddingEnded("Antique Vase");
    }
}
