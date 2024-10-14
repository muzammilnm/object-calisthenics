package no_getters_setters_properties.correct;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public boolean hasSufficientFunds(double amount) {
        return amount <= balance;
    }
}
