import java.util.Scanner;

public class C04Q07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = scan.nextDouble();

        System.out.println("The coordinates of five points on the pentagon are: ");

        for(int i = 0; i < 5; i++){
            double angle = 2 * Math.PI / 5 * i - Math.PI / 2; // Calculate the angle using formula
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            System.out.printf("%.4f, %.4f\n", x, y);
        }
    }
}