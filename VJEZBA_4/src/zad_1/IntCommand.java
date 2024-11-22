package zad_1;

/**
 * Sučelje IntCommand definira metode za izvršavanje i poništavanje narudžbi.
 */
public interface IntCommand {
    void executeOrder();
    void undoOrder();
}
