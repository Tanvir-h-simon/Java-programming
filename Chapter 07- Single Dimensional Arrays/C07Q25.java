import java.util.Scanner;

public class C07Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter coefficients a, b, and c
        System.out.print("Enter coefficients a, b, and c: ");
        double[] eqn = new double[3];
        eqn[0] = input.nextDouble(); // a
        eqn[1] = input.nextDouble(); // b
        eqn[2] = input.nextDouble(); // c

        double[] roots = new double[2]; // Array to store the roots

        // Solve the quadratic equation
        int numberOfRoots = solveQuadratic(eqn, roots);

        // Display the result
        if (numberOfRoots == 0) {
            System.out.println("The equation has no real roots.");
        } else if (numberOfRoots == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else if (numberOfRoots == 2) {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return 0; // No real roots
        } else if (discriminant == 0) {
            roots[0] = -b / (2 * a); // One real root
            return 1;
        } else {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a); // First root
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a); // Second root
            return 2;
        }
    }
}