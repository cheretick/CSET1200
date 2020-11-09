/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 10, Problem 1
    Date: 11/9/20
    Summary: This problem exemplifies the use of exception handling in Java. The exception we are handling is
        division by 0.

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment10;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers between 15 and 45\nFirsts number: ");
        int collin_num1 = input.nextInt();
        System.out.print("Second number: ");
        int heretick_num2 = input.nextInt();

        double result = 0;
        try {
            result = divide(collin_num1, heretick_num2);
        } catch (ArithmeticException ex) {
            System.out.println("We got a problem, we don't divide by zero.");
        }
        if (heretick_num2 != 0)
            System.out.println(collin_num1 + " / " + heretick_num2 + " = " + result);
    }

    public static double divide(int num1, int num2) {
        if (num2 == 0)
            throw new ArithmeticException("Sorry bud, we don't accept 0 divisors");
        return (double) num1 / num2;
    }
}
