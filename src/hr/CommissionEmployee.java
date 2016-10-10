package hr;

/**
 * This handles objects of the CommissionEmployee class
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class CommissionEmployee extends Employee
{
    private double commissionRate, grossSales;
    
    public CommissionEmployee(String firstName, String lastName, String gender,
                    String address, String phoneNumber, int year,
                    int month, int day, String position, String status,
                    double commissionRate)
    {
        super(firstName, lastName, gender, address, phoneNumber, year,
                month, day, position, status, commissionRate);
        
        // initialize data for commisison employee class
        this.commissionRate = 0.05;
        this.grossSales = 5000.00;
        super.setEarnings(getCommissionEarned());
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
    public void setCommissionRate(double comRate)
    {
        this.commissionRate = comRate;
    }   
    public void setGrossSales(double gSales)
    {
        this.grossSales = gSales;
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
                "\nCommission Rate:\t" + (getCommissionRate() * 100) + "%"
                + "\nGross Sales:\t" + getGrossSales()
                + "\nCommission Earned:\t" + super.getEarnings();
    }
}