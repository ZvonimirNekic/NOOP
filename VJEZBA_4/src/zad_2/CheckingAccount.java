package zad_2;

/**
 * Konkretna implementacija računa za provjere.
 * Nasljeđuje klasu `Account` i implementira metode za uplatu i isplatu.
 */
public class CheckingAccount extends Account {

    public CheckingAccount(String name, float initialBalance) {
        super(name, initialBalance);
    }

    @Override
    public void deposit(float amount) {
        System.out.println("Depositing " + amount + " to CheckingAccount...");
        accountBalance += amount;
    }

    @Override
    public void withdraw(float amount) {
        if (accountBalance >= amount) {
            System.out.println("Withdrawing " + amount + " from CheckingAccount...");
            accountBalance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}
