public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

//        System.out.println(triangle.toString());
        System.out.println();
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}