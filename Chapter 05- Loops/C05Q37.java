import java.util.Scanner;

public class C05Q37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for a decimal integer
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        // Convert to binary manually
        String binary = "";
        int number = decimal;

        if (number == 0) {
            binary = "0";
        } else {
            while (number > 0) {
                int remainder = number % 2;
                binary = remainder + binary;
                number /= 2;
            }
        }

        // Display result
        System.out.println("The binary value is " + binary);
    }
}
