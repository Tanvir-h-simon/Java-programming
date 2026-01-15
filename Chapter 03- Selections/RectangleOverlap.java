import java.util.Scanner;

public class RectangleOverlap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input rectangle-1's center, width, and height
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double w1 = scan.nextDouble();
        double h1 = scan.nextDouble();

        // Input rectangle-2's center, width, and height
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double w2 = scan.nextDouble();
        double h2 = scan.nextDouble();

        // Calculate the boundaries for r1 (Draw the rectangle)
        double r1Left = x1 - w1 / 2;
        double r1Right = x1 + w1 / 2;
        double r1Bottom = y1 - h1 / 2;
        double r1Top = y1 + h1 / 2;

        // Calculate the boundaries for r2 (Draw the rectangle)
        double r2Left = x2 - w2 / 2;
        double r2Right = x2 + w2 / 2;
        double r2Bottom = y2 - h2 / 2;
        double r2Top = y2 + h2 / 2;

        // Check if r2 is inside r1
        if (r2Left >= r1Left && r2Right <= r1Right && r2Bottom >= r1Bottom && r2Top <= r1Top) {
            System.out.println("r2 is inside r1");
        }
        // Check if r2 overlaps r1
        else if (r2Left < r1Right && r2Right > r1Left && r2Bottom < r1Top && r2Top > r1Bottom) {
            System.out.println("r2 overlaps r1");
        }
        // If neither of the above conditions is true, r2 does not overlap r1
        else {
            System.out.println("r2 does not overlap r1");
        }
    }
}
