public class Main
{
    public static void main(String[] args)
    {
        Library library = new Library();
        Book book1 = new Book("B001", "1984", "George Orwell");
        Book book2 = new Book("B002", "To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);
        Member member1 = new Member("M001", "Alice");
        PremiumMember member2 = new PremiumMember("M002", "Bob");
        library.addMember(member1);
        library.addMember(member2);
        library.borrowBook("M001", "B001");
        library.borrowBook("M002", "B002");
        library.returnBook("M001", "B001");
    }
}
