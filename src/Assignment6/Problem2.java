/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 6, Problem 1
    Date: 9/29/20
    Summary:

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment6; import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {3, 6, 7, 8, 12, 15, 22, 36, 45, 48, 49, 52, 65, 70, 73, 88, 94};
        System.out.print("Enter a value to search for: ");
        int value = input.nextInt();

    }

    public static int binarySearch(int[] numbers, int value) {
        int low = 0;
        int mid = numbers.length / 2;
        int high = numbers.length - 1;
        boolean valueFound = false;
        while (!valueFound) {
            if (value == mid) {
                // left off here after realizing that I want to return two values...
                // maybe create a class for the method?
            }
            if (value < mid) {

            }
        }
    }
}
