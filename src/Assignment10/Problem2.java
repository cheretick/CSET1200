/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 10, Problem 2
    Date: 11/9/20
    Summary: This program reads course information from a text file and outputs them in the console

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment10;

import java.io.File;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) throws Exception {
        // May have to change relative path to run from .rar
        java.io.File file = new java.io.File("src/Assignment10/heretick");
        Scanner input = new Scanner(file);
        input.useDelimiter(",\\s|\\n"); // Uses either ", " or a "\n" as delimiters

        while (input.hasNext()) {
            System.out.println("Course: " + input.next() + " " + input.next() + "\t\tInstructor: " + input.next()
                    + "\t\tCredit Hours: " + input.next());
        }

        input.close();
    }
}
