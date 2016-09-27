package general;
import hr.*;

/**
 *
 * @author ch1ffr3
 */
public class ServiceClass 
{
    private static int empId = 10000;
    
    public static int getEmployeeId()
    {
        return ++empId;
    }
}