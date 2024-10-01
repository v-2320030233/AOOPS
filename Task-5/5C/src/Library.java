import java.util.ArrayList;
import java.util.List;
public class Library
{
    private List<Book> books;
    private List<Member> members;
    private BorrowingProcess borrowingProcess;
    public Library()
    {
        books = new ArrayList<>();
        members = new ArrayList<>();
        borrowingProcess = new BorrowingProcess();
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public void addMember(Member member)
    {
        members.add(member);
    }
    public void borrowBook(String memberId, String bookId)
    {
        Member member = findMemberById(memberId);
        Book book = findBookById(bookId);
        if (member != null && book != null)
        {
            borrowingProcess.borrowBook(member, book);
        }
    }
    public void returnBook(String memberId, String bookId)
    {
        Member member = findMemberById(memberId);
        Book book = findBookById(bookId);
        if (member != null && book != null)
        {
            borrowingProcess.returnBook(member, book);
        }
    }
    private Member findMemberById(String memberId)
    {
        for (Member member : members)
        {
            if (member.getId().equals(memberId))
            {
                return member;
            }
        }
        return null;
    }
    private Book findBookById(String bookId)
    {
        for (Book book : books)
        {
            if (book.getId().equals(bookId))
            {
                return book;
            }
        }
        return null;
    }
}
