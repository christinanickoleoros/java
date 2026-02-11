import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        
        // ============================================
        // ACT 1: SET THE STAGE
        // ============================================
        // TODO 1: Create a Scanner object called "input"
        Scanner input = new Scanner(System.in);
        
        // ============================================
        // ACT 2: GET USER INPUT
        // ============================================
        // TODO 2: Print the prompt
        System.out.print("Enter a letter: ");
        
        // TODO 3: Read the input as a String
        String userInput = input.nextLine();
        
        // TODO 4: Extract the first character
        char ch = userInput.charAt(0);
        
        // ============================================
        // ACT 3: VALIDATE INPUT
        // ============================================
        // TODO 5: Check if ch is a letter
        if (!Character.isLetter(ch)) {
            System.out.println(ch + " is invalid input");
        } else {
            // ============================================
            // ACT 4: CHECK VOWEL OR CONSONANT
            // ============================================
            // TODO 6: Convert to lowercase
            char lower = Character.toLowerCase(ch);
