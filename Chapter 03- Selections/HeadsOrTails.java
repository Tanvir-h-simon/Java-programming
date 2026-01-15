import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Guess the coin flip result (0 for Heads, 1 for Tails): ");
        int userGuess = sc.nextInt();

        // Validate user input
        if (userGuess != 0 && userGuess != 1){
            System.out.println("Invalid Input");
        }
        else {
            // Generate random coin flip
            int randomCoinFlip = (int) (Math.random() * 2);

            // Check if the user's guess matches the random coin flip
            if (userGuess == randomCoinFlip) {
                System.out.println("You guessed the coin!");
            } else {
                System.out.println("You lost the coin!");
            }

            // Display the actual result of the coin flip
            if (randomCoinFlip == 0) {
                System.out.println("The coin flip result was Heads.");
            } else {
                System.out.println("The coin flip result was Tails.");
            }
        }
    }
}
