import java.util.Scanner;

public class PointInACircle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        final double radius = 10.0;

        double distance = Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)));

        if (distance <= radius){
            System.out.println("Point (" + x + ", " + y + ") is in the circle.");
        } else {
            System.out.print("Point (" + x + " , " + y + ") is out of circle.");
        }
    }
}
