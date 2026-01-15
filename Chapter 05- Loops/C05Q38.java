import java.util.Scanner;

public class C05Q38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for a decimal integer
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        // Convert to octal manually
        String octal = "";
        int number = decimal;

        if (number == 0) {
            octal = "0";
        } else {
            while (number > 0) {
                int remainder = number % 8;
                octal = remainder + octal;
                number /= 8;
            }
        }

        // Display result
        System.out.println("The octal value is " + octal);
    }
}
