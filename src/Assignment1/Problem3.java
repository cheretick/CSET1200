/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 1, Problem 3
    Date: 8/18/20
    Summary: prints "Does this code have an error?"

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment1;

/* Original:
public class MyCode, <-- class declaration must end with brackets, not a comma

	public  static  (String[] args) {} <-- main method is missing "void" and "main"

		System.out.PrintLine(Does this code have an error?); <-- code body is not within main method
		    "PrintLine" should be "Println", and the string should be wrapped in quotation marks
*/

// Proper Version:
public class Problem3 {
    public static void main(String[] args) {
        System.out.println("Does this code have an error?");
    }
}
