public class C06Q08 {
    public static void main(String[] args) {
        // Print the table header
        System.out.printf("%-10s %-13s %-5s %-13s %-10s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
        System.out.println("----------------------------------------------------");

        // Loop to generate the table
        for (double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10) {
            // Convert temperatures
            double fahrenheitFromCelsius = celsiusToFahrenheit(celsius);
            double celsiusFromFahrenheit = fahrenheitToCelsius(fahrenheit);

            // Print the values in a formatted manner
            System.out.printf("%-10.1f %-13.1f %-5s %-13.1f %-10.2f\n",
                    celsius, fahrenheitFromCelsius, "|", fahrenheit, celsiusFromFahrenheit);
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
