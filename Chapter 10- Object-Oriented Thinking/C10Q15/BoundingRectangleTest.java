class MyRectangle2D {
    private double x, y; // Center of the rectangle
    private double width, height;

    // Default constructor that creates a rectangle with (0, 0) center, width 1, height 1
    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    // Constructor with specified x, y, width, and height
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Return true if the point (x, y) is inside this rectangle
    public boolean contains(double pointX, double pointY) {
        return Math.abs(pointX - x) <= width / 2 &&
                Math.abs(pointY - y) <= height / 2;
    }

    // Return true if the specified rectangle is inside this rectangle
    public boolean contains(MyRectangle2D r) {
        double distanceX = Math.abs(r.getX() - x);
        double distanceY = Math.abs(r.getY() - y);

        return distanceX + r.getWidth() / 2 <= width / 2 &&
                distanceY + r.getHeight() / 2 <= height / 2;
    }

    // Return true if the specified rectangle overlaps with this rectangle
    public boolean overlaps(MyRectangle2D r) {
        double distanceX = Math.abs(r.getX() - x);
        double distanceY = Math.abs(r.getY() - y);

        return distanceX <= (width + r.getWidth()) / 2 &&
                distanceY <= (height + r.getHeight()) / 2;
    }
}

public class BoundingRectangleTest {

    public static MyRectangle2D getRectangle(double[][] points) {
        if (points == null || points.length == 0) {
            return new MyRectangle2D(); // Return default rectangle if no points
        }

        // Initialize min and max to the first point
        double minX = points[0][0];
        double maxX = points[0][0];
        double minY = points[0][1];
        double maxY = points[0][1];

        // Find the minimum and maximum x and y
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < minX) minX = points[i][0];
            if (points[i][0] > maxX) maxX = points[i][0];
            if (points[i][1] < minY) minY = points[i][1];
            if (points[i][1] > maxY) maxY = points[i][1];
        }

        // Calculate the center point, width, and height
        double centerX = (minX + maxX) / 2;
        double centerY = (minY + maxY) / 2;
        double width = maxX - minX;
        double height = maxY - minY;

        // Create and return the bounding rectangle
        return new MyRectangle2D(centerX, centerY, width, height);
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt the user to enter five points
        System.out.print("Enter five points: ");
        double[][] points = new double[5][2];

        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble(); // x coordinate
            points[i][1] = input.nextDouble(); // y coordinate
        }

        // Get the bounding rectangle
        MyRectangle2D rectangle = getRectangle(points);

        // Display the results
        System.out.println("The bounding rectangle's center (" + rectangle.getX() +
                ", " + rectangle.getY() + "), width " + rectangle.getWidth() +
                ", height " + rectangle.getHeight());

        input.close();
    }
}