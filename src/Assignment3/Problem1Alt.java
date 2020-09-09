package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1Alt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();
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
