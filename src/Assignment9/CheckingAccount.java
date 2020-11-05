package Assignment9;

public class CheckingAccount extends BankAccount {
    private final double MONTHLY_FEE = 150.55;

    public void applyMonthlyFee() {
        withdraw(MONTHLY_FEE);
    }

    public double getMonthlyFee() {
        return MONTHLY_FEE;
    }
}
