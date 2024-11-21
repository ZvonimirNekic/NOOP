package ZAD_2;

public class PayPalPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Plaćanje iznosa " + amount + " eur putem PayPal-a.");
    }
}
