package hr;

import general.ServiceClass;
import java.util.*;

/**
 * 
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public abstract class Employee
{
    //private data members
    private String firstName, lastName, gender, address, phoneNumber, position,
            status;
    private int empId;
    //variables holding dates for dateOfBirth
    private GregorianCalendar dateOfBirth, dateOfHire;
    //variables for pay information
    private double payRate, earnings;
    
    //constructors
    public Employee()
    {}
    
    //overloaded constructor
    public Employee(String firstName, String lastName, String gender,
                    String address, String phoneNumber, int year, int month,
                    int day, String position, String status, int empId,
                    double payRate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber; 
        this.dateOfBirth = new GregorianCalendar();
        this.dateOfBirth.set(Calendar.YEAR, year);
        this.dateOfBirth.set(Calendar.MONTH, month-1);
        this.dateOfBirth.set(Calendar.DATE, day);
        this.position = position;
        this.status = status;
        this.empId = ServiceClass.setEmployeeId();
        this.payRate = payRate;
    }
    
    /**
     * Method to get firstName
     * @return 
     */
    public String getFirstName()
    {
        return this.firstName;
    }
    
    /**
     * Method to get lastName
     * @return 
     */
    public String getLastName()
    {
        return this.lastName;      
    }
    
    /**
     * Overridden toString method to return concatenated variables
     * @return 
     */
    @Override
    public String toString()
    {
        return "\nFirst Name:\t" + getFirstName() +
                "\nLast Name:\t" + getLastName();
    }
}
