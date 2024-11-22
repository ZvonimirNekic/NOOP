package zad_2;

/**
 * Apstraktna klasa koja definira osnovne funkcionalnosti računa.
 * Računi imaju ID, ime vlasnika i stanje računa.
 */
public abstract class Account {
    protected int id;
    private static int counter = 100;
    protected String name;
    protected float accountBalance;

    public Account(String name, float initialBalance) {
        this.id = counter++;
        this.name = name;
        this.accountBalance = initialBalance;
    }

    public int getId() {
        return id; // Vraća ID računa
    }

    public String getUserName() {
        return name; // Vraća ime vlasnika računa
    }

    public float getAccountBalance() {
        return accountBalance; // Vraća stanje računa
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance; // Postavlja novo stanje računa
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", accountBalance=" + accountBalance + "]";
    }

    public abstract void deposit(float amount);
    public abstract void withdraw(float amount);
}
