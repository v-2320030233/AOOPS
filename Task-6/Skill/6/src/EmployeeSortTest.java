import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
public class EmployeeSortTest
{
    public static void main(String[] args)
    {
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(new Employee(3, "Alice", 50000));
        employeeList.addEmployee(new Employee(1, "Bob", 60000));
        employeeList.addEmployee(new Employee(2, "Charlie", 40000));
        try
        {
            Employee clonedEmployee = (Employee) employeeList.iterator().next().clone();
            System.out.println("Cloned employee: " + clonedEmployee);
        } 
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        employeeList.sortById();
        System.out.println("Sorted by ID:");
        for (Employee emp : employeeList)
        {
            System.out.println(emp);
        }
        employeeList.sortByName();
        System.out.println("\nSorted by Name:");
        for (Employee emp : employeeList)
        {
            System.out.println(emp);
        }
        employeeList.sortBySalary();
        System.out.println("\nSorted by Salary:");
        for (Employee emp : employeeList)
        {
            System.out.println(emp);
        }
    }
}