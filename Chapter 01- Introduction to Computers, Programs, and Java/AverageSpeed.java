public class AverageSpeed {
    public static void main(String[] args) {
        double distanceKm = 14.0;
        double distanceMiles = distanceKm/1.6;
        double timeHours = (45.0/60.0) + (30.0/3600.0);
        double speed1 = distanceMiles / timeHours;
        double speed2 = distanceKm / timeHours;
        System.out.println("The average speed is (miles per hour) " + speed1);
        System.out.println("The average speed is (km per hour) " + speed2);
    }
}
