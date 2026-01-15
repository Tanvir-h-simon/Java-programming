import java.util.Random;

public class C04Q25 {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate three random uppercase letters
        StringBuilder plateNumber = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char letter = (char) ('A' + rand.nextInt(26)); // Random letter between 'A' and 'Z'
            plateNumber.append(letter);
        }

        // Generate four random digits
        for (int i = 0; i < 4; i++) {
            int digit = rand.nextInt(10); // Random digit between 0 and 9
            plateNumber.append(digit);
        }

        // Print the generated plate number
        System.out.println("Generated Vehicle Plate Number: " + plateNumber.toString());
    }
}
