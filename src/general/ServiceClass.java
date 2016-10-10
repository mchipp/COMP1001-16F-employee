package general;

import java.util.*;

/**
 * This service class handles various frequently used methods in assignment 1.
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class ServiceClass 
{
    private static int empId = 10000;
    private static int prodId = 20000;
    
    // menu interface
    public static void getInitialMessage()
    {
        System.out.println("Welcome to ACME!!\n"
        + "Please enter an option:\n"
        + "1. Create new hourly employee.\n"
        + "2. Create new salaried employee.\n"
        + "3. Create new commission employee.\n"
        + "4. Search for an employee.\n"
        + "5. Search for a product.\n"
        + "6. Exit.\n");
    }
    
    // sets incremental empId
    public static int setEmployeeId()
    {
        return ++empId;
    }
    
    // sets incremental prodId
    public static int setProductId()
    {
        return ++prodId;
    }
    
    // check that input isn't empty
    public static boolean stringCheck(String testString)
    {
        return testString.trim().isEmpty();
    }
    
    // check that input is only integer numerals
    public static boolean intCheck(String testString)
    {
        return testString.matches("[0-9]+");
    }
    
    // check that input is only double numerals
    public static boolean doubleCheck(String testString)
    {
        return testString.matches("([0-9]*)\\.([0-9]*)");
    }
    
    // prompt user for input
    public static void inputPrompt(String text)
    {
        System.out.println("Please enter the " + text + ":");
    }
    
    // warn user that input is invalid
    public static void invalidInput()
    {
        System.out.println("Invalid input! Please try again.");
    }
    
    // check maximum days for given month
    public static int checkMaxDays(int month)
    {
        int[] monthsWith31Days = {1,3,5,7,8,10,12};
        int maxDays = 0;
                    
        for(int d : monthsWith31Days)
        {
            if(month == d)
            {
                maxDays = 31;
            }
            else if(month != 2)
            {
                maxDays = 30;
            }
            else if(month == 2)
            {
                maxDays = 29;
            }
        }
        
        return maxDays;
    }
    
    // no search results
    public static void noSearchResults()
    {   
       Scanner read = new Scanner(System.in);
        System.out.println("Your search did not return any results\n");
        //read.nextLine(); 
    }
}