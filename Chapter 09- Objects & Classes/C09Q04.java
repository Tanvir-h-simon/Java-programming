import java.util.Random;

public class C09Q04 {
    public static void main(String[] args) {
        Random rand = new Random(1000);
        System.out.print("Random numbers: ");
        for (int i = 0; i < 50; i++) {
            int numbers = rand.nextInt(100); // Generates integer between 0 and 100
            System.out.print(numbers + " ");
        }
    }
}