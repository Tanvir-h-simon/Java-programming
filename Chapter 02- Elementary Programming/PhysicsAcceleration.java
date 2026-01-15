import java.util.Scanner;

public class PhysicsAcceleration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter v0, v1 and t: ");
        double v0 = scan.nextDouble();
        double v1 = scan.nextDouble();
        double t = scan.nextDouble();

        double acceleration = (v1 - v0) / t;
        System.out.println("The average acceleration is: " + acceleration);
    }
}
