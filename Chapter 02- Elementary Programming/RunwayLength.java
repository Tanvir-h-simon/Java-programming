import java.util.Scanner;
public class RunwayLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Velocity and Acceleration: ");
        double velocity = scan.nextDouble();
        double acceleration = scan.nextDouble();

        double runwayLength = Math.pow(velocity, 2) / (2 * acceleration);
        System.out.println("The minimum Runway Length for this airplane is : " + runwayLength);
    }
}
