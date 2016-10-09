package general;
import hr.*;

/**
 * 
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class ServiceClass 
{
    private static int empId = 10000;
    
    // menu interface
    public static void getInitialMessage()
    {
        System.out.println("Welcome to ACME!!\n"
        + " Please enter an option:\n"
        + "1. Create new hourly employee.\n"
        + "2. Create new salaried employee.\n"
        + "3. Create new commission employee.\n"
        + "4. Exit.\n");
    }
    
    // sets incremental empId
    public static int setEmployeeId()
    {
        return ++empId;
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
}