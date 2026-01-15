import java.util.Scanner;

public class HealthApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightPounds = scan.nextDouble();

        final double weightKG = weightPounds * 0.45359;

        System.out.print("Enter feet: ");
        double heightFeet = scan.nextDouble();

        final double heightFeetToMeters = heightFeet * 0.3048;

        System.out.print("Enter inches: ");
        double heightInches = scan.nextDouble();

        final double heightInchesToMeters = heightInches * 0.0254;

        double heightInMeters = heightInchesToMeters + heightFeetToMeters;

        // Compute BMI
        double bmi = weightKG / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + bmi);


        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");

        /* Determine BMI category using conditional operator
        String category = (bmi < 18.5) ? "Underweight" : (bmi < 25) ? "Normal" : (bmi < 30) ? "Overweight" : "Obese";
        */

        }
    }
}
