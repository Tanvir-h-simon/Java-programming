import java.util.Scanner;

public class IntersectingPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
        double x4 = scan.nextDouble();
        double y4 = scan.nextDouble();


        double a = y1 - y2;
        double b = x2 - x1;
        double c = a * x1 + b * y1;
        double d = y3 - y4;
        double e = x4 - x3;
        double f = d * x3 + e * y3;

        // Calculate the determinant
        double determinant = a * e - b * d;

        // Check if the lines are parallel
        if (determinant == 0) {
            System.out.println("The two lines are parallel.");
        } else {
            // Calculate the intersection point
            double x = (c * e - b * f) / determinant;
            double y = (a * f - c * d) / determinant;

            // Display the intersection point
            System.out.printf("The intersecting point is at (%.5f, %.5f)\n", x, y);
        }
    }
}
