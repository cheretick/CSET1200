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

import java.util.Scanner; import java.util.ArrayList;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<String>();
        ArrayList<ArrayList<Integer>> grades = new ArrayList<ArrayList<Integer>>();
        int classesEntered = 0;
        int grade = -2;
        String name;

        do {
            System.out.print("Enter name (or '-1' to end): ");
            name = input.nextLine();
            if (!(name.equals("-1"))) {
                students.add(name);
            }

            while (grade != -1 && !(name.equals("-1"))) {
                if (classesEntered == 0) {
                    grades.add(new ArrayList<Integer>());
                }
                System.out.print("\tEnter grade: ");
                grade = input.nextInt();
                input.nextLine();
                if (grade == -1 && classesEntered < 5) {
                    System.out.println("Please enter at least 5 grades");
                    grade = -2;
                }
                if (grade >= 0 && grade <= 100) {
                    grades.get(students.size() - 1).add(classesEntered, grade);
                    classesEntered++;
                }
                if (grade < -2 || grade > 100) {
                    System.out.println("Please enter a grade between 0 and 100");
                }
            }
            grade = -2;
            classesEntered = 0;

        } while (!(name.equals("-1")));

        System.out.println("\n\tGRADES");
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i) + ": ");
            for (int j = 0; j < grades.get(i).size(); j++) {
                System.out.print(grades.get(i).get(j) + " ");
            }
            System.out.println();
        }

        }
    }