import java.util.Random;

public class C04Q06 {
    public static void main(String[] args){

        // Generate three random angles between 0 and 2π in degrees
        Random rand = new Random();
        double angle1 = rand.nextDouble() * (2 * Math.PI);
        double angle2 = rand.nextDouble() * (2 * Math.PI);
        double angle3 = rand.nextDouble() * (2 * Math.PI);

        // Convert angles degrees to radians
        angle1 = Math.toRadians(angle1);
        angle2 = Math.toRadians(angle2);
        angle3 = Math.toRadians(angle3);

        final int RADIUS = 40;

        // Calculate coordinates of the three points using formula
        double x1 = RADIUS * Math.cos(angle1);
        double y1 = RADIUS * Math.sin(angle1);
        double x2 = RADIUS * Math.cos(angle2);
        double y2 = RADIUS * Math.sin(angle2);
        double x3 = RADIUS * Math.cos(angle3);
        double y3 = RADIUS * Math.sin(angle3);

        // Calculate the side of the triangle
        double a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

        // Calculate the angles of the triangle using the Law of Cosines
        double angleA = Math.acos((b*b + c*c - a*a) / (2 * b * c));
        double angleB = Math.acos((a*a + c*c - b*b) / (2 * a * c));
        double angleC = Math.acos((a*a + b*b - c*c) / (2 * a * b));

        System.out.printf("Angle A: %.2f\n", angleA);
        System.out.printf("Angle B: %.2f\n", angleB);
        System.out.printf("Angle C: %.2f\n", angleC);
    }
}