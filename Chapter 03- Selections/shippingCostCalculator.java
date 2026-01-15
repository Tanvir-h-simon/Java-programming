import java.util.Scanner;

public class shippingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the package (in pounds): ");
        double weight = scanner.nextDouble();

        double cost;

        if (weight <= 0) {
            System.out.println("Invalid weight. Please enter a positive value.");
        } else if (weight <= 1) {
            cost = 3.5;
            System.out.println("The shipping cost is $" + cost);
        } else if (weight <= 3) {
            cost = 5.5;
            System.out.println("The shipping cost is $" + cost);
        } else if (weight <= 10) {
            cost = 8.5;
            System.out.println("The shipping cost is $" + cost);
        } else if (weight <= 20) {
            cost = 10.5;
            System.out.println("The shipping cost is $" + cost);
        } else if (weight > 50) {
            System.out.println("The package cannot be shipped.");
        } else {
            System.out.println("The shipping cost cannot be determined.");
        }
    }
}
