// ============================================
// COP2250 MIDTERM PRACTICE QUIZ
// Weeks 1-8: Terminal, Ch 1-7
// Kevin Pyatt, Ph.D. | Pyatt Labs
// ============================================
// Run in terminal. Type your answer BEFORE
// seeing the correct one. Generates a report.
// ============================================

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class COP2250_Midterm_Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ---- STUDENT INFO ----
        System.out.println("==========================================");
        System.out.println("  COP2250 MIDTERM PRACTICE QUIZ");
        System.out.println("  Weeks 1-8 | Terminal + Ch 1-7");
        System.out.println("==========================================");
        System.out.print("  Enter your full name: ");
        String studentName = scanner.nextLine().trim();
        System.out.println("==========================================\n");

        String timestamp = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String fileTimestamp = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

        // ============================================
        // QUESTION POOL: { category, question, answer }
        // ============================================
        String[][] allQuestions = {

            // ---- TERMINAL / BASH (5) ----
            {"TERMINAL",
             "What does 'pwd' stand for and what does it do?",
             "Print Working Directory. Shows the full path of your current location in the filesystem."},

            {"TERMINAL",
             "What's the difference between 'ls' and 'ls -la'?",
             "ls shows files/folders. ls -la shows ALL files (including hidden dot-files) with details like permissions, size, and date."},

            {"TERMINAL",
             "What two terminal commands compile and run Hello.java?",
             "javac Hello.java (compile to bytecode) then java Hello (run — no .java extension)."},

            {"TERMINAL",
             "How do you create a folder called 'lab8' and navigate into it?",
             "mkdir lab8 then cd lab8. Or combined: mkdir lab8 && cd lab8"},

            {"TERMINAL",
             "What does 'cd ..' do? What about 'cd ~'?",
             "cd .. goes up one directory. cd ~ goes to your home directory."},

            // ---- CH 1: INTRO TO JAVA (5) ----
            {"CH1 - INTRO",
             "What is the entry point of every Java program?",
             "The main method: public static void main(String[] args)"},

            {"CH1 - INTRO",
             "What's the difference between print() and println()?",
             "print() outputs text and stays on the same line. println() outputs text and adds a newline character."},

            {"CH1 - INTRO",
             "What does the Java compiler (javac) produce?",
             "Bytecode — a .class file that the JVM (Java Virtual Machine) can execute."},

            {"CH1 - INTRO",
             "T/F: Java is case-sensitive. 'Main' and 'main' are the same.",
             "FALSE. Java IS case-sensitive. Main and main are different identifiers."},

            {"CH1 - INTRO",
             "What is a syntax error vs a logic error?",
             "Syntax error: code won't compile (typo, missing semicolon). Logic error: code compiles and runs but produces wrong results."},

            // ---- CH 2: ELEMENTARY PROGRAMMING (5) ----
            {"CH2 - VARIABLES",
             "What's the difference between int and double?",
             "int stores whole numbers (no decimals). double stores floating-point numbers (with decimals)."},

            {"CH2 - VARIABLES",
             "What does Scanner do and how do you create one for keyboard input?",
             "Scanner reads input. Create with: Scanner input = new Scanner(System.in);"},

            {"CH2 - VARIABLES",
             "What is the result of 17 / 5 in Java? Why?",
             "3 (not 3.4). Integer division truncates the decimal. Both operands are int so result is int."},

            {"CH2 - VARIABLES",
             "What is the modulus operator (%) and what does 17 % 5 return?",
             "Modulus returns the remainder of division. 17 % 5 = 2 (17 divided by 5 is 3 remainder 2)."},

            {"CH2 - VARIABLES",
             "What is type casting? Give an example.",
             "Forcing a value to a different type. Example: (double) 5 / 2 gives 2.5 instead of 2."},

            // ---- CH 3: SELECTIONS (5) ----
            {"CH3 - SELECTIONS",
             "What's the difference between = and ==?",
             "= is assignment (stores a value). == is comparison (checks if two values are equal)."},

            {"CH3 - SELECTIONS",
             "What does && mean? What about ||?",
             "&& is logical AND (both must be true). || is logical OR (at least one must be true)."},

            {"CH3 - SELECTIONS",
             "When would you use a switch statement instead of if-else?",
             "When comparing ONE variable against multiple specific constant values (like menu options). Switch is cleaner than a long if-else chain."},

            {"CH3 - SELECTIONS",
             "What is a boolean expression? Give an example.",
             "An expression that evaluates to true or false. Example: age >= 18 or (x > 0 && x < 100)."},

            {"CH3 - SELECTIONS",
             "What happens if you forget 'break' in a switch case?",
             "Fall-through: execution continues into the next case without checking the condition."},

            // ---- CH 4: MATH, CHAR, STRING (5) ----
            {"CH4 - MATH/STRING",
             "How do you find the larger of two numbers using Math methods?",
             "Math.max(a, b) returns the larger value. Example: Math.max(5, 9) returns 9."},

            {"CH4 - MATH/STRING",
             "What does charAt(0) do on a String?",
             "Returns the first character of the string. Strings are zero-indexed."},

            {"CH4 - MATH/STRING",
             "How do you compare two Strings in Java? Why not use ==?",
             "Use .equals() method. == compares memory references (are they the same object), not content."},

            {"CH4 - MATH/STRING",
             "What does Math.random() return?",
             "A random double value >= 0.0 and < 1.0. To get 1-10: (int)(Math.random() * 10) + 1"},

            {"CH4 - MATH/STRING",
             "What is the difference between 'A' (char) and \"A\" (String)?",
             "'A' is a char literal (single character, primitive). \"A\" is a String object (even though it has one character)."},

            // ---- CH 5: LOOPS (5) ----
            {"CH5 - LOOPS",
             "What are the three types of loops in Java?",
             "for loop, while loop, do-while loop."},

            {"CH5 - LOOPS",
             "When would you use a WHILE loop vs a FOR loop?",
             "FOR when you know how many times to iterate. WHILE when you loop until a condition changes (unknown iterations)."},

            {"CH5 - LOOPS",
             "What is an infinite loop and how does it happen?",
             "A loop that never ends because its condition never becomes false. Example: while(true) or forgetting to update the loop variable."},

            {"CH5 - LOOPS",
             "What's the output of: for(int i = 0; i < 5; i++) System.out.print(i + \" \");",
             "0 1 2 3 4  (starts at 0, stops BEFORE 5)"},

            {"CH5 - LOOPS",
             "What does 'break' do inside a loop? What about 'continue'?",
             "break exits the loop entirely. continue skips the rest of the current iteration and goes to the next one."},

            // ---- CH 6: METHODS (5) ----
            {"CH6 - METHODS",
             "What is the difference between a parameter and an argument?",
             "A parameter is the variable in the method definition. An argument is the actual value passed when calling the method."},

            {"CH6 - METHODS",
             "Why would a method be declared void?",
             "Because it performs an action (like printing) but doesn't need to return a value to the caller."},

            {"CH6 - METHODS",
             "What does the return keyword do?",
             "Sends a value back to the caller and immediately exits the method."},

            {"CH6 - METHODS",
             "Can you define a method inside main()? Why or why not?",
             "No. Compile error. Java doesn't allow nested methods. Methods go inside the class but outside main."},

            {"CH6 - METHODS",
             "What is method overloading?",
             "Defining multiple methods with the SAME name but DIFFERENT parameter lists (different number or types of parameters)."},

            // ---- CH 7: SINGLE-DIM ARRAYS (5) ----
            {"CH7 - ARRAYS",
             "How do you declare and create an array of 10 integers?",
             "int[] numbers = new int[10]; — declares and allocates space for 10 int values (all default to 0)."},

            {"CH7 - ARRAYS",
             "What is the index of the first element in a Java array? The last?",
             "First element: index 0. Last element: index (array.length - 1)."},

            {"CH7 - ARRAYS",
             "What happens if you access array index [10] on an array of size 10?",
             "ArrayIndexOutOfBoundsException — valid indices are 0-9."},

            {"CH7 - ARRAYS",
             "How do you loop through an entire array using a for-each loop?",
             "for (int val : myArray) { System.out.println(val); } — iterates each element without needing an index."},

            {"CH7 - ARRAYS",
             "What is the default value of elements in a new int array? A new String array?",
             "int array: 0 for every element. String array: null for every element."},
        };

        // ---- SHUFFLE AND SELECT 15 ----
        int numQuestions = 15;
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < allQuestions.length; i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);

        ArrayList<String[]> results = new ArrayList<>();
        int selfScore = 0;

        System.out.println("  You will get " + numQuestions + " questions from " + allQuestions.length + " total.");
        System.out.println("  Type your answer FIRST, then see the correct one.");
        System.out.println("  Be honest with self-grading.\n");

        // ---- QUIZ LOOP ----
        for (int q = 0; q < numQuestions; q++) {
            int idx = indices.get(q);
            String category = allQuestions[idx][0];
            String question = allQuestions[idx][1];
            String correctAnswer = allQuestions[idx][2];

            System.out.println("------------------------------------------");
            System.out.println("  Question " + (q + 1) + " of " + numQuestions + "  [" + category + "]");
            System.out.println("------------------------------------------");
            System.out.println("  " + question);
            System.out.println();
            System.out.print("  YOUR ANSWER: ");
            String studentAnswer = scanner.nextLine().trim();

            System.out.println();
            System.out.println("  CORRECT ANSWER:");
            System.out.println("  " + correctAnswer);
            System.out.println();
            System.out.print("  Did you get it right? (y/n): ");
            String selfGrade = scanner.nextLine().trim().toLowerCase();
            boolean correct = selfGrade.startsWith("y");
            if (correct) selfScore++;

            results.add(new String[]{
                "[" + category + "] " + question,
                studentAnswer,
                correctAnswer,
                correct ? "YES" : "NO"
            });

            System.out.println();
        }

        // ---- RESULTS ----
        System.out.println("==========================================");
        System.out.println("  RESULTS: " + selfScore + " / " + numQuestions);
        double pct = (selfScore * 100.0) / numQuestions;
        System.out.printf("  PERCENTAGE: %.0f%%\n", pct);
        System.out.println("==========================================\n");

        if (pct >= 90) {
            System.out.println("  Solid. You're ready.");
        } else if (pct >= 70) {
            System.out.println("  Decent. Review the ones you missed.");
        } else {
            System.out.println("  You have work to do. Study and run this again.");
        }
        System.out.println();

        // ---- GENERATE REPORT FILE ----
        String safeName = studentName.replaceAll("[^a-zA-Z0-9 ]", "").replaceAll("\\s+", "_");
        String fileName = "midterm_practice_" + safeName + "_" + fileTimestamp + ".txt";

        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {
            out.println("==========================================");
            out.println("  COP2250 MIDTERM PRACTICE QUIZ REPORT");
            out.println("==========================================");
            out.println("  Student: " + studentName);
            out.println("  Date:    " + timestamp);
            out.println("  Score:   " + selfScore + " / " + numQuestions);
            out.printf( "  Pct:     %.0f%%\n", pct);
            out.println("==========================================\n");

            for (int i = 0; i < results.size(); i++) {
                String[] r = results.get(i);
                out.println("Question " + (i + 1) + ": " + r[0]);
                out.println("  Student answer:  " + r[1]);
                out.println("  Correct answer:  " + r[2]);
                out.println("  Self-assessed:   " + r[3]);
                out.println();
            }

            out.println("==========================================");
            out.println("  Generated: " + timestamp);
            out.println("  Pool: " + allQuestions.length + " questions");
            out.println("  Asked: " + numQuestions + " questions");
            out.println("  This report is auto-generated.");
            out.println("==========================================");

            System.out.println("  Report saved: " + fileName);
            System.out.println("  Submit this file to Dr. Pyatt.\n");

        } catch (IOException e) {
            System.out.println("  ERROR: Could not save report file.");
            System.out.println("  Screenshot your terminal instead.\n");
        }

        scanner.close();
    }
}