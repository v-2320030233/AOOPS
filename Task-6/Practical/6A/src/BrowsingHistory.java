import java.util.ArrayDeque;
import java.util.Deque;
public class BrowsingHistory
{
    private Deque<String> history;
    private Deque<String> forwardStack;
    public BrowsingHistory()
    {
        history = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
    }
    public void visitPage(String url)
    {
        history.push(url);
        forwardStack.clear();
        System.out.println("Visited: " + url);
    }
    public void goBack()
    {
        if (!history.isEmpty())
        {
            String currentPage = history.pop();
            forwardStack.push(currentPage);
            System.out.println("Went back to: " + (history.isEmpty() ? "No pages" : history.peek()));
        }
        else
        {
            System.out.println("No pages to go back to.");
        }
    }
    public void goForward()
    {
        if (!forwardStack.isEmpty())
        {
            String forwardPage = forwardStack.pop();
            history.push(forwardPage);
            System.out.println("Went forward to: " + forwardPage);
        }
        else
        {
            System.out.println("No pages to go forward to.");
        }
    }
    public void displayCurrentPage()
    {
        if (!history.isEmpty())
        {
            System.out.println("Current Page: " + history.peek());
        }
        else
        {
            System.out.println("No pages in history.");
        }
    }
    public static void main(String[] args)
    {
        BrowsingHistory browsingHistory = new BrowsingHistory();
        browsingHistory.visitPage("https://example.com");
        browsingHistory.visitPage("https://google.com");
        browsingHistory.displayCurrentPage();
        browsingHistory.goBack();
        browsingHistory.displayCurrentPage();
        browsingHistory.goForward();
        browsingHistory.displayCurrentPage();
    }
}
