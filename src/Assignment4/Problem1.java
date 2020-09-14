/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 4, Problem 1
    Date: 9/14/20
    Summary: This program prompts the user to enter two sentences, then checks to see if their contents are the same

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment4;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String entry1 = input.nextLine();
        System.out.print("Enter another sentence: ");
        String entry2 = input.nextLine();

        if (entry1.equals(entry2))
            System.out.println("I am a super duper programmer!" +
                    "\nI can find out if two string objects have the same content!");
        else
            System.out.println("Not the same, thank you!");
    }
}
