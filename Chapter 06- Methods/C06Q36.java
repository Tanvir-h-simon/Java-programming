import java.util.Scanner;

public class C06Q36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of sides
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        // Prompt the user to enter the side length
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate the area of the polygon
        double area = area(n, side);

        // Display the result
        System.out.printf("The area of the polygon is %.15f%n", area);
    }

    /** Method to calculate the area of a regular polygon */
    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
