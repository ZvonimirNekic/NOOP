package zad_2;

/**
 * Konkretna implementacija računa za strane valute.
 * Račun radi isključivo s eurima (€) i podržava isplatu u kunama.
 */
public class ForeignCurrencyAccount extends Account {
    private static final float EXCHANGE_RATE = 7.5f; // Kuna-to-Euro tečaj

    public ForeignCurrencyAccount(String name, float initialBalance) {
        super(name, initialBalance);
    }

    @Override
    public void deposit(float amount) {
        System.out.println("Depositing " + amount + "€ to ForeignCurrencyAccount...");
        accountBalance += amount;
    }

    @Override
    public void withdraw(float amount) {
        if (accountBalance >= amount) {
            System.out.println("Withdrawing " + amount + "€ from ForeignCurrencyAccount...");
            accountBalance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public void withdrawInKunas(float kunas) {
        float euros = kunas / EXCHANGE_RATE;
        withdraw(euros);
    }
}
