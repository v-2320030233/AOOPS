import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
public class EmployeeStreamOperations
{
    public static void main(String[] args)
    {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 60000),
            new Employee(2, "Bob", 75000),
            new Employee(3, "Charlie", 50000),
            new Employee(4, "David", 80000),
            new Employee(5, "Eva", 55000),
            new Employee(6, "Frank", 90000),
            new Employee(7, "Grace", 70000),
            new Employee(8, "Hannah", 62000),
            new Employee(9, "Ian", 45000),
            new Employee(10, "Jack", 65000)
        );
        System.out.println("Employees with salary greater than 60,000:");
        employees.stream()
                 .filter(emp -> emp.getSalary() > 60000)
                 .forEach(System.out::println);
        System.out.println("\nEmployees sorted by salary in descending order:");
        employees.stream()
                 .sorted(Comparator.comparing(Employee::getSalary).reversed())
                 .forEach(System.out::println);
        System.out.println("\nEmployee with the highest salary:");
        Employee highestSalaryEmployee = employees.stream()
                                                  .max(Comparator.comparing(Employee::getSalary))
                                                  .orElseThrow(() -> new RuntimeException("No employees found"));
        System.out.println(highestSalaryEmployee);
        System.out.println("\nAverage salary of employees:");
        OptionalDouble averageSalary = employees.stream()
                                                .mapToDouble(Employee::getSalary)
                                                .average();
        if (averageSalary.isPresent())
        {
            System.out.println(averageSalary.getAsDouble());
        }
        else
        {
            System.out.println("No employees found.");
        }
    }
}
