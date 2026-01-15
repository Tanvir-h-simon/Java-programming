import java.util.Scanner;
public class GeometryAreaTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three points for a triangle: ");
        float x1 = scan.nextFloat();
        float y1 = scan.nextFloat();
        float x2 = scan.nextFloat();
        float y2 = scan.nextFloat();
        float x3 = scan.nextFloat();
        float y3 = scan.nextFloat();

        double side1 =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 =  Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double side3 =  Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("The area of the triangle is " + area);
    }
}
