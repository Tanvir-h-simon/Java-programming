import java.util.Scanner;
public class ConvertFeetMeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of feet: ");
        double feet = scan.nextDouble();

        double meter = feet * 0.305;

        System.out.println(feet + " feet is " + meter + " meters");
    }
}
