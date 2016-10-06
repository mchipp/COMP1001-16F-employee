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
        CommissionSalesEmployee myCommissionSalesEmployee = new CommissionSalesEmployee("Jessica", "James", "female",
                "456 Somewhere Else", "123-987-2345", 1923, 3, 30, "Salesperson", "full-time", 00324, 11.59, 1.3 );
        
        System.out.print(myCommissionSalesEmployee.toString());
    }

}
