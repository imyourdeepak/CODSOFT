import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {

        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        int Max_Chance_to_the_player  = 6;
        boolean hasWon = false;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("You have " + Max_Chance_to_the_player + " attempts to guess the number.");

        while (numberOfTries < Max_Chance_to_the_player) {
            System.out.print("Enter your guessing number: ");
            int guess = scanner.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 100) {
                System.out.println("Enter a number between 1 and 100.");
                continue;
            }

            if (guess == numberToGuess) {
                hasWon = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Guessed Number is Smaller, Try Again.");
            } else {
                System.out.println("Guessed Number is Greater,Try again.");
            }
        }
        
        if (hasWon) {
            System.out.println("Waoow! You've guessed the number in " + numberOfTries + " chances.");
        } else {
            System.out.println("Game over! You've used all " + Max_Chance_to_the_player + " chances.");
            System.out.println("The number was: " + numberToGuess);
        }
        
        scanner.close();
    }
}
