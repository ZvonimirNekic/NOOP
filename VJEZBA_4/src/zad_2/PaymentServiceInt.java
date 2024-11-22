package zad_2;

/**
 * Sučelje koje definira metode za izvršavanje, poništavanje i ponovno izvršavanje transakcija.
 */
public interface PaymentServiceInt {
    void execute();
    void undo();
    void redo();
}
