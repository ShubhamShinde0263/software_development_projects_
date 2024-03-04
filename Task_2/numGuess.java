import java.util.Random;
import java.util.Scanner;

public class numGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int userGuess;
        int attempts = 0;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound);

        do {
            System.out.print("Enter your guess: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter your guess: ");
                scanner.next();
            }
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < generatedNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > generatedNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (userGuess != generatedNumber);

        scanner.close();
    }
}
