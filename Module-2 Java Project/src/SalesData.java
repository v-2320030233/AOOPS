import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
public class SalesData
{
    public static List<SalesRecord> getSampleData()
    {
        return Arrays.asList(
            new SalesRecord("Laptop", 10, 1200.0, "North America", LocalDate.of(2024, 9, 10)),
            new SalesRecord("Smartphone", 5, 800.0, "Europe", LocalDate.of(2024, 9, 12)),
            new SalesRecord("Tablet", 8, 300.0, "Asia", LocalDate.of(2024, 9, 14)),
            new SalesRecord("Laptop", 3, 1200.0, "Europe", LocalDate.of(2024, 9, 16)),
            new SalesRecord("Smartphone", 6, 800.0, "Asia", LocalDate.of(2024, 9, 18))
        );
    }
}
