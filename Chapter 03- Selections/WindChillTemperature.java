import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = scanner.nextDouble();

        // Prompt the user to enter the wind speed
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        // Check if the input is valid
        if (temperature < -58 || temperature > 41) {
            System.out.println("The temperature is invalid. It must be between -58°F and 41°F.");
        } else if (windSpeed < 2) {
            System.out.println("The wind speed is invalid. It must be greater than or equal to 2 mph.");
        } else {
            // Calculate the wind-chill temperature
            double windChill = 35.74 + 0.6215 * temperature
                    - 35.75 * Math.pow(windSpeed, 0.16)
                    + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

            // Display the wind-chill temperature
            System.out.printf("The wind chill index is %.5f\n", windChill);
        }
    }
}
