package zad_2;

/**
 * Ova klasa demonstrira korištenje Command Design Patterna za upravljanje transakcijama
 * (uplate, isplate, undo/redo) na računima (`CheckingAccount` i `ForeignCurrencyAccount`).
 *
 * Zadatak:
 * - Omogućiti izvršavanje transakcija na računima koristeći servis `PaymentService`.
 * - Implementirati undo i redo mehanizme putem Invokera (`MobAppInv`).
 * - Omogućiti specifične funkcionalnosti `ForeignCurrencyAccount` za isplate u eurima i kunama.
 */
public class MobilePhone {
    public static void main(String[] args) {
        MobAppInv mobApp = new MobAppInv();

        // Kreiranje računa
        CheckingAccount chAcc = new CheckingAccount("Sandra", 125);
        ForeignCurrencyAccount fcAcc = new ForeignCurrencyAccount("John", 100);

        // Demonstracija uplata i isplata
        mobApp.performTransaction(new DepositMoney(chAcc, 250.5f));
        mobApp.undoLastTransaction();
        mobApp.redoLastTransaction();

        mobApp.performTransaction(new DepositMoney(fcAcc, 20));
        fcAcc.withdrawInKunas(150);
        mobApp.undoLastTransaction();
        mobApp.redoLastTransaction();
    }
}