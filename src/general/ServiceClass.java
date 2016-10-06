package general;
import hr.*;

/**
 * 
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class ServiceClass 
{
    private static int empId = 10000;
    
    public static int getEmployeeId()
    {
        return ++empId;
    }
}