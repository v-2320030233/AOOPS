import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
class ContactManager
{
    private Set<Contact> contactSet;
    private Map<String, Contact> contactMap;
    public ContactManager()
    {
        contactSet = new HashSet<>();
        contactMap = new HashMap<>();
    }
    public void addContact(Contact contact)
    {
        if (contactSet.add(contact))
        {
            contactMap.put(contact.getName(), contact);
            System.out.println("Contact added: " + contact);
        }
        else
        {
            System.out.println("Contact with name " + contact.getName() + " already exists.");
        }
    }
    public Contact getContactByName(String name)
    {
        return contactMap.get(name);
    }
    public void removeContactByName(String name)
    {
        Contact removedContact = contactMap.remove(name);
        if (removedContact != null)
        {
            contactSet.remove(removedContact);
            System.out.println("Contact removed: " + removedContact);
        }
        else
        {
            System.out.println("Contact with name " + name + " not found.");
        }
    }
    public void displayAllContacts()
    {
        System.out.println("All contacts:");
        for (Contact contact : contactSet)
        {
            System.out.println(contact);
        }
    }
}
