package inventory;

import general.*;

/**
 * This class handles Product objects for assignment 1
 * @author Mark Chipp 200180985 <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class Product
{
    // private variables
    private String name, description;
    private int itemId, amount;
    private double cost;
    private Manufacturer mfg;
    
    // constructore
    public Product()
    {}
    
    public Product(String name, String description, int amount, double cost, Manufacturer mfg)
    {
        this.name = name;
        this.description = description;
        this.itemId = ServiceClass.setProductId();
        this.amount = amount;
        this.cost = cost;
        this.mfg = mfg;
    }
    
    // Accessors
    public String getName()
    {
        return this.name;
    }
    public String getDescription()
    {
        return this.description;
    }
    public int getItemId()
    {
        return this.itemId;
    }
    public int getAmount()
    {
        return this.amount;
    }
    public double getCost()
    {
        return this.cost;
    }
    public Manufacturer getManufacturer()
    {
        return this.mfg;
    }
    
    // Mutators
    public void setName(String name)
    {
        this.name = name;
    }
    public void setDescription(String desc)
    {
        this.description = desc;
    }
    public void setItemId(int idNo)
    {
        this.itemId = idNo;
    }
    public void setAmount(int amt)
    {
        this.amount = amt;
    }
    public void setCost(double price)
    {
        this.cost = price;
    }
    public void setManufacturer(Manufacturer mfg)
    {
        this.mfg = mfg;
    }
    
    @Override
    public String toString()
    {
        return "\nProduct Name:\t" + getName() +
                "\nDescription:\t" + getDescription() +
                "\nItem Number:\t" + getItemId() +
                "\nAmount:\t" + getAmount() +
                "\nCost per unit:\t" + getCost() +
                "\nCost of inventory:\t" + (getCost()*getAmount());
    }
}
