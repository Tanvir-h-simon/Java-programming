public class Main {
    public static void main(String[] args) {
        Triangle2D t1 = new Triangle2D(
                new MyPoint(2.5, 2),
                new MyPoint(4.2, 3),
                new MyPoint(5, 3.5)
        );

        // Display t1's area and perimeter
        System.out.println("Area of t1: " + t1.getArea());
        System.out.println("Perimeter of t1: " + t1.getPerimeter());

        // Test the contains(x, y) method
        System.out.println("t1 contains point (3, 3): " + t1.contains(3, 3));

        // Create another Triangle2D for the contains test
        Triangle2D t2 = new Triangle2D(
                new MyPoint(2.9, 2),
                new MyPoint(4, 1),
                new MyPoint(1, 3.4)
        );

        // Test the contains(Triangle2D) method
        System.out.println("t1 contains triangle t2: " + t1.contains(t2));

        // Create a third Triangle2D for the overlap test
        Triangle2D t3 = new Triangle2D(
                new MyPoint(2, 5.5),
                new MyPoint(4, -3),
                new MyPoint(2, 6.5)
        );

        // Test the overlaps(Triangle2D) method
        System.out.println("t1 overlaps with triangle t3: " + t1.overlaps(t3));
    }
}