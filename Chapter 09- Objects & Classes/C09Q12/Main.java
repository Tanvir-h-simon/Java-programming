import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the endpoints of the first line (x1, y1, x2, y2): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter the endpoints of the second line (x3, y3, x4, y4): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Using the equations of the line in the form:
        // (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
        // (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            double x = equation.getX();
            double y = equation.getY();
            // Check if the intersection point is within both line segments
            if (isPointInLineSegment(x, y, x1, y1, x2, y2) && isPointInLineSegment(x, y, x3, y3, x4, y4)) {
                System.out.printf("The intersecting point is: (%.4f, %.4f)\n", x, y);
            } else {
                System.out.println("The line segments do not intersect.");
            }
        } else {
            System.out.println("The equation has no solution. The lines are parallel.");
        }
    }

    // Method to check if a point (x, y) is within a line segment from (x1, y1) to (x2, y2)
    public static boolean isPointInLineSegment(double x, double y, double x1, double y1, double x2, double y2) {
        boolean isXInRange = (x >= Math.min(x1, x2)) && (x <= Math.max(x1, x2));
        boolean isYInRange = (y >= Math.min(y1, y2)) && (y <= Math.max(y1, y2));
        return isXInRange && isYInRange;
    }
}

class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return a*d-b*c != 0;
    }

    public double getX() {
        return (e*d-b*f)/(a*d-b*c);
    }

    public double getY() {
        return (a*f-e*c)/(a*d-b*c);
    }
}