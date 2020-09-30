/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 6, Problem 3
    Date: 9/30/20
    Summary: This program populates an array with 15 random numbers between 30 and 99, prints the array,
        and displays the smallest element in the array

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment6;

import java.util.Random;

public class Problem3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        int minValue = 100;

        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(70) + 30;

        System.out.print("Array Elements: ");
        for (int number : arr) System.out.print(number + " ");

        for (int number : arr)
            if (number < minValue)
                minValue = number;

        System.out.println("\nThe smallest value in the array is " + minValue);
    }
}
