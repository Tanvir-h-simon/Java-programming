import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the radius of a cylinder: ");
    double radius = scan.nextDouble();
    System.out.print("Enter the length of a cylinder: ");
    double length = scan.nextDouble();

    double area = Math.PI * radius * radius;
    double volume = area * length;

    System.out.println("The are is " + area);
    System.out.println("The volume is " + volume);
    }
}
