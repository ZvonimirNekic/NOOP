package zad_2;

/**
 * Implementacija transakcije za uplatu novca na račun.
 * Implementira `PaymentServiceInt` i koristi mehanizme execute, undo, i redo.
 */
public class DepositMoney implements PaymentServiceInt {
    private Account account;
    private float oldBalance;
    private float amount;

    public DepositMoney(Account account, float amount) {
        this.account = account;
        this.oldBalance = account.getAccountBalance();
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
        System.out.println(toString());
    }

    @Override
    public void undo() {
        account.setAccountBalance(oldBalance);
        System.out.println("Undo: " + toString());
    }

    @Override
    public void redo() {
        execute();
    }

    @Override
    public String toString() {
        return "DepositMoney [\n" +
                "    account=CheckingAccount [id=" + account.getId() + ", name=" + account.getUserName() +
                ", accountBalance=" + account.getAccountBalance() + "],\n" +
                "    oldBalance=" + oldBalance + ",\n" +
                "    amount=" + amount + "\n" +
                "]";
    }
}
