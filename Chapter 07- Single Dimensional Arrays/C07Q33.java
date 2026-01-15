import java.util.Scanner;

public class C07Q33 {
    public static void main(String[] args) {
        // Array to store the animal names in the Chinese Zodiac
        String[] animals = {
                "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"
        };

        // Prompt user for the year
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Calculate the index for the animal array
        int index = (year - 1900) % 12;

        // Display the Chinese Zodiac animal for the given year
        System.out.println("The Chinese Zodiac animal for the year " + year + " is: " + animals[index]);
    }
}