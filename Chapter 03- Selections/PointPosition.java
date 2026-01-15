import java.util.Scanner;

public class PointPosition {
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

        // Calculate the determinant value (c)
        double c = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        // Determine the position of p2 relative to the line from p0 to p1
        if (c > 0) {
            System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        } else if (c == 0) {
            System.out.println("(" + x2 + ", " + y2 + ") is on the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
    }
}