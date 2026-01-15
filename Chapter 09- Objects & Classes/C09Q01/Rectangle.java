public class Rectangle {
    private double width;
    private double height;

    // No-arg constructor with default values (1,1)
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    // Constructor with specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate and return area
    public double getArea() {
        return width * height;
    }

    // Method to calculate and return perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Getters to retrieve width and height
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}