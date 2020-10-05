/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 7, Problem 2
    Date: 10/5/20
    Summary: This program utilizes a two-dimensional array to keep track of the votes for four candidates in six
        districts. It then outputs the total amount of votes for each candidate and each district.

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment7;

public class Problem2 {
    public static void main(String[] args) {
        int [][] ballots = {{36, 47, 88, 94, 16, 77},
                            {33, 97, 14, 15, 88, 65},
                            {12, 24, 23, 13, 33, 8},
                            {67, 88, 53, 95, 74, 63}};
        String [] candidates = {"Jane", "Amani", "Doe", "MacBeth"};
        int counter = 0;

        System.out.println("Total votes per candidate");
        for (int i = 0; i < ballots.length; i++) {
            for (int j = 0; j < ballots[i].length; j++) {
                counter += ballots[i][j];
            }
            System.out.println(candidates[i] + "\n" + counter + "\n");
            counter = 0;
        }

        System.out.println("Total votes per district");
        for (int i = 0; i < ballots[0].length; i++) {
            for (int j = 0; j < ballots.length; j++) {
                counter += ballots[j][i];
            }
            System.out.println((i + 1) + "\n" + counter + "\n");
            counter = 0;
        }
    }
}
