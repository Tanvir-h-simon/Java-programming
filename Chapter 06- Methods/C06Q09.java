public class C06Q09 {
    public static void main(String[] args) {
        // Print table header
        System.out.printf("%-10s%-10s %-5s %-10s%-10s\n", "Feet", "Meters", "|", "Meters", "Feet");
        System.out.println("--------------------------------------------");

        // Generate table rows
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5.0) {
            System.out.printf("%-10.1f%-10.3f %-5s %-10.1f%-10.3f\n",
                    feet, footToMeter(feet), "|", meters, meterToFoot(meters));
        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}