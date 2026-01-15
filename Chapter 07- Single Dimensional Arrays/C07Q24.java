import java.util.ArrayList;
import java.util.Random;

public class C07Q24 {
    public static void main(String[] args) {
        // Define the suits and ranks of a deck of cards
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        // To track whether a suit has been collected
        boolean[] suitCollected = new boolean[4];
        int suitsCollectedCount = 0; // Counter for collected suits

        ArrayList<String> pickedCards = new ArrayList<>(); // To store picked cards
        Random random = new Random();
        int numberOfPicks = 0;

        // Continue picking cards until all suits are collected
        while (suitsCollectedCount < 4) {
            // Randomly pick a rank and a suit
            int rankIndex = random.nextInt(13);
            int suitIndex = random.nextInt(4);

            String pickedCard = ranks[rankIndex] + " of " + suits[suitIndex];
            pickedCards.add(pickedCard);
            numberOfPicks++;

            // Check if this suit is collected for the first time
            if (!suitCollected[suitIndex]) {
                suitCollected[suitIndex] = true;
                suitsCollectedCount++;
            }
        }

        // Display the picked cards and the number of picks
        System.out.println("Cards picked:");
        for (String card : pickedCards) {
            System.out.println(card);
        }
        System.out.println("Number of picks: " + numberOfPicks);
    }
}