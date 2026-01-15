import java.util.Random;

public class C05Q40 {
    public static void main(String[] args) {
        final int FLIPS = 1_000_000;
        int heads = 0;
        int tails = 0;

        Random random = new Random();

        for (int i = 0; i < FLIPS; i++) {
            if (random.nextBoolean()) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Number of heads: " + heads);
        System.out.println("Number of tails: " + tails);
    }
}
