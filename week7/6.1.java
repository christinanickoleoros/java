import java.util.Scanner;

/**
 * YourName_Chapter3_Assignment4.java
 * Your Name
 * Chapter 3 – Assignment 4
 * This program reads three numbers from the user
 * and displays them in increasing order.
 */

public class Coros_Chapter3_Assignment4 {

    // Method to sort and display three numbers
    public static void displaySortedNumbers(double num1, double num2, double num3) {

        // Swap num1 and num2 if needed
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Swap num1 and num3 if needed
        if (num1 > num3) {
            double temp = num1;
            num1 = num3;
            num3 = temp;
        }

        // Swap num2 and num3 if needed
        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Display sorted numbers
        System.out.println("Numbers in increasing order:");
        System.out.println(num1 + " " + num2 + " " + num3);
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Call the method
        displaySortedNumbers(number1, number2, number3);

        input.close();
    }
}
