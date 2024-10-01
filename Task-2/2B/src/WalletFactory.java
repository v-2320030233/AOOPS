public class WalletFactory extends PaymentFactory
{
    @Override
    public PaymentMethod createPaymentMethod()
    {
        return new WalletPayment();
    }
    @Override
    public Invoice createInvoice()
    {
        return new WalletInvoice();
    }
}