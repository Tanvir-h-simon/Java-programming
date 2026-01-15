public class Circle2D {
    private double x;
    private double y;
    private double radius;

    // No-arg constructor
    public Circle2D() {
        this(0, 0, 1); // Default circle at (0,0) with radius 1
    }

    // Constructor with specified x, y, and radius
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to check if a point is inside this circle
    public boolean contains(double x, double y) {
        // Calculate distance from the point to the center of this circle
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));

        // Point is inside if distance is less than or equal to radius
        return distance <= radius;
    }

    // Method to check if a circle is inside this circle
    public boolean contains(Circle2D circle) {
        // Calculate distance between centers
        double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) +
                Math.pow(this.y - circle.getY(), 2));

        // Circle is inside if distance plus the other circle's radius is less than or equal to this radius
        return distance + circle.getRadius() <= this.radius;
    }

    // Method to check if a circle overlaps with this circle
    public boolean overlaps(Circle2D circle) {
        // Calculate distance between centers
        double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) +
                Math.pow(this.y - circle.getY(), 2));

        // Circles overlap if distance is less than the sum of radii
        // but greater than the absolute difference between radii
        return distance < this.radius + circle.getRadius() &&
                distance > Math.abs(this.radius - circle.getRadius());
    }
}