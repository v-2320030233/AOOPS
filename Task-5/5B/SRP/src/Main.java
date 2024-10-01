public class Main
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Alice", "Developer");
        Employee employee2 = new Employee("Bob", "Manager");
        SalaryCalculator calculator = new SalaryCalculator();
        System.out.println("Salary of " + employee1.getName() + ": $" + calculator.calculateSalary(employee1));
        System.out.println("Salary of " + employee2.getName() + ": $" + calculator.calculateSalary(employee2));
    }
}