import java.util.Scanner;

public class C04Q12{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hex = scan.nextLine().toUpperCase();

        if (hex.length() == 1 && // The input is exactly one character long
                (hex.charAt(0) >= '0' && hex.charAt(0) <= '9') ||
                (hex.charAt(0) >= 'A' && hex.charAt(0) <= 'F')) {

            // Convert hex to decimal first // Use datatype variable = Datatype.parseDatatype(String s) to convert a string to other data type
            int decimal = Integer.parseInt(hex, 16); //

            // Convert decimal to Binary // Use Integer.toHexString(int i) to convert a decimal to a hexadecimal string.
            String binary = Integer.toBinaryString(decimal);
            System.out.println("The binary value is " + binary);
        } else {
            // Invalid input
            System.out.println(hex + " is an invalid input");
        }
    }
}