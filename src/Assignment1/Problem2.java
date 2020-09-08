/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 1, Problem 2
    Date: 8/18/20
    Summary: This program calculates the amount of days it will take Victor to save enough money

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment1;

public class Problem2 {
    public static void main(String[] args) {
        final double CONVERSION_RATE = 108.3;
        final int COST_OF_KITS = 3_000;
        final int NUMBER_OF_KITS = 30;

        double dollarsNeeded = COST_OF_KITS / CONVERSION_RATE * NUMBER_OF_KITS;
        int daysNeeded = (int) (dollarsNeeded / 100 * 7) + 1; // +1 to round up

        System.out.printf("Victor, you will need %d days to save $%.2f dollars for the Kenyan project.",
                daysNeeded, dollarsNeeded);
    }
}
