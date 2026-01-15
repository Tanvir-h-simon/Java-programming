import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the values of a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        double discriminant = qe.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("The equation has two roots: " + qe.getRoot1() + " and " + qe.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The equation has one root: " + qe.getRoot1());
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}