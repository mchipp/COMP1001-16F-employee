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
        System.out.println("Welcome to Georgian!\n"
        + " Please enter an option:\n"
        + "1. Create new Part time student.\n"
        + "2. Create new Full time student.\n"
        + "3. Exit.\n");
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