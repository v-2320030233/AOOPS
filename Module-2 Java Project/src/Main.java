import java.util.List;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        List<SalesRecord> salesData = SalesData.getSampleData();
        SalesAnalysis.totalSalesByRegion(salesData);
        SalesAnalysis.averageSalesByProduct(salesData);
        SalesAnalysis.topSellingProduct(salesData);
    }
}
