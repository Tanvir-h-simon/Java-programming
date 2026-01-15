import java.util.Scanner;

public class C04Q24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = scan.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = scan.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = scan.nextLine();

        // Compare city1 and city2, swap if necessary
        if (city1.compareTo(city2) > 0) { // city2 is lexicographically greater than city1
            String temp = city1; // Temporarily hold city1
            city1 = city2; // Assign city2 to city1
            city2 = temp;  // Assign the temp (original city1) to city2
        }
        // Compare city1 and city3, swap if necessary
        if (city1.compareTo(city3) > 0) {
            String temp = city1; // Temporarily hold city1
            city1 = city3; // Assign city3 to city1
            city3 = temp;  // Assign the temp (original city1) to city3
        }
        // Compare city2 and city3, swap if necessary
        if (city2.compareTo(city3) > 0) {
            String temp = city2; // Temporarily hold city2
            city2 = city3; // Assign city3 to city2
            city3 = temp;  // Assign the temp (original city2) to city3
        }
        // Display the cities in alphabetical order
        System.out.println("The three cities in alphabetical order are " +
                city1 + " " + city2 + " " + city3);
    }
}