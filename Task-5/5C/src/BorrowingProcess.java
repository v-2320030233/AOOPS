public class BorrowingProcess
{
    public void borrowBook(Member member, Book book)
    {
        if (book.borrowItem())
        {
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        }
        else
        {
            System.out.println(book.getTitle() + " is already borrowed.");
        }
    }
    public void returnBook(Member member, Book book)
    {
        book.returnItem();
        System.out.println(member.getName() + " returned " + book.getTitle());
    }
}
