
package guessingnumber1;

import java.util.Scanner;

public class Guessingnumber1 {

    public static void main(String[] args) {
                    int numberToGuess = (int)(Math.random() * 101); // 0 to 100 inclusive
        Scanner input = new Scanner(System.in);
        int guess;

        System.out.println("Guess a number between 0 and 100:");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        input.close();
    }
    
}
