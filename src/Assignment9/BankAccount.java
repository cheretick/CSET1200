package Assignment9;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

