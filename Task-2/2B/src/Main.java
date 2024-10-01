public class Main
{
    public static void main(String[] args)
    {
        UserAuth auth = UserAuth.getInstance();
        auth.login("user", "password");
        if (auth.isAuthenticated())
        {
            VehicleFactory carFactory = new CarFactory();
            Vehicle car = carFactory.createVehicle();
            car.ride();
            PaymentFactory creditCardFactory = new CreditCardFactory();
            PaymentMethod creditCard = creditCardFactory.createPaymentMethod();
            creditCard.pay(15.50);
            Invoice creditCardInvoice = creditCardFactory.createInvoice();
            creditCardInvoice.generateInvoice();
            auth.logout();
        } 
        else
        {
            System.out.println("Authentication failed. Cannot proceed with the ride request.");
        }
        if (auth.isAuthenticated())
        {
            VehicleFactory bikeFactory = new BikeFactory();
            Vehicle bike = bikeFactory.createVehicle();
            bike.ride();
        }
        else
        {
            System.out.println("User is not authenticated. Please log in to request a ride.");
        }
    }
}
