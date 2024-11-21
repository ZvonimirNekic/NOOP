package ZAD_2;

public class App {
    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CardPaymentStrategy());
        paymentContext.pay(100);

        paymentContext.setPaymentStrategy(new PayPalPaymentStrategy());
        paymentContext.pay(200);

        paymentContext.setPaymentStrategy(new CashOnDeliveryPaymentStrategy());
        paymentContext.pay(300);

        paymentContext.setPaymentStrategy(new BitcoinPaymentStrategy());
        paymentContext.pay(400);
    }
}
