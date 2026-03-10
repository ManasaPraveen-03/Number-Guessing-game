import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char playAgain;

        System.out.println("=== Welcome to the Number Guessing Game ===");

        do {
            int maxRange = 100;
            int attempts = 0;
            int maxAttempts = 0;

            System.out.println("\nChoose Difficulty Level:");
            System.out.println("1. Easy (10 attempts)");
            System.out.println("2. Medium (7 attempts)");
            System.out.println("3. Hard (5 attempts)");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                maxAttempts = 10;
            } 
            else if (choice == 2) {
                maxAttempts = 7;
            } 
            else if (choice == 3) {
                maxAttempts = 5;
            } 
            else {
                System.out.println("Invalid choice! Defaulting to Easy.");
                maxAttempts = 10;
            }

            int numberToGuess = random.nextInt(maxRange) + 1;
            int guess;
            boolean guessed = false;

            System.out.println("\nGuess the number between 1 and " + maxRange);

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } 
                else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } 
                else {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    guessed = true;
                    break;
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!guessed) {
                System.out.println("Game Over! The number was: " + numberToGuess);
            }

            System.out.print("\nDo you want to play again? (y/n): ");
            playAgain = scanner.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}