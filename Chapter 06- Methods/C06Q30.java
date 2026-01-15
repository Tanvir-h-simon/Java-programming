import java.util.Random;

public class C06Q30 {
    public static void main(String[] args) {
        Random random = new Random();

        // Roll the dice
        int die1 = rollDice(random);
        int die2 = rollDice(random);
        int sum = die1 + die2;

        System.out.printf("You rolled %d + %d = %d%n", die1, die2, sum);

        // Determine the outcome of the first roll
        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose");
        } else if (sum == 7 || sum == 11) {
            System.out.println("You win");
        } else {
            int point = sum;
            System.out.printf("point is %d%n", point);

            // Continue rolling until the player wins or loses
            while (true) {
                die1 = rollDice(random);
                die2 = rollDice(random);
                sum = die1 + die2;

                System.out.printf("You rolled %d + %d = %d%n", die1, die2, sum);

                if (sum == point) {
                    System.out.println("You win");
                    break;
                } else if (sum == 7) {
                    System.out.println("You lose");
                    break;
                }
            }
        }
    }

    private static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }
}
