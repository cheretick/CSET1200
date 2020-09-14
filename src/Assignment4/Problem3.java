/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 4, Problem 3
    Date: 9/14/20
    Summary: This program prompts the user to enter a length in inches and outputs that length in centimeters

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment4;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner inches = new Scanner(System.in);
        final double INCHES_TO_CENTIMETERS = 2.54;
        System.out.print("Enter a length in inches: ");
        double length = inches.nextDouble();

        System.out.printf("%.2f inches is %.2f centimeters", length, length * INCHES_TO_CENTIMETERS);
    }
}
