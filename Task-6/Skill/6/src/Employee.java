import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
class Employee implements Comparable<Employee>, Cloneable
{
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    @Override
    public int compareTo(Employee other)
    {
        return Integer.compare(this.id, other.id);
    }
    public static Comparator<Employee> byName()
    {
        return (e1, e2) -> e1.name.compareTo(e2.name);
    }
    public static Comparator<Employee> bySalary()
    {
        return (e1, e2) -> Double.compare(e1.salary, e2.salary);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    @Override
    public String toString()
    {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}