import java.util.LinkedList;
import java.util.Queue;
public class SupportTicketSystem
{
    private Queue<String> ticketQueue;
    public SupportTicketSystem()
    {
        ticketQueue = new LinkedList<>();
    }
    public void addTicket(String ticket)
    {
        ticketQueue.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }
    public void processNextTicket()
    {
        if (!ticketQueue.isEmpty())
        {
            String processedTicket = ticketQueue.poll();
            System.out.println("Processing ticket: " + processedTicket);
        }
        else
        {
            System.out.println("No tickets to process.");
        }
    }
    public void displayPendingTickets()
    {
        System.out.println("Pending Tickets:");
        for (String ticket : ticketQueue)
        {
            System.out.println(ticket);
        }
    }
    public static void main(String[] args)
    {
        SupportTicketSystem supportSystem = new SupportTicketSystem();
        supportSystem.addTicket("Issue with login");
        supportSystem.addTicket("Payment not processed");
        supportSystem.displayPendingTickets();
        supportSystem.processNextTicket();
        supportSystem.displayPendingTickets();
    }
}
