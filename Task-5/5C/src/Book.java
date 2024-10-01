public class Book implements Borrowable
{
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed;
    public Book(String id, String title, String author)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
    public String getId()
    {
        return id;
    }
    @Override
    public boolean borrowItem()
    {
        if (!isBorrowed)
        {
            isBorrowed = true;
            return true;
        }
        return false;
    }
    @Override
    public void returnItem()
    {
        isBorrowed = false;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public boolean isBorrowed()
    {
        return isBorrowed;
    }
}
