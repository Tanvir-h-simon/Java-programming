import java.util.Scanner;
public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double x1 = (- b + Math.sqrt(Math.pow(b, 2) - 4 * a * c) ) / (2 * a);
        double x2 = (- b - Math.sqrt(Math.pow(b, 2) - 4 * a * c) ) / (2 * a);

        System.out.println("The equation has two roots " + x1 + " and " + x2);
    }
}
