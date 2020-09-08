/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 3, Problem 3
    Date: 9/8/20
    Summary: This program outputs the sum of all odd numbers between 3 and an inputted number

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upperBound = 0;
        while (upperBound < 3) {
            System.out.print("Enter a value greater than or equal to 3: ");
            upperBound = input.nextInt();
            if (upperBound < 3)
                System.out.println("\tPlease enter a value which is greater than or equal to 3");
        }
        int sum = 0;
        for (int i = 3; i <= upperBound; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all odd integers between 3 and " + upperBound + " is " + sum);
    }
}
