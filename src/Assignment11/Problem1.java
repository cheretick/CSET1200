/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 11, Problem 1
    Date: 11/16/2020
    Summary: This program uses a recursive function in order to return the greatest common divisor of two numbers.

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment11;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers\nFirst number: ");
        int num1 = input.nextInt();
        System.out.print("Second number: ");
        int num2 = input.nextInt();
        System.out.printf("The greatest common divisor of %,d and %,d is %,d",
                num1, num2, greatestCommonDivisor(num1, num2));
    }

    // This function uses a math trick for finding the gcd in which the smaller number is subtracted from the larger
    // number, until the two numbers are equal, which is the gcd
    public static int greatestCommonDivisor(int num1, int num2) {
        if (num1 == num2) { // Base Case
            return num1;
        } else {
            if (num1 > num2) {
                return greatestCommonDivisor(num1 - num2, num2); // Both of these return statements are recursive calls
            } else return greatestCommonDivisor(num1, num2 - num1);
        }
    }
}
