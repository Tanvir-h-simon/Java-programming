import java.util.Scanner;

public class PointInARectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        final double halfWidth = 10.0 / 2;
        final double halfHeight = 5.0 / 2;
        double horizontalDistance = Math.abs(x); // Horizontal Distance = |x - 0|
        double verticalDistance = Math.abs(y);   // Vertical Distance = |y - 0|

        if (horizontalDistance <= halfWidth && verticalDistance <= halfHeight) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");
        } else {
            System.out.print("Point (" + x + " , " + y + ") is out of rectangle.");
        }
    }
}
