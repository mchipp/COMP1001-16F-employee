package general;
import hr.*;
import java.util.*;

/**
 *
 * @author Mark Chipp 200180985 <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class Main 
{
    public static void main(String[] args)
    {
        //arraylist that will hold employee objects
        ArrayList<Employee> myEmployeeList = new ArrayList();
        Scanner read = new Scanner(System.in);
        boolean keepGoing = true;
        String input = "3";
        
        ServiceClass.getInitialMessage();
        input = read.nextLine();
        
        while(keepGoing)
        {
            if(input == "1")
            {
                //gather employee information
                String firstName, lastName, gender, address, phoneNumber, position,
                        status;
                int year, month, day;
                double payRate;
                boolean innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("first name");
                    firstName = read.nextLine();
                    if(ServiceClass.stringCheck(firstName))
                    {
                        innerKeepGoing = false;
                    }
                }while(innerKeepGoing);
            }
            else if(input == "2")
            {
                
            }
            else if(input == "3")
            {
                //set loop check to exit loop
                keepGoing = false;
            }
            else
            {
                ServiceClass.invalidInput();
            }
        }
    }
}
