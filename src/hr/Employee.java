package hr;

import general.*;
import java.util.*;

/**
 * 
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public abstract class Employee
{
    //superclass variables
    
    //private data members
    private String firstName, lastName, gender, address, phoneNumber, position,
            status;
    private int empId;
    //variables holding dates for dateOfBirth
    private GregorianCalendar dateOfBirth;
    private Date dateOfHire;
    //variables for pay information
    private double payRate, earnings;
    private static int employeeCount;
    
    //constructors
    public Employee()
    {}
    
    //overloaded constructor
    public Employee(String firstName, String lastName, String gender,
                    String address, String phoneNumber, int year, int month,
                    int day, String position, String status, double payRate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber; 
        this.dateOfHire = new GregorianCalendar().getTime();
        this.dateOfBirth = new GregorianCalendar();
        this.dateOfBirth.set(Calendar.YEAR, year);
        this.dateOfBirth.set(Calendar.MONTH, month-1);
        this.dateOfBirth.set(Calendar.DATE, day);
        this.empId = ServiceClass.setEmployeeId();
        this.position = position;
        this.status = status;
        this.payRate = payRate;
        employeeCount++;
    }
    
    //Accessors (get methods)
    public String getFirstName()
    {
        return this.firstName;
    }    
    public String getLastName()
    {
        return this.lastName;      
    }    
    public String getFullName()
    {
        return this.firstName + " " + this.lastName;
    }   
    public String getGender()
    {
        return this.gender;
    }    
    public String getAddress()
    {
        return this.address;
    }    
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }    
    public GregorianCalendar getDateOfBirth()
    {
        return this.dateOfBirth;
    }     
    public String getPosition()
    {
        return this.position;
    } 
    public String getStatus()
    {
        return this.status;
    }    
    public int getEmpId()
    {
        return this.empId;
    }    
    public double getPayRate()
    {
        return this.payRate;
    }    
    public double getEarnings()
    {
        return getPayRate();
    }
    public Date getHireDate()
    {
        return this.dateOfHire;
    }
    
    //Mutators (set methods)
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public void setDateOfBirth(int year, int month, int day)
    {
        this.dateOfBirth=new GregorianCalendar();
        this.dateOfBirth.set(Calendar.YEAR, year);
        this.dateOfBirth.set(Calendar.MONTH,month-1);
        this.dateOfBirth.set(Calendar.DATE,day);
    }
    public void setDateOfHire(int year, int month, int day)
    {
        GregorianCalendar hireDate = new GregorianCalendar();
        hireDate.set(Calendar.YEAR, year);
        hireDate.set(Calendar.MONTH,month-1);
        hireDate.set(Calendar.DATE,day);
    }
    public void setStatus(String status)
    {
        this.status=status;
    }
    public void setPosition(String position)
    {
        this.position=position;
    }
    public void setPayRate(Double payRate)
    {
        this.payRate = payRate;
    }
    public void setEarnings(double earned)
    {
        this.earnings = earned;
    }
    
    /**
     * Overrides toString()
     * @return 
     */
    @Override
    public String toString()
    {
        return "\nName:\t" + getFullName() +
                "\nHire Date:\t" + getHireDate() + 
                "\nEmployee ID:\t" + getEmpId() +
                "\nPosition:\t" + getPosition();
    }
}