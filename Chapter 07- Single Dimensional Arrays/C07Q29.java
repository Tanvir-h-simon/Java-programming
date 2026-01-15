import java.util.Random;

public class C07Q29 {
    public static void main(String[] args) {
        // Define the card values
        int[] cardValues = new int[52];

        // Fill the card values with appropriate numbers
        for (int i = 0; i < 52; i++) {
            if (i % 13 == 0) {
                cardValues[i] = 1;  // Ace
            } else if (i % 13 == 10) {
                cardValues[i] = 11; // Jack
            } else if (i % 13 == 11) {
                cardValues[i] = 12; // Queen
            } else if (i % 13 == 12) {
                cardValues[i] = 13; // King
            } else {
                cardValues[i] = (i % 13) + 1; // Cards 2-10
            }
        }

        // Initialize the Random object to pick cards
        Random random = new Random();
        int count = 0;

        // Run the simulation
        while (true) {
            // Pick 4 random cards
            int[] pickedCards = new int[4];
            for (int i = 0; i < 4; i++) {
                pickedCards[i] = cardValues[random.nextInt(52)];
            }

            // Compute the sum of the 4 picked cards
            int sum = pickedCards[0] + pickedCards[1] + pickedCards[2] + pickedCards[3];

            // Check if the sum equals 24
            if (sum == 24) {
                count++;
                System.out.println("Picked cards: " + pickedCards[0] + ", " + pickedCards[1] + ", " + pickedCards[2] + ", " + pickedCards[3]);
                System.out.println("Sum = 24!");
                System.out.println("Number of picks that yield sum 24: " + count);
                break; // Stop after finding the first valid pick
            }
        }
    }
}