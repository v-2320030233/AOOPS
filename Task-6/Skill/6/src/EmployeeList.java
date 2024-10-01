import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
class EmployeeList implements Iterable<Employee>
{
    private List<Employee> employees;
    public EmployeeList()
    {
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }
    public void sortById()
    {
        Collections.sort(employees);
    }
    public void sortByName()
    {
        employees.sort(Employee.byName());
    }
    public void sortBySalary()
    {
        employees.sort(Employee.bySalary());
    }
    @Override
    public Iterator<Employee> iterator()
    {
        return employees.iterator();
    }
}
