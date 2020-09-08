/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 1, Problem 4
    Date: 8/18/20
    Summary: this program creates a runtime error

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment1;

public class Problem4 {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i <= array.length; i++)
            array[i] = i;

        // This creates a runtime error by indexing beyond the upper bound for the array.
        // The error can easily be fixed by changing "i <= array.length" to "i < array.length"
    }
}
