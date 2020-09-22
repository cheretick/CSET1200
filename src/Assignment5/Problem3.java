/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 5, Problem 3
    Date: 9/22/20
    Summary: This program implements a triangle class a method that determines if the triangle is valid
        based on its side lengths and a method that returns the area

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment5;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side length: ");
        double firstSide = input.nextDouble();
        System.out.print("Enter second side length: ");
        double secondSide = input.nextDouble();
        System.out.print("Enter third side length: ");
        double thirdSide = input.nextDouble();

        ThisTriangle thisTriangle = new ThisTriangle(firstSide, secondSide, thirdSide);
        if (thisTriangle.isValid()) {
            System.out.printf("The area of this triangle is %.2f", thisTriangle.area());
        }
        else {
            System.out.println("This triangle is not valid");
        }
    }

    public static class ThisTriangle {
        double firstSide;
        double secondSide;
        double thirdSide;

        ThisTriangle (double firstSide, double secondSide, double thirdSide) {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
        }

        public boolean isValid() {
            return (firstSide + secondSide >= thirdSide && firstSide + thirdSide >= secondSide
                    && secondSide + thirdSide >= firstSide);
        }

        public double area() {
            double s = (firstSide + secondSide + thirdSide) / 2;
            return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
        }
    }
}
