package Assignment9;
import java.text.NumberFormat;
import java.util.Locale;

public class Problem1 {
    public static void main(String[] args) {
        NumberFormat formatMoney = NumberFormat.getCurrencyInstance(Locale.US);
        CheckingAccount checkingAccount = new CheckingAccount();

        System.out.println("A checking account has been created, starting with a balance of "
                + formatMoney.format(checkingAccount.getBalance()));
        checkingAccount.deposit(600.99);
        System.out.println("After a deposit, the checking account now has "
                + formatMoney.format(checkingAccount.getBalance()) + "\n");

        checkingAccount.applyMonthlyFee();
        System.out.println("A monthly fee of " + formatMoney.format(checkingAccount.getMonthlyFee())
                + " has been applied to the checking account");
        System.out.println("The balance of the checking account is now "
                + formatMoney.format(checkingAccount.getBalance()) + "\n");

        SavingsAccount savingsAccount = new SavingsAccount(400);
        System.out.println("A savings account has been created with a balance of "
                + formatMoney.format(savingsAccount.getBalance()) + "\n");

        savingsAccount.applyInterestRate();
        System.out.println("An interest rate of " + (savingsAccount.getInterestRate() * 100)
                + "% has been applied to the savings account");
        System.out.println("The balance of the checking account is now "
                + formatMoney.format(savingsAccount.getBalance()));
    }
}

