// ============================================
// LAB 07: Method Practice
// COP2250 Java Programming
// Kevin Pyatt, Ph.D. | Pyatt Labs
// ============================================

import java.util.Scanner;

public class MethodPractice {

    // ---- METHOD 1: displaySortedNumbers ----
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        
        double min = Math.min(num1, Math.min(num2, num3));
        double max = Math.max(num1, Math.max(num2, num3));
        double mid = (num1 + num2 + num3) - min - max;

        System.out.println("Numbers in increasing order: " + min + " " + mid + " " + max);
    }

    // ---- METHOD 2: sumDigits ----
    public static int sumDigits(long n) {
        n = Math.abs(n);   // Handle negative numbers
        int sum = 0;

        while (n > 0) {
            sum += n % 10;  // Get last digit
            n /= 10;        // Remove last digit
        }

        return sum;
    }

    // ---- MAIN METHOD ----
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Test displaySortedNumbers
        System.out.print("Enter three numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        displaySortedNumbers(n1, n2, n3);  // Method call

        System.out.println();

        // Test sumDigits
        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        int result = sumDigits(number);  // Method call
        System.out.println("Sum of digits: " + result);

        input.close();
    }
}