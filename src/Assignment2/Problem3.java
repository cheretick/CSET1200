/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 2, Problem 2
    Date: 8/25/20
    Summary: Program takes input 'g' or 'b' and outputs the gender

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment2; import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter 'g' for \"girl\" or 'b' for \"boy\": ");
            String answer = input.next();
            if ((!answer.contains("g") || !answer.contains("b")) && (answer.contains("g") || answer.contains("b"))) {
                if (answer.contains("g")) {
                    System.out.println("You are expecting a girl!");
                    break;
                } else if (answer.contains("b")) {
                    System.out.println("You are expecting a boy!");
                    break;
                }
            } else
                System.out.println("\tResponse must contain 'g' or 'b', but not both");
        }
    }
}
