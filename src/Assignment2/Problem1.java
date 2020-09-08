/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 2, Problem 1
    Date: 8/25/20
    Summary: Program checks to see if two user-entered passswords match

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment2; import java.util.Scanner; import static java.lang.Character.isDigit;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password1 = input.next();
        System.out.print("Confirm password: ");
        String password2 = input.next();

        if (containsSpecial(password1) && password1.equals(password2)
                && password1.length() >= 8 && containsNumber(password1))
                System.out.println("Congratulations, you are all set.");
            else
                System.out.println("oops, try again bud.");
    }

    static boolean containsSpecial(String s) {
        String specialCharacters = "!@#%&*";
        String[] sArray = s.split("");
        for (int i = 0; i < s.length(); i++)
            if (specialCharacters.contains(sArray[i]))
                return true;
        return false;
    }

    static boolean containsNumber(String s) {
        for (int i = 0; i < s.length(); i++)
            if (isDigit(s.charAt(i)))
                return true;
        return false;
    }
}
