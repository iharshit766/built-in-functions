import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int low = 1, high = 100;
        boolean guessedCorrectly = false;
        
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        
        while (!guessedCorrectly) {
            int guess = random.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct'):");
            
            String feedback = scanner.nextLine().trim().toLowerCase();
            
            if (feedback.equals("correct")) {
                guessedCorrectly = true;
                System.out.println("Hooray! I guessed your number correctly!");
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
        
        scanner.close();
    }
}

/*
Example Interaction:
Think of a number between 1 and 100, and I will try to guess it!
Is your number 50? (Enter 'high', 'low', or 'correct'):
low
Is your number 75? (Enter 'high', 'low', or 'correct'):
high
Is your number 62? (Enter 'high', 'low', or 'correct'):
correct
Hooray! I guessed your number correctly!
*/
