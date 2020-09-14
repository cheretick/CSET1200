/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 4, Problem 2
    Date: 9/14/20
    Summary: This program prompts the user to enter a password, then checks that it has at least 10 characters,
    consists of only letters and digits, and has at least three digits

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment4;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetterOrDigit;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digitCount = 0;
        boolean acceptablePassword = true;
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        if (password.length() >= 10) {
            for (int i = 0; i < password.length(); i++) {
                if (isDigit(password.charAt(i)))
                    digitCount++;
                if (!(isLetterOrDigit(password.charAt(i)))) {
                    System.out.println("Please enter a password consisting of only letters and digits");
                    acceptablePassword = false;
                    break;
                }
            }
        }
        else {
            System.out.println("Please enter a password with at least ten characters");
            acceptablePassword = false;
        }

        if (digitCount < 3 && acceptablePassword)
            System.out.println("Please enter a password with at least three digits");
        else if (acceptablePassword)
            System.out.println("Hooray!");

    }
}
