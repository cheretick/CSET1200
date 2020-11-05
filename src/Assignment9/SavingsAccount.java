package Assignment9;

public class SavingsAccount extends BankAccount {
    private final double INTEREST_RATE = 0.02;

    public SavingsAccount(double startingBalance) {
        deposit(startingBalance);
    }

    public void applyInterestRate() {
        deposit(INTEREST_RATE * this.getBalance());
    }

    public double getInterestRate() {
        return INTEREST_RATE;
    }
}
