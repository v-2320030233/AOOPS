public class ContactManagerTest
{
    public static void main(String[] args)
    {
        ContactManager manager = new ContactManager();
        manager.addContact(new Contact("Alice", "123-456-7890", "alice@example.com"));
        manager.addContact(new Contact("Bob", "098-765-4321", "bob@example.com"));
        manager.addContact(new Contact("Charlie", "555-666-7777", "charlie@example.com"));
        manager.addContact(new Contact("Alice", "123-456-7890", "alice@example.com"));
        Contact contact = manager.getContactByName("Bob");
        System.out.println("\nRetrieved contact: " + contact);
        System.out.println();
        manager.displayAllContacts();
        manager.removeContactByName("Charlie");
        System.out.println();
        manager.displayAllContacts();
    }
}
