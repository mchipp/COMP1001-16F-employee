package hr;

/**
 * This handles objects of the SalaryEmployee class
 * @author Mark Chipp 200180985 <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class SalaryEmployee extends Employee
{
    private double biWeeklySalary;
    
    public SalaryEmployee(String firstName, String lastName, String gender,
                    String address, String phoneNumber, int year,
                    int month, int day, String position, String status,
                    double biWeeklySalary)
    {
        super(firstName, lastName, gender, address, phoneNumber, year,
                month, day, position, status, biWeeklySalary);
        this.biWeeklySalary = biWeeklySalary;
        super.setEarnings(biWeeklySalary);
        
    }
    
    //Accessors (get methods)    
    public double getSalary()
    {
        return this.biWeeklySalary;
    }
    
    //Mutators (set methods)
    public void setSalary(double salary)
    {
        biWeeklySalary = salary;
    }
    
    @Override
    public double getEarnings()
    {
        return getSalary();
    }
    
    @Override
    public String toString()
    {
        return super.toString() +
                "\nBi-Weekly Salary:\t" + getEarnings();
    }
}
