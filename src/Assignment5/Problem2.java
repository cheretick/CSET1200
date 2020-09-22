/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 5, Problem 2
    Date: 9/22/20
    Summary: This program takes three user entered numbers and outputs them in decreasing order

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment5;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = input.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = input.nextDouble();

        showDecreasingOrder(n1, n2, n3);
    }


    public static void showDecreasingOrder(double n1, double n2, double n3) {
        double temp;
        if (n3 > n2) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        }
        if (n2 > n1) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n3 > n2) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        }
        System.out.println("These numbers in decreasing order are " + n1 + ", " + n2 + ", and " + n3);
    }
}
