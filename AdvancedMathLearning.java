
package advanced.math.learning;

import java.util.Scanner;

public class AdvancedMathLearning {

    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // Generate two random single-digit integers
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            // If number1 < number2, swap them
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // Prompt the student
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // Check the answer and display result
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.");
                System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
            }

            // Increase the question count
            count++;
        }

        // Display the results
        System.out.println("You got " + correctCount + " out of " + NUMBER_OF_QUESTIONS + " correct.");
    }
}
    
    

