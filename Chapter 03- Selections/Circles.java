import java.util.Scanner;

public class Circles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the first circle's center coordinates and radius
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double r1 = scan.nextDouble();

        // Get the second circle's center coordinates and radius
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double r2 = scan.nextDouble();

        // Calculate the distance between the centers of the circles
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Check if circle2 is inside circle1
        if (distance <= Math.abs(r1 - r2)) {
            System.out.println("circle2 is inside circle1");
        }
        // Check if circle2 overlaps with circle1
        else if (distance <= r1 + r2) {
            System.out.println("circle2 overlaps circle1");
        }
        // If neither, circle2 does not overlap circle1
        else {
            System.out.println("circle2 does not overlap circle1");
        }
    }
}
