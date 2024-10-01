import java.time.LocalDate;
public class SalesRecord
{
    private String productName;
    private int quantitySold;
    private double price;
    private String region;
    private LocalDate saleDate;
    public SalesRecord(String productName, int quantitySold, double price, String region, LocalDate saleDate)
    {
        this.productName = productName;
        this.quantitySold = quantitySold;
        this.price = price;
        this.region = region;
        this.saleDate = saleDate;
    }
    public String getProductName()
    {
        return productName;
    }
    public int getQuantitySold()
    {
        return quantitySold;
    }
    public double getPrice()
    {
        return price;
    }
    public String getRegion()
    {
        return region;
    }
    public LocalDate getSaleDate()
    {
        return saleDate;
    }
}
