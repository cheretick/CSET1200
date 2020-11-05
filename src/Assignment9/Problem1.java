/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 9, Problem 1
    Date: 11/4/20
    Summary: This program explores the concepts of inheritance, using a "BankAccount" super class and two sub classes,
        "CheckingsAccount" and "SavingsAccount"

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

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

