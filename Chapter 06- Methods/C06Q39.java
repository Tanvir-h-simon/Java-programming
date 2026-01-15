import java.util.Scanner;

public class C06Q39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter points p0, p1, and p2
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Determine the position of p2
        if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
            System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)%n", x2, y2, x0, y0, x1, y1);
        } else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            System.out.printf("(%.1f, %.1f) is on the same line from (%.1f, %.1f) to (%.1f, %.1f)%n", x2, y2, x0, y0, x1, y1);
        } else if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.printf("(%.1f, %.1f) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)%n", x2, y2, x0, y0, x1, y1);
        } else {
            System.out.printf("(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)%n", x2, y2, x0, y0, x1, y1);
        }

        input.close();
    }

    /** Return true if point (x2, y2) is on the left side of the directed line */
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return crossProduct(x0, y0, x1, y1, x2, y2) > 0;
    }

    /** Return true if point (x2, y2) is on the same line */
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return crossProduct(x0, y0, x1, y1, x2, y2) == 0;
    }

    /** Return true if point (x2, y2) is on the line segment */
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            return x2 >= Math.min(x0, x1) && x2 <= Math.max(x0, x1) &&
                    y2 >= Math.min(y0, y1) && y2 <= Math.max(y0, y1);
        }
        return false;
    }

    /** Calculate the cross product to determine the relative position of point */
    private static double crossProduct(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
    }
}