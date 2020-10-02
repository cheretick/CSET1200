package Project;

import java.util.Random;

public class ProfessorsSalaries {
    Random rand = new Random();
    double[][] arr; // This array holds the values representing each professors yearly salaries
    int numberOfProfessors;
    int numberOfYears;

    // This constructor overrides the default constructor and requires the number of professors and the number of
    //      years as parameters
    ProfessorsSalaries(int numberOfProfessors, int numberOfYears) {
        this.arr = new double[numberOfProfessors][numberOfYears];
        this.numberOfProfessors = numberOfProfessors;
        this.numberOfYears = numberOfYears;
        for (int i = 0; i < numberOfProfessors; i++) {
            for (int j = 0; j < numberOfYears; j++) {
                // Generates and assigns an amount between $50,000 and $500,000
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

    // This method returns the index of the professor with the lowest total salary
    int lowestSalary() {
        double lowest = 500_001 * 10; // This number represents a number greater than the max possible total salary
        // The currentTotal variable temporarily holds a running tally, used to calculate each professors total salary
        double currentTotal = 0;
        int lowestIndex = 0;
        // This loop adds all of a professors yearly salaries to a running total then checks if that total is the lowest
        for (int i = 0; i < numberOfProfessors; i++) {
            for (int j = 0; j < numberOfYears; j++) {
                currentTotal += arr[i][j];
            }
            if (currentTotal < lowest) {
                lowest = currentTotal;
                lowestIndex = i;
            }
            currentTotal = 0; // Resets the running total, before moving on to the next professor
        }
        return lowestIndex;
    }

    // This method returns the average ten year salary made by the professors
    double average() {
        double total = 0;
        // This loop adds up every yearly salary of every professor
        for (int i = 0; i < numberOfProfessors; i++) {
            for (int j = 0; j < numberOfYears; j++) {
                total += arr[i][j];
            }
        }
        return total / numberOfProfessors;
    }

    // This method returns the year in which the lowest single salary was earned
    int lowestSalaryYear() {
        double lowestSalary = 500_001; // This value ensures that the starting lowest salary is out of range
        int lowestSalaryYearIndex = 0;
        // This loop goes through every salary, retaining the value and the index of the year of the lowest salary
        for (int i = 0; i < numberOfProfessors; i++) {
            for (int j = 0; j < numberOfYears; j++) {
                if (arr[i][j] < lowestSalary) {
                    lowestSalary = arr[i][j];
                    lowestSalaryYearIndex = j;
                }
            }
        }
        return lowestSalaryYearIndex + 1; // Adds one to the index of the year to represent the actual year
    }

    // This method returns the total amount of money earned by all of the professors over all ten years
    double total() {
        double total = 0;
        // This loop adds up every yearly salary of every professor
        for (int i = 0; i < numberOfProfessors; i++) {
            for (int j = 0; j < numberOfYears; j++) {
                total += arr[i][j];
            }
        }
        return total;
    }

    // This method prints the total salaries of each professor (used for verifying the other calculations)
    void professorsSalaryTotals() {
        double total = 0;
        for (int i = 0; i < numberOfProfessors; i++) {
            for (int j = 0; j < numberOfYears; j++) {
                total += arr[i][j];
            }
            System.out.printf("\nProfessor %d made a total of $%,.2f", (i + 1), total);
            total = 0;
        }
    }
}
