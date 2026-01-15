import java.util.Scanner;

public class C06Q35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side length of the pentagon
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate the area of the pentagon
        double area = area(side);

        // Display the result
        System.out.printf("The area of the pentagon is %.15f%n", area);
    }

    /** Method to calculate the area of a pentagon */
    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}