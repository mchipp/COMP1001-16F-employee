package general;
import hr.*;

/**
 *
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class EmployeeTesterClass 
{
    public static void main(String[] args)
    {
        //Employee myEmployee = new Employee("Michale", "Knight");
        Employee myEmployee = new Employee("Michael", "Knight", "male", "123 Anywhere St", "123-456-7890", 1972, 04, 25, "Sales", "full-time", 00323, 11.50);
        CommissionSalesEmployee myCommissionSalesEmployee = new CommissionSalesEmployee("Jessica", "James", "female",
                "456 Somewhere Else", "123-987-2345", 1923, 3, 30, "Salesperson", "full-time", 00324, 11.59, 1.3 );
        
        System.out.print(myEmployee.toString());
        System.out.print(myCommissionSalesEmployee.toString());
    }

}
