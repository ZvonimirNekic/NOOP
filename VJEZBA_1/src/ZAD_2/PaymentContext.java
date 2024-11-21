package ZAD_2;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    /**
     * Postavlja strategiju plaćanja.
     *
     * @param paymentStrategy strategija plaćanja
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Procesira plaćanje korištenjem trenutne strategije.
     *
     * @param amount iznos za plaćanje
     */
    public void pay(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Strategija plaćanja nije postavljena.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}