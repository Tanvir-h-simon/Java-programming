import java.util.Random;

public class C07Q07 {
    public static void main(String[] args) {
        // Create an array to store counts for digits 0 through 9
        int[] counts = new int[10];

        // Generate 100 random integers between 0 and 9
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(10); // Random number between 0 and 9
            counts[num]++;
        }

        System.out.println("Digit counts:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " occurs " + counts[i] + " times");
        }
    }
}
