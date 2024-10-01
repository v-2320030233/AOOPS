public class PayPalInvoice extends Invoice
{
    @Override
    public void generateInvoice()
    {
        System.out.println("Generating invoice for PayPal payment.");
    }
}