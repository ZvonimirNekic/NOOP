package ZAD_2;

public class CashOnDeliveryPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Plaćanje iznosa " + amount + " eur pouzećem.");
    }
}
