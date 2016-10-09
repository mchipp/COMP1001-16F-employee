package general;
import hr.*;
import java.util.*;
import sun.security.util.Debug;

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
        String input = "4";
        
        ServiceClass.getInitialMessage();
        
        while(keepGoing)
        {
            input = read.nextLine();
            
            if("1".equals(input))
            {
                //gather hourly employee information
                String firstName, lastName, gender, address, phoneNumber, position,
                        status;
                int year=0, month=0, day=0;
                double payRate=0;
                boolean innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("first name");
                    if(!ServiceClass.stringCheck(firstName = read.nextLine()))
                    {
                        innerKeepGoing = false;
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("last name");
                    if(!ServiceClass.stringCheck(lastName = read.nextLine()))
                    {
                        innerKeepGoing = false;
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("gender");
                    if(!ServiceClass.stringCheck(gender = read.nextLine()))
                    {
                        innerKeepGoing = false;
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("address");
                    if(!ServiceClass.stringCheck(address = read.nextLine()))
                    {
                        innerKeepGoing = false;
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("phone number");
                    if(!ServiceClass.stringCheck(phoneNumber = read.nextLine()))
                    {
                        innerKeepGoing = false;
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("year of birth");
                    String inputValue = read.nextLine();
                    if(ServiceClass.intCheck(inputValue))
                    {
                        year = Integer.parseInt(inputValue);
                        innerKeepGoing = false;
                    }
                    else
                    {
                        System.out.println("Please use only numbers");
                    }
                    
                    
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("month of birth");
                    String inputValue = read.nextLine();
                    if(ServiceClass.intCheck(inputValue))
                    {
                        month = Integer.parseInt(inputValue);
                        innerKeepGoing = false;
                    }
                    else
                    {
                        System.out.println("Please use only numbers");
                    }
                    
                    
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("day of birth");
                    String inputValue = read.nextLine();
                    if(ServiceClass.intCheck(inputValue))
                    {
                        day = Integer.parseInt(inputValue);
                        innerKeepGoing = false;
                    }
                    else
                    {
                        System.out.println("Please use only numbers");
                    }
                    
                    
                }while(innerKeepGoing);
                
                do
                {
                    ServiceClass.inputPrompt("position");
                    if(!ServiceClass.stringCheck(position = read.nextLine()))
                    {
                        innerKeepGoing = false;
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("status");
                    if(!ServiceClass.stringCheck(status = read.nextLine()))
                    {
                        innerKeepGoing = false;
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("hourly pay rate");
                    String inputValue = read.nextLine();
                    if(ServiceClass.doubleCheck(inputValue))
                    {
                        payRate = Double.parseDouble(inputValue);
                        innerKeepGoing = false;
                    }
                    else
                    {
                        System.out.println("Please use only a number with two decimal places");
                    }
                    
                    
                }while(innerKeepGoing);
                
                
                HourlyEmployee employee = new HourlyEmployee(firstName, lastName, gender, address, phoneNumber, year,
                month, day, position, status, payRate);
                
                myEmployeeList.add(employee);
                
                for(Employee e : myEmployeeList)
                {
                    System.out.println(e.toString());
                }
                
                System.out.println("Are you done?");
                String okay = read.nextLine();
                
                keepGoing = false;
            }
            else if("2".equals(input))
            {
                //get salary employee information
                
            }
            else if("3".equals(input))
            {
                //get commission employee information
            }
            else if("4".equals(input))
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
