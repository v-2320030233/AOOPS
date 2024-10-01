public class SalaryCalculator
{
    public double calculateSalary(Employee employee)
    {
        switch (employee.getRole())
        {
            case "Developer":
                return 6000.0;
            case "Manager":
                return 8000.0;
            default:
                return 4000.0;
        }
    }
}
