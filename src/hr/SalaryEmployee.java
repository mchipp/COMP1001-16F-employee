package hr;

/**
 *
 * @author Mark Chipp 200180985 <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class SalaryEmployee extends Employee
{
    public SalaryEmployee(String firstName, String lastName, String gender,
                    String address, String phoneNumber, int year,
                    int month, int day, String position, String status,
                    double payRate)
    {
        super(firstName, lastName, gender, address, phoneNumber, year,
                month, day, position, status, payRate);
    }

}
