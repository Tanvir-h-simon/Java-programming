public class C06Q32 {

    public static void main(String[] args) {
        final int TOTAL_GAMES = 10000;
        int wins = 0;
        int losses = 0;

        for (int i = 0; i < TOTAL_GAMES; i++) {
            if (playGame()) {
                wins++;
            } else {
                losses++;
            }
        }

        System.out.println("Total games played: " + TOTAL_GAMES);
        System.out.println("Total wins: " + wins);
        System.out.println("Total losses: " + losses);
    }

    /** Simulate a single game of craps */
    public static boolean playGame() {
        int roll = rollDice();
        System.out.println("You rolled " + roll);

        if (roll == 7 || roll == 11) { // Natural: win
            return true;
        } else if (roll == 2 || roll == 3 || roll == 12) { // Craps: lose
            return false;
        } else { // Point is established
            int point = roll;
            System.out.println("Point is " + point);
            while (true) {
                roll = rollDice();
                System.out.println("You rolled " + roll);
                if (roll == point) {
                    return true; // Win by matching the point
                } else if (roll == 7) {
                    return false; // Lose by rolling 7
                }
            }
        }
    }

    /** Roll two dice and return the sum */
    public static int rollDice() {
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;
        System.out.println("You rolled " + die1 + " + " + die2 + " = " + (die1 + die2));
        return die1 + die2;
    }
}
