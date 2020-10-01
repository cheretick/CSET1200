package Project;

import java.util.Random;

public class ProfessorsSalaries {
    Random rand = new Random();
    double[][] arr;
    int numberOfProfessors;
    int numberOfYears;

    // This constructor overrides the default constructor and requires the number of professors and the number of
    //      years as parameters
    ProfessorsSalaries(int numberOfProfessors, int numberOfYears) {
        this.arr = new double[numberOfProfessors][numberOfYears];
        this.numberOfProfessors = numberOfProfessors;
        this.numberOfYears = numberOfProfessors;
        for (int i = 0; i < numberOfProfessors; i++) {
            for (int j = 0; j < numberOfYears; j++) {
                arr[i][j] = (double) (rand.nextInt(450_000_00) + 50_000_00) / 100;
            }
        }
    }

    // This method display the array data
    void print() {
        for (int i = 0; i < numberOfProfessors; i++) {
            System.out.print("Professor " + (i + 1) + ": \n\t");
            for (int j = 0; j < numberOfYears; j++) {
                System.out.printf("Year %d: $%,.2f\t\t", (j + 1), arr[i][j]);
            }
            System.out.println("\n");
        }
    }
}
