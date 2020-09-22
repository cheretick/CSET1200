/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 5, Problem 1
    Date: 9/22/20
    Summary: This program takes two user entered integers and outputs the least common multiple

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment5;
import java.util.ArrayList; import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = input.nextInt();
        System.out.print("Enter the next number: ");
        int y = input.nextInt();
        int lcm = 0;
        ArrayList<Integer> xMultiples = new ArrayList<Integer>();
        ArrayList<Integer> yMultiples = new ArrayList<Integer>();
        int i = 1;
        boolean haveLCM = false;

        while (!haveLCM) {
            xMultiples.add(x * i);
            yMultiples.add(y * i);
            for (int j = 0; j < xMultiples.size(); j++) {
                if (yMultiples.contains(xMultiples.get(j))) {
                    lcm = xMultiples.get(j);
                    haveLCM = true;
                }
            }
            i++;
        }
        System.out.printf("The least common multiple between %,d and %,d is %,d", x, y, lcm);
    }
}
