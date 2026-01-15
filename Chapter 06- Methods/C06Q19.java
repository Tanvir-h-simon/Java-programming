import java.util.Scanner;

public class C06Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for the coordinates of three points
        System.out.print("Enter three points for a triangle (x1 y1 x2 y2 x3 y3): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Calculate the sides of the triangle
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        // Check if the sides form a valid triangle
        if (MyTriangle.isValid(side1, side2, side3)) {
            // Calculate and display the area
            double area = MyTriangle.area(side1, side2, side3);
            System.out.printf("The area of the triangle is %.2f%n", area);
        } else {
            // Display invalid input message
            System.out.println("The input does not form a valid triangle.");
        }
    }
    public class MyTriangle {
        /** Return true if the sum of any two sides is greater than the third side. */
        public static boolean isValid(double side1, double side2, double side3) {
            return (side1 + side2 > side3) &&
                    (side1 + side3 > side2) &&
                    (side2 + side3 > side1);
        }

        /** Return the area of the triangle using Heron's formula. */
        public static double area(double side1, double side2, double side3) {
            double s = (side1 + side2 + side3) / 2; // Semi-perimeter
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
    }

}
