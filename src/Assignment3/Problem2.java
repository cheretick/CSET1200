/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 3, Problem 2
    Date: 9/8/20
    Summary: This program takes the String ""We will overcome COVID-19" and outputs it in reverse

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment3;

public class Problem2 {
    public static void main(String[] args) {
        String pandemic = "We will overcome COVID-19";
        for (int i = pandemic.length() - 1; i >= 0; i--)
            System.out.print(pandemic.charAt(i));
    }
}
