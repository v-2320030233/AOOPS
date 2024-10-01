import java.util.Objects;
class Contact
{
    private String name;
    private String phoneNumber;
    private String email;
    public Contact(String name, String phoneNumber, String email)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getName()
    {
        return name;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getEmail()
    {
        return email;
    }
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return name.equals(contact.name);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }
    @Override
    public String toString()
    {
        return "Contact{name='" + name + "', phoneNumber='" + phoneNumber + "', email='" + email + "'}";
    }
}
