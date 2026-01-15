public class PickACard {
    public static void main(String[] args) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        // Random index for rank
        int randomRanks = (int) (Math.random() * ranks.length);
        // Random index for suit
        int randomSuits = (int) (Math.random() * suits.length);

        System.out.println("The card you picked is " + ranks[randomRanks] + " of " + suits[randomSuits]);

    }
}
