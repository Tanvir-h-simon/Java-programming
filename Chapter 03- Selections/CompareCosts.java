import java.util.Scanner;

public class CompareCosts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the weight and price for package 1
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = scan.nextDouble();
        double price1 = scan.nextDouble();

        // Get the weight and price for package 2
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = scan.nextDouble();
        double price2 = scan.nextDouble();

        // Calculate the price per unit for both packages
        double pricePerUnit1 = price1 / weight1;
        double pricePerUnit2 = price2 / weight2;

        // Compare the price per unit
        if (pricePerUnit1 < pricePerUnit2) {
            System.out.println("Package 1 has a better price.");
        } else if (pricePerUnit1 > pricePerUnit2) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("Both packages have the same price.");
        }
    }
}
