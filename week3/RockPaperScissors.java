import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        // ============================================
        // ACT 1: SET THE STAGE
        // ============================================
        
        // TODO 1: Create a String array called "choices"
        String[] choices = {"Scissor", "Rock", "Paper"};
        
        // TODO 2: Create a Scanner object called "input"
        Scanner input = new Scanner(System.in);
        
        // TODO 3: Create a Random object called "rand"
        Random rand = new Random();
        
        // ============================================
        // ACT 2: GENERATE COMPUTER'S CHOICE
        // ============================================
        
        // TODO 4: Generate a random integer 0, 1, or 2
        int computer = rand.nextInt(3); // 0, 1, or 2
        
        // ============================================
        // ACT 3: GET USER'S CHOICE
        // ============================================
        
        // TODO 5: Print the prompt
        System.out.print("scissor (0), rock (1), paper (2): ");
        
        // TODO 6: Read the user's choice
        int user = input.nextInt();
        
        // ============================================
        // ACT 4: DISPLAY CHOICES
        // ============================================
        
        // TODO 7: Print what the computer chose
        System.out.println("The computer is " + choices[computer] + ".");
        
        // TODO 8: Print what the user chose
        System.out.println("You are " + choices[user] + ".");
        
        // ============================================
        // ACT 5: DETERMINE THE WINNER
        // ============================================
        
        // TODO 9: Check for draw
        if (user == computer) {
            System.out.println("It is a draw!");
        }
        // TODO 10: Check if user wins
        else if ((user == 0 && computer == 2) || 
                 (user == 1 && computer == 0) || 
                 (user == 2 && computer == 1)) {
            System.out.println("You won!");
        }
        // TODO 11: Else computer wins
        else {
            System.out.println("Computer wins!");
        }
        
        // Close the scanner
        input.close();
    }
}

