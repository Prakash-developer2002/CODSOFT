import java.util.*;

public class GuessTheNumber {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerLimit = 1;
        int maxLimit = 100;
        int secretNumber = random.nextInt(maxLimit - lowerLimit + 1) + lowerLimit;

        int maxAttempts = 5;
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.print("Guess the number between " + lowerLimit + " and " + maxLimit + ": ");
            int userGuess = scanner.nextInt();

            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number " + secretNumber + " in " + (attempts + 1) + " attempts.");
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }

            attempts++;
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + secretNumber + ".");
        }

        System.out.print("Do you want to play again? (yes/no): ");
        String playAgain = scanner.next().toLowerCase(); 

        if (playAgain.equals("yes")) {
            playGame();
        } else {
            System.out.println("Game Over!");
        }

        scanner.close();
    }
}


