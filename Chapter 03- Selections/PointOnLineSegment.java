import java.util.Scanner;

public class PointOnLineSegment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the coordinates for p0, p1, and p2
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = scan.nextDouble();
        double y0 = scan.nextDouble();
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        // Check if p2 is collinear with p0 and p1
        double collinearityCheck = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        // Check if p2 is within the bounds of the line segment p0 to p1
        boolean withinBounds = (Math.min(x0, x1) <= x2 && x2 <= Math.max(x0, x1)) &&
                (Math.min(y0, y1) <= y2 && y2 <= Math.max(y0, y1));

        // Check if the point is on the line segment
        if (collinearityCheck == 0 && withinBounds) {
            System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
    }
}
