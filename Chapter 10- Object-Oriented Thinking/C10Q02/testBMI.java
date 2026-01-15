import java.util.Scanner;

public class testBMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your weight (Pound): ");
        double weight = input.nextDouble();
        System.out.println("Enter your height (feet and inches): ");
        double feet = input.nextDouble();
        double inches = input.nextDouble();

        BMI bmi = new BMI(name, age, weight, feet, inches);
        System.out.println("Name: " + bmi.getName());
        System.out.println("Age: " + bmi.getAge());
        System.out.println("Weight: " + bmi.getWeight());
        System.out.println("Height: " + bmi.getHeight());
        System.out.printf("BMI: %.2f\n", bmi.calcBMI());
        System.out.println("Status: " + bmi.getBMIStatus());
    }
}