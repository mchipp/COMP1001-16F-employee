package inventory;

/**
 * This class handles Manufacturer objects for assignment 1
 * @author Mark Chipp 200180985 <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class Manufacturer 
{
    // private variables
    private String name, address, phoneNumber, contact;
    private int mfgId;
    
    public Manufacturer()
    {}
            
    public Manufacturer(String name, String address, String phoneNumber, String contact, int mfgId)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.contact = contact;
        this.mfgId = mfgId;
    }
    
    // Accessors
    public String getName()
    {
        return this.name;
    }
    public String getAddress()
    {
        return this.address;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public String getContact()
    {
        return this.contact;
    }
    public int getMfgId()
    {
        return this.mfgId;
    }
    
    // Mutators
    public void setName(String input)
    {
        this.name = input;
    }
    public void setAddress(String input)
    {
        this.address = input;
    }
    public void setPhoneNumber(String input)
    {
        this.phoneNumber = input;
    }
    public void setContact(String input)
    {
        this.contact = input;
    }
    public void setMfgId(int input)
    {
        this.mfgId = input;
    }
    
    @Override
    public String toString()
    {
        return "\nManufacturer Name:\t" + getName() +
                "\nManufacturer ID:\t" + getMfgId() +
                "\nAddress:\t" + getAddress() +
                "\nPhone number:\t" + getPhoneNumber() +
                "\nPoint of contact:\t" + getContact();
    }
}
