import java.util.Scanner;

public class PointsInTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input point coordinates
        System.out.print("Enter a point's x and y coordinate: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        // Input triangle vertices with labels
        System.out.print("Enter A(x1, y1) of the triangle: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        System.out.print("Enter B(x2, y2) of the triangle: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        System.out.print("Enter C(x3, y3) of the triangle: ");
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();

        // Calculate the areas of the triangles
        double areaPBC = 0.5 * Math.abs(x * y2 + x2 * y3 + x3 * y - y * x2 - y2 * x3 - x * y3);
        double areaPCA = 0.5 * Math.abs(x * y3 + x3 * y1 + x1 * y - x3 * y - x1 * y3 - x * y1);
        double areaPAB = 0.5 * Math.abs(x * y1 + x1 * y2 + x2 * y - x1 * y - x2 * y1 - x * y2);
        double areaABC = 0.5 * Math.abs(x1 * y2 + x2 * y3 + x3 * y1 - x2 * y1 - x3 * y2 - x1 * y3);

        // Check if the sum of areas of the sub-triangles equals the area of the main triangle
        if (areaPBC + areaPCA + areaPAB == areaABC) {
            System.out.println("The point is inside or on the edge of the triangle.");
        } else {
            System.out.println("The point is outside the triangle.");
        }
    }
}
