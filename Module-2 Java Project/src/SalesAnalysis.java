import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class SalesAnalysis
{
    public static void totalSalesByRegion(List<SalesRecord> salesRecords)
    {
        Map<String, Double> totalSalesByRegion = salesRecords.stream()
            .collect(Collectors.groupingBy(SalesRecord::getRegion,
                    Collectors.summingDouble(record -> record.getQuantitySold() * record.getPrice())));
        totalSalesByRegion.forEach((region, totalSales) -> 
            System.out.println("Region: " + region + ", Total Sales: $" + totalSales));
    }
    public static void averageSalesByProduct(List<SalesRecord> salesRecords)
    {
        Map<String, Double> averageSalesByProduct = salesRecords.stream()
            .collect(Collectors.groupingBy(SalesRecord::getProductName,
                    Collectors.averagingDouble(record -> record.getQuantitySold() * record.getPrice())));
        averageSalesByProduct.forEach((product, averageSales) ->
            System.out.println("Product: " + product + ", Average Sales: $" + averageSales));
    }
    public static void topSellingProduct(List<SalesRecord> salesRecords)
    {
        salesRecords.stream()
            .collect(Collectors.groupingBy(SalesRecord::getProductName,
                    Collectors.summingDouble(record -> record.getQuantitySold() * record.getPrice())))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .ifPresent(entry -> 
                System.out.println("Top-Selling Product: " + entry.getKey() + ", Sales: $" + entry.getValue()));
    }
}
