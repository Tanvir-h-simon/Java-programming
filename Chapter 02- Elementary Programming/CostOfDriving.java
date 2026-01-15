import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double drivingDistance = scan.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = scan.nextDouble();
        System.out.println("Enter price per gallon: ");
        double pricePerGallon = scan.nextDouble();

        double cost = (drivingDistance / milesPerGallon) * pricePerGallon;
        System.out.println("The cost of the driving is: " + cost);
    }
}
