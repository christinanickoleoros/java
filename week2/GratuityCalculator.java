// ============================================
// ASSIGNMENT 2: THE SCRIPT
// Gratuity Calculator
// COP2250 Java Programming
// Kevin Pyatt, Ph.D. | Pyatt Labs
// ============================================

// ACT 1: Import Scanner
// TODO 1: Import Scanner
import java.util.Scanner;

public class GratuityCalculator {
    public static void main(String[] args) {
        
        // ACT 2: Create Scanner object
        // TODO 2: Create Scanner — Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        // ACT 3: Get user input
        // TODO 3: Prompt for subtotal
        System.out.print("Enter the subtotal: ");
        // TODO 4: Read subtotal into a double variable
        double subtotal = input.nextDouble();
        
        // TODO 5: Prompt for gratuity rate
        System.out.print("Enter the gratuity rate (e.g., 15 for 15%): ");
        // TODO 6: Read gratuity rate into a double variable
        double gratuityRate = input.nextDouble();
        
        // ACT 4: Calculate
        // TODO 7: Calculate gratuity
        double gratuity = subtotal * (gratuityRate / 100);
        
        // TODO 8: Calculate total
        double total = subtotal + gratuity;
        
        // ACT 5: Display results
        // TODO 9: Display gratuity using printf
        System.out.printf("Gratuity: $%.2f%n", gratuity);
        
        // TODO 10: Display total using printf
        System.out.printf("Total: $%.2f%n", total);
        
        // CURTAIN CALL: Clean up
        // TODO 11: Close the Scanner
        input.close();
    }
}
