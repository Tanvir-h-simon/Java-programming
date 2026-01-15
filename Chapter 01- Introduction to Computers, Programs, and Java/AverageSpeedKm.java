public class AverageSpeedKm {
    public static void main(String[] args) {
        double distanceMiles = 24.0;
        double distanceKm = distanceMiles * 1.6;
        double timePerHour = 1.0 + (40.0/60.0) + (35.0/3600.0);
        double averageSpeedKm = distanceKm / timePerHour;
        System.out.println("Average Speed is " + averageSpeedKm + " Kilometers per hour.");
    }
}
