/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 7, Problem 1
    Date: 10/5/20
    Summary: This program implements a two dimensional array representing students and their grades.
        It outputs the maximum number of columns in the array.

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment7;

public class Problem1 {
    public static void main(String[] args) {
        int[][] grades = {{87, 45},
                          {69, 88, 90, 94},
                          {79, 87, 94}};
        int maxColumns = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i].length > maxColumns)
                maxColumns = grades[i].length;
        }

        System.out.println("The maximum number of columns in the array is " + maxColumns);
    }
}
