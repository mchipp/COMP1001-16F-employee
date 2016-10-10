package general;
import hr.*;
import inventory.*;
import java.util.*;

/**
 *
 * @author Mark Chipp 200180985 <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class Main 
{
    public static void main(String[] args)
    {
        // manufacturers
        Manufacturer starDollars = new Manufacturer("Star Dollars", "123 Bean Blvd", "705-476-2039", "Richard Roast", 48293);
        Manufacturer thirdMug = new Manufacturer("Third Mug", "415 Latte Lane", "705-235-2345", "Beverly Beverage", 6859);
        Manufacturer cityStyle = new Manufacturer("City Style", "653 Cream Court", "705-654-2354", "Micahel Macchiato", 5345);
        
        // arraylist of products
        ArrayList<Product> myProductList = new ArrayList();
        Product boldCoffee = new Product("Bold Coffee", "Dark roast", 23, 20.00, starDollars);
        Product decafCoffee = new Product("Decaf Coffee", "Decaf roast", 65, 32.00, thirdMug);
        Product blondCoffee = new Product("Blond Coffee", "Medium roast", 52, 12.00, cityStyle);
        myProductList.add(boldCoffee);
        myProductList.add(decafCoffee);
        myProductList.add(blondCoffee);
        
        // arraylist that will hold employee objects
        ArrayList<Employee> myEmployeeList = new ArrayList();
        
        Scanner read = new Scanner(System.in);
        boolean keepGoing = true;
        String input = "6";
        
        ServiceClass.getInitialMessage();
        
        while(keepGoing)
        {
            input = read.nextLine();
            
            //add an hourly employee
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
                    ServiceClass.inputPrompt("phone number including area code");
                    if(!ServiceClass.stringCheck(phoneNumber = read.nextLine()))
                    {
                        if(ServiceClass.intCheck(phoneNumber) && phoneNumber.length() == 10)
                        {
                            innerKeepGoing = false;                            
                        }
                        else
                        {
                            System.out.println("Phone number must contain only numerals.");
                        }
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("year of birth");
                    String inputValue = read.nextLine();
                    if(ServiceClass.intCheck(inputValue))
                    {
                        if(inputValue.length() == 4)
                        {
                            year = Integer.parseInt(inputValue);
                            innerKeepGoing = false;
                        }
                        else
                        {
                            System.out.println("Please enter year as four digits.");
                        }
                    }
                    else
                    {
                        System.out.println("Please use only numbers");
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("month of birth [01-12]");
                    String inputValue = read.nextLine();
                    if(ServiceClass.intCheck(inputValue))
                    {
                        if(inputValue.length() <= 2)
                        {
                            if(Integer.parseInt(inputValue) <= 12 && Integer.parseInt(inputValue) >= 1)
                            {
                                month = Integer.parseInt(inputValue);
                                innerKeepGoing = false;
                            }
                            else
                            {
                                System.out.println("Month must be a number from 1-12.");
                            }
                        }
                        else
                        {
                            System.out.println("Month cannot exceed two digits.");
                        }
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
                    
                    int maxDay = ServiceClass.checkMaxDays(month);
                    
                    if(ServiceClass.intCheck(inputValue))
                    {
                        if(!(Integer.parseInt(inputValue) > maxDay))
                        {
                            day = Integer.parseInt(inputValue);
                            innerKeepGoing = false;                            
                        }
                        else
                        {
                            System.out.println("The day can not exceed " + maxDay);
                        }
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
                
                
                System.out.println("\n" + employee.getFullName() + " has been added!\n");
                System.out.println("Press enter to continue");
                read.nextLine();             
                ServiceClass.getInitialMessage();
            }
            //add salary employee
            else if("2".equals(input))
            {
                //get salary employee information
                String firstName, lastName, gender, address, phoneNumber, position,
                        status;
                int year=0, month=0, day=0;
                double salary=0;
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
                    ServiceClass.inputPrompt("phone number including area code");
                    if(!ServiceClass.stringCheck(phoneNumber = read.nextLine()))
                    {
                        if(ServiceClass.intCheck(phoneNumber) && phoneNumber.length() == 10)
                        {
                            innerKeepGoing = false;                            
                        }
                        else
                        {
                            System.out.println("Phone number must contain only numerals.");
                        }
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("year of birth");
                    String inputValue = read.nextLine();
                    if(ServiceClass.intCheck(inputValue))
                    {
                        if(inputValue.length() == 4)
                        {
                            year = Integer.parseInt(inputValue);
                            innerKeepGoing = false;
                        }
                        else
                        {
                            System.out.println("Please enter year as four digits.");
                        }
                    }
                    else
                    {
                        System.out.println("Please use only numbers");
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("month of birth [01-12]");
                    String inputValue = read.nextLine();
                    if(ServiceClass.intCheck(inputValue))
                    {
                        if(Integer.parseInt(inputValue) <= 12 && Integer.parseInt(inputValue) >= 1)
                        {
                            month = Integer.parseInt(inputValue);
                            innerKeepGoing = false;
                        }
                        else
                        {
                            System.out.println("Month must be a number from 1-12.");
                        }
                    }
                    else
                    {
                        System.out.println("Month must be a number from 1-12.");
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("day of birth");
                    String inputValue = read.nextLine();
                    int maxDay = ServiceClass.checkMaxDays(month);
                    
                    if(ServiceClass.intCheck(inputValue))
                    {
                        if(!(Integer.parseInt(inputValue) > maxDay))
                        {
                            day = Integer.parseInt(inputValue);
                            innerKeepGoing = false;                            
                        }
                        else
                        {
                            System.out.println("The day can not exceed " + maxDay);
                        }
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
                    ServiceClass.inputPrompt("salary rate");
                    String inputValue = read.nextLine();
                    if(ServiceClass.doubleCheck(inputValue))
                    {
                        salary = Double.parseDouble(inputValue);
                        innerKeepGoing = false;
                    }
                    else
                    {
                        System.out.println("Please use only a number with two decimal places");
                    }
                }while(innerKeepGoing);
                
                SalaryEmployee employee = new SalaryEmployee(firstName, lastName, gender, address, phoneNumber, year,
                month, day, position, status, salary);
                
                myEmployeeList.add(employee);                
                
                System.out.println("\n" + employee.getFullName() + " has been added!\n");
                System.out.println("Press enter to continue");
                read.nextLine();             
                ServiceClass.getInitialMessage();
            }
            //add commission employee
            else if("3".equals(input))
            {
                //get commission employee information
                
                String firstName, lastName, gender, address, phoneNumber, position,
                        status;
                int year=0, month=0, day=0;
                double commissionRate=0;
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
                    ServiceClass.inputPrompt("phone number including area code");
                    if(!ServiceClass.stringCheck(phoneNumber = read.nextLine()))
                    {
                        if(ServiceClass.intCheck(phoneNumber) && phoneNumber.length() == 10)
                        {
                            innerKeepGoing = false;                            
                        }
                        else
                        {
                            System.out.println("Phone number must contain only numerals.");
                        }
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("year of birth");
                    String inputValue = read.nextLine();
                    if(ServiceClass.intCheck(inputValue))
                    {
                        if(inputValue.length() == 4)
                        {
                            year = Integer.parseInt(inputValue);
                            innerKeepGoing = false;
                        }
                        else
                        {
                            System.out.println("Please enter year as four digits.");
                        }
                    }
                    else
                    {
                        System.out.println("Please use only numbers");
                    }
                }while(innerKeepGoing);
                
                innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("month of birth [01-12]");
                    String inputValue = read.nextLine();
                    if(ServiceClass.intCheck(inputValue))
                    {
                        if(inputValue.length() <= 2)
                        {
                            if(Integer.parseInt(inputValue) <= 12 && Integer.parseInt(inputValue) >= 1)
                            {
                                month = Integer.parseInt(inputValue);
                                innerKeepGoing = false;
                            }
                            else
                            {
                                System.out.println("Month must be a number from 1-12.");
                            }
                        }
                        else
                        {
                            System.out.println("Month cannot exceed two digits.");
                        }
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
                    int maxDay = ServiceClass.checkMaxDays(month);
                    
                    if(ServiceClass.intCheck(inputValue))
                    {
                        if(!(Integer.parseInt(inputValue) > maxDay))
                        {
                            day = Integer.parseInt(inputValue);
                            innerKeepGoing = false;                            
                        }
                        else
                        {
                            System.out.println("The day can not exceed " + maxDay);
                        }
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
                
                /*                
                //Employees can receive individual commission rates (useful for senority, experience, position)
                do
                {
                    ServiceClass.inputPrompt("commission rate (example 0.1 = 10%)");
                    String inputValue = read.nextLine();
                    if(ServiceClass.doubleCheck(inputValue))
                    {
                        commissionRate = Double.parseDouble(inputValue);
                        innerKeepGoing = false;
                    }
                    else
                    {
                        System.out.println("Please use only a number with two decimal places");
                    }
                }while(innerKeepGoing);*/             
                
                // comment this line out and uncomment above block for custom rates per employee
                commissionRate = 0.05;
                
                CommissionEmployee employee = new CommissionEmployee(firstName, lastName, gender, address, phoneNumber, year,
                month, day, position, status, commissionRate);
                
                myEmployeeList.add(employee); 
                
                System.out.println("\n" + employee.getFullName() + " has been added!\n");
                System.out.println("Press enter to continue");
                read.nextLine();             
                ServiceClass.getInitialMessage();
            }
            else if("4".equals(input))
            {
                //search for employee
                String searchTerms;
                ServiceClass.inputPrompt("first AND last name, or employee ID of the employee you wish to search for:");
                
                searchTerms = read.nextLine();
                
                for(Employee e : myEmployeeList)
                {
                    if(ServiceClass.intCheck(searchTerms))
                    {
                        if(e.getEmpId() == Integer.parseInt(searchTerms))
                        {
                            System.out.println(e.toString());
                            System.out.println("Press enter to continue");
                            read.nextLine();                  
                        }
                        else
                        {
                            ServiceClass.noSearchResults();
                        }
                    }
                    else if(e.getFullName().equalsIgnoreCase(searchTerms))
                    {
                            System.out.println(e.toString());
                            System.out.println("Press enter to continue");
                            read.nextLine();
                    }
                    else
                    {
                        ServiceClass.noSearchResults();                 
                    }
                }
                ServiceClass.getInitialMessage();       
            }
            else if("5".equals(input))
            {
                //search for prudct
                String searchTerms;
                ServiceClass.inputPrompt("name or item ID of the product you wish to search for:");
                
                searchTerms = read.nextLine();
                
                for(Product p : myProductList)
                {
                    if(ServiceClass.intCheck(searchTerms))
                    {
                        if(p.getItemId() == Integer.parseInt(searchTerms))
                        {
                            System.out.println(p.toString());
                            System.out.println("Press enter to continue");
                            read.nextLine();                  
                        }
                        else
                        {
                            ServiceClass.noSearchResults();                 
                        }
                    }
                    else if(p.getName().equalsIgnoreCase(searchTerms))
                    {
                            System.out.println(p.toString());
                            System.out.println("Press enter to continue");
                            read.nextLine();
                    }
                    else
                    {
                        ServiceClass.noSearchResults();                 
                    }
                }
                ServiceClass.getInitialMessage();
            }
            else if("6".equals(input))
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
