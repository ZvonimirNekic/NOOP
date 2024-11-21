package ZAD_2;

public interface PaymentStrategy {
    /**
     * Procesira plaćanje određenog iznosa.
     *
     * @param amount iznos za plaćanje
     */
    void pay(double amount);
}
