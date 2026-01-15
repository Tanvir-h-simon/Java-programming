import java.util.Scanner;
public class WindChillTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double t = scan.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double v = scan.nextDouble();

        double windChillTemperature = 35.74 + (0.6215 * t) - (35.75 * (Math.pow(v, 0.16))) + (0.4275 * t * (Math.pow(v, 0.16)));

        System.out.println("The wind chill index is " + windChillTemperature);
    }
}
