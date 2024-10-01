public class CreditCardFactory extends PaymentFactory
{
    @Override
    public PaymentMethod createPaymentMethod()
    {
        return new CreditCardPayment();
    }
    @Override
    public Invoice createInvoice()
    {
        return new CreditCardInvoice();
    }
}