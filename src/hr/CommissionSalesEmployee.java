package hr;

/**
 *
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class CommissionSalesEmployee extends Employee
{
    private double commissionRate, grossSales, commissionTotal;
    
    public CommissionSalesEmployee(String firstName, String lastName, String gender,
                    String address, String phoneNumber, int year, int month,
                    int day, String position, String status, int empId,
                    double payRate, double commissionRate)
    {
        super(firstName, lastName, gender, address, phoneNumber, year, month, day,
                position, status, empId, payRate);
        this.commissionRate = commissionRate;
        setGrossSales();
    }
    
    public void setGrossSales()
    {
        this.grossSales = 5000.00;
    }
    
    public double getCommissionRate()
    {
        return this.commissionRate;
    }
    
    public double getGrossSales()
    {
        return this.grossSales;
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
                "\nGross Sales:\t" + getGrossSales() +
                "\nCommission Earned:\t" + getCommissionEarned();
    }
}
