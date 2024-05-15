package numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private static final int MAX_ATTEMPTS = 10;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        int round = 1;
        int totalScore = 0;
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Round " + round + ": Guess the number between 1 and 100.");
            int randomNumber = generateRandomNumber(1, 100);
            int roundScore = playRound(randomNumber);
            totalScore += roundScore;

            playAgain = askToPlayAgain();
            round++;
        }

        displayFinalScore(totalScore);
        scanner.close();
    }

    private static int generateRandomNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    private static int playRound(int randomNumber) {
        int attempts = 0;
        boolean guessedCorrectly = false;

        while (attempts < MAX_ATTEMPTS && !guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            guessedCorrectly = checkGuess(randomNumber, userGuess);

            if (!guessedCorrectly) {
                provideFeedback(randomNumber, userGuess);
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry, you've used all attempts. The correct number was " + randomNumber);
        }

        return calculateScore(attempts, guessedCorrectly);
    }

    private static boolean checkGuess(int randomNumber, int userGuess) {
        return userGuess == randomNumber;
    }

    private static void provideFeedback(int randomNumber, int userGuess) {
        if (userGuess > randomNumber) {
            System.out.println("Too high! Try again.");
        } else {
            System.out.println("Too low! Try again.");
        }
    }

    private static int calculateScore(int attempts, boolean guessedCorrectly) {
        if (guessedCorrectly) {
            System.out.println("Congratulations! You've guessed the correct number.");
            return MAX_ATTEMPTS - attempts + 1; // Higher score for fewer attempts
        }
        return 0;
    }

    private static boolean askToPlayAgain() {
        System.out.print("Do you want to play another round? (yes/no): ");
        String userResponse = scanner.next();
        return userResponse.equalsIgnoreCase("yes");
    }

    private static void displayFinalScore(int totalScore) {
        System.out.println("Game Over! Your total score is: " + totalScore);
    }
}
