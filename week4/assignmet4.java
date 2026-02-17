import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);

        // Check if input is a letter
        if (Character.isLetter(ch)) {

            // Convert to lowercase to simplify checking
            ch = Character.toLowerCase(ch);

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }

        } else {
            System.out.println("Invalid input.");
        }

        input.close();
    }
}
