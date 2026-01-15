import java.util.Scanner;
public class CalculatingEnergy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double M = scan.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = scan.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = scan.nextDouble();

        double Q =  M * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is " + Q);
    }
}
