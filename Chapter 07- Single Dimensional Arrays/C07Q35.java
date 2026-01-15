import java.util.Random;
import java.util.Scanner;

public class C07Q35 {

    // Method to play the hangman game
    public static void playHangman(String[] words) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Randomly select a word from the array
        String word = words[rand.nextInt(words.length)];
        char[] wordToGuess = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordToGuess[i] = '*';  // Initialize the word to display as asterisks
        }

        int misses = 0;
        boolean wordGuessed = false;

        // Loop to guess until the word is guessed or maximum misses are reached
        while (!wordGuessed && misses < 6) {
            System.out.print("(Guess) Enter a letter in word ");
            System.out.println(wordToGuess);

            // Get the user's guess
            char guess = input.next().charAt(0);

            boolean guessCorrect = false;
            // Check if the guess is correct
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess && wordToGuess[i] == '*') {
                    wordToGuess[i] = guess;
                    guessCorrect = true;
                }
            }

            if (guessCorrect) {
                System.out.println("(Guess) Enter a letter in word " + String.valueOf(wordToGuess));
            } else {
                System.out.println("    " + guess + " is not in the word");
                misses++;
            }

            // Check if the word is guessed completely
            wordGuessed = true;
            for (char c : wordToGuess) {
                if (c == '*') {
                    wordGuessed = false;
                    break;
                }
            }
        }

        // Game result
        if (wordGuessed) {
            System.out.println("The word is " + word + ". You missed " + misses + " time.");
        } else {
            System.out.println("You have missed 6 times. The word was " + word + ".");
        }

        // Ask if the user wants to play again
        System.out.print("Do you want to guess another word? Enter y or n> ");
        char playAgain = input.next().charAt(0);
        if (playAgain == 'y' || playAgain == 'Y') {
            playHangman(words); // Restart the game if the user chooses 'y'
        } else {
            System.out.println("Thanks for playing!");
        }
    }

    public static void main(String[] args) {
        // Array of words to be used in the game
        String[] words = {"write", "that", "program", "java", "computer", "science"};

        // Start the game
        playHangman(words);
    }
}