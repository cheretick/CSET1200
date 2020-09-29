/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 6, Problem 1
    Date: 9/28/20
    Summary: This program uses an array to record a user's input. The user inputs their grocery bills for the past
        eight months, then outputs the average, the total payment, the lowest bill, and the highest bill.

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment6; import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] bills = new double[8];
        System.out.println("Please enter your last eight monthly grocery bills");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < bills.length; i++) {
            System.out.print("Enter ");
            switch (i) {
                case 0 -> System.out.print("first ");
                case 1 -> System.out.print("second ");
                case 2 -> System.out.print("third ");
                case 3 -> System.out.print("fourth ");
                case 4 -> System.out.print("fifth ");
                case 5 -> System.out.print("sixth ");
                case 6 -> System.out.print("seventh ");
                case 7 -> System.out.print("eighth ");
            }
            System.out.print("bill: ");
            bills[i] = input.nextDouble();
            }
        System.out.printf("\nAverage: $%.2f\nTotal: $%.2f\nLowest Bill: $%.2f\nHighest Bill: $%.2f", average(bills),
                total(bills), lowest(bills), highest(bills));
        }

        public static double average(double[] bills) {
        double sum = 0;
            for (double bill : bills) sum += bill;
        return sum / 8;
        }

        public static double total(double[] bills) {
        double sum = 0;
            for (double bill : bills) sum += bill;
        return sum;
        }

        public static double lowest(double[] bills) {
        double lowest = bills[0];
        for (int i = 1; i < bills.length; i++)
            if (bills[i] < lowest)
                lowest = bills[i];
        return lowest;
        }

    public static double highest(double[] bills) {
        double highest = bills[0];
        for (int i = 1; i < bills.length; i++)
            if (bills[i] > highest)
                highest = bills[i];
        return highest;
    }
}
