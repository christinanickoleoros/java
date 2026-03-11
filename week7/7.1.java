import java.util.Scanner;

/**
 * AssignGrades.java
 * This program reads student scores, finds the best score,
 * and assigns grades based on how close each score is to the best.
 */

public class AssignGrades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[] scores = new int[numberOfStudents];

        // Read student scores
        System.out.println("Enter " + numberOfStudents + " scores:");

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }

        // Find the best score
        int best = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        // Assign grades
        for (int i = 0; i < scores.length; i++) {

            char grade;

            if (scores[i] >= best - 10) {
                grade = 'A';
            } 
            else if (scores[i] >= best - 20) {
                grade = 'B';
            } 
            else if (scores[i] >= best - 30) {
                grade = 'C';
            } 
            else if (scores[i] >= best - 40) {
                grade = 'D';
            } 
            else {
                grade = 'F';
            }

            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }

        input.close();
    }
}