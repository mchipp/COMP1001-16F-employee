package hr;

import java.util.*;

/**
 * 
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public abstract class Employee
{
    private String firstName, lastName, gender, address, phoneNumber, position,
            status;
    private Date dateOfBirth, dateOfHire;
    private int empId;
    private double payRate, earnings;
    
    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Employee(String firstName, String lastName, String gender,
                    String address, String phoneNumber, int year, int month,
                    int day)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        dateOfBirth = new GregorianCalendar(year, month, day).getTime();
    }
    
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
        this.position = position;
        this.status = status;
        this.empId = empId;
        this.payRate = payRate;
        dateOfBirth = new GregorianCalendar(year, month, day).getTime();
        dateOfHire = new GregorianCalendar(year, month, day).getTime();
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;      
    }
    
    @Override
    public String toString()
    {
        return "\nFirst Name:\t" + getFirstName() +
                "\nLast Name:\t" + getLastName();
    }
}
