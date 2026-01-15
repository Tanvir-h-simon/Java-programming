import java.util.Scanner;
public class PopulationProjection2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();

        final int currentPopulation = 312032486;
        int secondsInAYear = 365 * 24 * 60 * 60;
        double birthRate = (1.0 / 7) * years * secondsInAYear;
        double deathRate = (1.0 / 13) * years * secondsInAYear;
        double immigrantRate = (1.0 / 45) * years * secondsInAYear;

        int projectedPopulation = (int) (currentPopulation + birthRate - deathRate + immigrantRate);
        System.out.println("The population in " + years + " years is " + projectedPopulation);
    }
}