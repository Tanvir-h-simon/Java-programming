import java.util.Scanner;
public class GeometryHexagon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the side of the hexagon: ");
        double side = scan.nextFloat();

        double area = 3 * (Math.sqrt(3) * Math.pow(side, 2)) / 2;

        System.out.println("The area of the hexagon is " + area);
    }
}
