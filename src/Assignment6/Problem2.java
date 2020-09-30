/* Name: Collin Heretick
    Class: CSET 1200
    Instructor: Dr. Jared Oluoch
    Programming Assignment: Assignment 6, Problem 2
    Date: 9/29/20
    Summary: This program uses a binary search method to find the index of a user-entered number

This code is my own work. I did not get any help from any online source
such as chegg.com; from a classmate, or any other person other than the instructor
or TA for this course. I understand that getting outside help from this course
other than from the instructor or TA will result in a grade of 0 in this
assignment and other disciplinary actions for academic dishonesty. */

package Assignment6; import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {3, 6, 7, 8, 12, 15, 22, 36, 45, 48, 49, 52, 65, 70, 73, 88, 94};
        BinarySearch binarySearch1 = new BinarySearch(numbers);
        System.out.print("Enter a value to search for: ");
        int value = input.nextInt();
        BinarySearch.binarySearch(value);
        if (binarySearch1.isValueFound())
            System.out.println("This value exits in the array at index " + binarySearch1.getIndex());
        else
            System.out.println("This value does not exist within the array");

    }

    static class BinarySearch {
        static int [] numbers;
        static int index = 0;
        static boolean valueFound = false;

        BinarySearch(int[] numbers) {
            BinarySearch.numbers = numbers;
        }

        public int getIndex() {
            return index;
        }

        public boolean isValueFound() {
            return valueFound;
        }

        public static void binarySearch(int value) {
            int low = 0;
            int mid = numbers.length / 2;
            int high = numbers.length - 1;
            while (!valueFound) {
                if (value == numbers[mid]) {
                    valueFound = true;
                    index = mid;
                }
                else if (low == high){
                    break;
                }
                else if (value < numbers[mid]) {
                    high = mid;
                    mid = (low + high) / 2;
                }
                else if (value > numbers[mid]) {
                    low = mid + 1;
                    mid = (low + high) / 2;
                }
            }
        }
    }
}
