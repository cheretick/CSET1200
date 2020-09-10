/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 3 Problem 1
    Date: 9/9/20
    Summary: This program takes the input of students' names and grades, then outputs their grades as well as
        information on who passed

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment3;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<String>();
        ArrayList<ArrayList<String>> classes = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<Integer>> grades = new ArrayList<ArrayList<Integer>>();
        int classesEntered = 0;
        int grade = -2;
        String name;
        String className = "";
        boolean classAlreadyEntered = false;
        int totalClasses = 0;

        // Enter names, classes, and grades
        do {
            System.out.print("Enter name (or '-1' to end): ");
            name = input.nextLine();
            if (!(name.equals("-1"))) {
                students.add(name);
            }

            while (!(className.equals("-1")) && !(name.equals("-1"))) {
                if (classesEntered == 0 && !classAlreadyEntered) {
                    grades.add(new ArrayList<Integer>());
                    classes.add(new ArrayList<String>());
                }

                if (!classAlreadyEntered) {
                    System.out.print("\tEnter class name: ");
                    className = input.nextLine();

                    if (className.equals("-1") && classesEntered < 5) {
                        System.out.println("Please enter at least 5 grades");
                        className = "";
                        classAlreadyEntered = false;
                        continue;
                    }
                }
                if (!(className.equals("-1"))) {
                    classes.get(students.size() - 1).add(classesEntered, className);
                    System.out.print("\t\tEnter grade: ");
                    grade = input.nextInt();
                    input.nextLine();

                    if (grade >= 0 && grade <= 100) {
                        grades.get(students.size() - 1).add(classesEntered, grade);
                        classesEntered++;
                        totalClasses++;
                        classAlreadyEntered = false;
                    }
                    if (grade < -1 || grade > 100) {
                        System.out.println("Please enter a grade between 0 and 100");
                        classAlreadyEntered = true;
                    }
                }
            }
            className = "";
            classesEntered = 0;

        } while (!(name.equals("-1")));

        // Outputs everyone's grades
        System.out.println("\n\tGRADES");
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i) + ": \n\t");
            for (int j = 0; j < grades.get(i).size(); j++) {
                System.out.print(classes.get(i).get(j) + ": ");
                System.out.print(grades.get(i).get(j) + "   ");
            }
            System.out.println();
        }

        // Outputs who passed which classes (grade of 75% and above)
        int classesPassed;
        int totalClassesPassed = 0;
        System.out.println();
        for (int i = 0; i < students.size(); i++) {
            classesPassed = 0;
            System.out.print(students.get(i) + " passed these classes: ");
            for (int j = 0; j < grades.get(i).size(); j++) {
                if (grades.get(i).get(j) >= 75) {
                    System.out.print(classes.get(i).get(j) + " ");
                    classesPassed++;
                    totalClassesPassed++;
                }
            }
            if (classesPassed == 0)
                System.out.print("-FAILED ALL CLASSES-");
            System.out.println();
        }

        // Outputs how many students entered their scores
        System.out.println("\n" + students.size() + " students entered their scores");

        // Outputs information about how many students passed their class
        System.out.println(totalClasses + " classes were entered and out of these, " + totalClassesPassed
                + " were of a passing grade");

        //Outputs the percentage of classes passed
        System.out.printf("This means that %.2f%% were of a passing grade",
                ((totalClassesPassed / (double) totalClasses) * 100));
    }
}