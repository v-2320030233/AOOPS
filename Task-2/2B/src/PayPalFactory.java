public class PayPalFactory extends PaymentFactory
{
    @Override
    public PaymentMethod createPaymentMethod()
    {
        return new PayPalPayment();
    }
    @Override
    public Invoice createInvoice()
    {
        return new PayPalInvoice();
    }
}