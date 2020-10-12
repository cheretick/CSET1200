/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 8, Problem 1
    Date: 10/12/2020
    Summary: This program uses a class that takes a users income and filing status
                to output the amount of income tax owed

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment8; import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Taxes taxes = new Taxes();
        boolean acceptableStatus = false;

        System.out.print("Enter your name: ");
        taxes.name = input.nextLine();
        System.out.print("Enter your 2019 federal income: ");
        taxes.income = input.nextDouble();
        input.nextLine();
        while (!acceptableStatus) {
            System.out.print("Enter your filing status: ");
            taxes.filingStatus = input.nextLine();
            if (taxes.filingStatus.contains("single") || taxes.filingStatus.contains("head")
                    || taxes.filingStatus.contains("joint") || taxes.filingStatus.contains("separate")) {
                acceptableStatus = true;
            } else {
                System.out.println("Please, enter a valid filing status");
            }
        }
        taxes.setFilingCode();
        taxes.setTaxAmount();
        taxes.print();
    }
}

class Taxes {
    String name;
    double income;
    String filingStatus;
    double taxAmount;
    int filingCode;

    void print() {
        System.out.printf("%s, the federal income tax for an annual salary of $%,.2f for a ",
                name, income);
        switch (filingCode) {
            case 0 -> System.out.print("single filer ");
            case 2 -> System.out.print("head of household ");
            case 3 -> System.out.print("married couple filing jointly or a qualified widow ");
            case 4 -> System.out.print("married person filing separately ");
        }
        System.out.printf("is $%,.2f", taxAmount);
    }

    public void setFilingCode() {
        if (filingStatus.contains("single"))
            this.filingCode = 0;
        if (filingStatus.contains("head"))
            this.filingCode = 2;
        if (filingStatus.contains("joint"))
            this.filingCode = 3;
        if (filingStatus.contains("separate"))
            this.filingCode = 4;
    }

    public void setTaxAmount() {
        double[][][] taxTable = {{{0, 9_700, .10}, {9_701, 39_475, .12}, {39_476, 84_200, .22}, {84_201, 160_725, .24},
                {160_726, 204_100, .32}, {204_101, 510_300, .35}, {510_301, 999_999_999, .37}},
                                {},
                                {{0, 13_850, .10}, {13_851, 52_850, .12}, {51_851, 84_200, .22}, {84_201, 160_700, .24},
                                        {160_701, 204_100, .32}, {204_101, 510_300, .35}, {510_301, 999_999_999, .37}},
                                {{0, 19_400, .10}, {19_401, 78_950, .12}, {78_951, 168_400, .22},
                                        {168_401, 321_450, .24}, {321_451, 408_200, .32}, {408_201, 612_350, .35},
                                        {612_351, 999_999_999, .37}},
                                {{0, 9_700, .10}, {9_701, 39_476, .12}, {39_477, 84_200, .22}, {84_201, 160_725, .24},
                                        {160_726, 204_100, .32}, {204_101, 306_175, .35}, {306_176, 999_999_999, .37}}};
        for (int i = 0; i < taxTable[filingCode].length; i++) {
            if (income > taxTable[filingCode][i][0] && income < taxTable[filingCode][i][1])
                taxAmount = income * taxTable[filingCode][i][2];
        }
    }
}