import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scan.nextDouble();
        System.out.print("Enter your height in inches: ");
        double heightInches = scan.nextDouble();

        double weightKilograms = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;
        double bmi = weightKilograms / (heightMeters * heightMeters);

        System.out.println("BMI is " + bmi);
    }
}
