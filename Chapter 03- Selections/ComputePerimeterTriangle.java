import java.util.Scanner;

public class ComputePerimeterTriangle {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first edge: ");
        double edge1 = scan.nextDouble();

        System.out.print("Enter the second edge: ");
        double edge2 = scan.nextDouble();

        System.out.print("Enter the third edge: ");
        double edge3 = scan.nextDouble();

        // Check if the edges form a valid triangle using if-else
        if ((edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1)) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        } else {
            // Display an error message if the triangle is invalid
            System.out.println("The input is invalid. These edges do not form a valid triangle.");
        }
    }
}
