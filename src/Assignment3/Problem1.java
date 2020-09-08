/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 3 Problem 1
    Date: 9/8/20
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
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> grades = new ArrayList<Integer>();
        int grade;
        String name;
        int classesEntered = 0;

        do {
            grade = -1;
            System.out.print("Enter name (or enter '-1' to end): ");
            name = input.nextLine();
            if (name.equals("-1") && classesEntered < 5) {
                System.out.println("Please enter at least 5 grades");
                name = "";
                continue;
            }
            else if (name.equals("-1"))
                continue;

            names.add(name);

            while (grade < 0 || grade > 100) {
                System.out.print("Enter grade: ");
                grade = input.nextInt();
                input.nextLine();
                if (grade >= 0 && grade <= 100)
                    grades.add(grade);
                else
                    System.out.println("Please enter a grade between 0 and 100");
            }
            classesEntered++;


        } while (!(name.equals("-1")));

        int passedExam = 0;
        for (int i = 0; i < classesEntered; i++) {
            if (grades.get(i) >= 75)
                passedExam++;
            }

        System.out.println("\n\tGRADES");
        for (int i = 0; i < classesEntered; i++) {
            System.out.println(names.get(i) + ": " + grades.get(i));
        }

        System.out.println("\n" + passedExam + " students passed the exam");

        System.out.printf("%.2f%% of students passed the exam", ((passedExam / (double) classesEntered) * 100));
        }
    }


