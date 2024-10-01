public abstract class PaymentFactory
{
    public abstract PaymentMethod createPaymentMethod();
    public abstract Invoice createInvoice();
}