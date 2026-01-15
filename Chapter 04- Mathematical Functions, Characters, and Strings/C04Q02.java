import java.util.Scanner;

public class C04Q02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String[] point1 = scan.nextLine().split(", "); // point1 = "39.55, -116.25" // Splitting the input with comma: "39.55", " -116.25"
        double x1 = Double.parseDouble(point1[0].trim()); // point1[0] = "39.55" // .trim() removes extra space: "39.55" // Double.parseDouble("39.55") converts "39.55" to 39.55 as a double.
        double y1 = Double.parseDouble(point1[1].trim()); // point1[1] = " -116.25" // .trim() removes extra space: "-116.25" // Similarly, Double.parseDouble("-116.25") converts "-116.25" to -116.25.

        /* String point1 = scan.nextLine();
           String[] point1Array = point1.split(",");
           String trimmedX1 = point1Array[0].trim(); // Trim latitude
           String trimmedY1 = point1Array[1].trim(); // Trim longitude
           double x1 = Double.parseDouble(trimmedX1); // Convert latitude
           double y1 = Double.parseDouble(trimmedY1); // Convert longitude
         */


        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        String[] point2 = scan.nextLine().split(", ");
        double x2 = Double.parseDouble(point2[0].trim());
        double y2 = Double.parseDouble(point2[1].trim());

        /* String point2 = scan.nextLine();
           String[] point2Array = point2.split(",");
           String trimmedX2 = point2Array[0].trim(); // Trim latitude
           String trimmedY2 = point2Array[1].trim(); // Trim longitude
           double x2 = Double.parseDouble(trimmedX2); // Convert latitude
           double y2 = Double.parseDouble(trimmedY2); // Convert longitude
         */

        // Convert degree into radian, because the Java trigonometric methods use radians
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        final double RADIUS = 6370.01;

        double d = RADIUS * Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));

        System.out.println("The distance between the two points is " + d + " km");
    }
}
