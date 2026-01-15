public class Main {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(); // Using no-arg constructor for (0, 0)
        MyPoint point2 = new MyPoint(10, 30.5); // Using parameterized constructor

        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        double distance = point1.distance(point2);
        System.out.println("The distance between Point 1 and Point 2 is: " + distance);

        double distance2 = point1.distance(10, 30.5);
        System.out.println("The distance calculated using coordinates is: " + distance2);

        System.out.println("Both distance methods give the same result: " + (distance == distance2));
    }
}