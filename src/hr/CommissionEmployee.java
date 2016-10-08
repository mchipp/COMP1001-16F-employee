package hr;

/**
 *
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class CommissionEmployee extends Employee
{
    private double commissionRate, grossSales;
    
    public CommissionEmployee(String firstName, String lastName, String gender,
                    String address, String phoneNumber, int sin, int year, int month,
                    int day, double grossSales, double commissionRate)
    {
        super(firstName, lastName, gender, address, phoneNumber, sin, year, month, day);
        
        // initialize data for commisison employee class
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    //Accessors (get methods)
    public double getCommissionRate()
    {
        return this.commissionRate;
    }    
    public double getGrossSales()
    {
        return this.grossSales;
    }
    
    //Mutators (set mehods)    
    public void setGrossSales(double grossSales)
    {
        this.grossSales = grossSales;
    }
    
    /**
     * This method will take the commission rate and gross sales to calculate
     * the total commission earned.
     * @return 
     */
    public double getCommissionEarned()
    {
        return getCommissionRate() * getGrossSales();
    }
    
    @Override
    public String toString()
    {
        return super.toString() + 
                "\nCommission Rate:\t" + getCommissionRate() +
                "\nGross Sales:\t" + getGrossSales();
    }
}
