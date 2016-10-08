package hr;

/**
 *
 * @author Mark Chipp 200180985 <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class HourlyEmployee extends Employee
{
    private double hourlyRate;
    
    public HourlyEmployee(String firstName, String lastName, String gender,
                    String address, String phoneNumber, int sin, int year,
                    int month, int day, String position, String status,
                    double payRate, double earnings)
    {
        super(firstName, lastName, gender, address, phoneNumber, sin, year,
                month, day, position, status, payRate, earnings);
        
    }
}
