package hr;

import general.*;
import java.util.*;

/**
 *
 * @author Mark Chipp 200180985 <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class HourlyEmployee extends Employee
{
    private int hoursWorked;
    
    public HourlyEmployee(String firstName, String lastName, String gender,
                    String address, String phoneNumber, int year,
                    int month, int day, String position, String status,
                    double payRate)
    {
        super(firstName, lastName, gender, address, phoneNumber, year,
                month, day, position, status, payRate);
        this.hoursWorked = hoursWorked;
        super.setEarnings(this.getEarnings());
    }
    
    //Accessors (get methods)
    public int getHoursWorked()
    {
        return hoursWorked;
    }
    
    //Mutators (set methods)
    public void setHoursWorked(int hours)
    {
        this.hoursWorked = hours;
    }
    
    //Overriden methods    
    @Override
    public double getEarnings()
    {
        return getHoursWorked() * super.getPayRate();
    }
    
    @Override
    public String toString()
    {
        return super.toString() +
                "\nHourly Rate:\t" + super.getPayRate();
    }
}
