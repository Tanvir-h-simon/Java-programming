import java.util.Scanner;

public class C04Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15):");
        int decimal = scan.nextInt();

        if (decimal < 0 || decimal > 15){
            System.out.println("Invalid input. Please enter a number between 0 and 15.");
        } else {
            String hex = Integer.toHexString(decimal).toUpperCase();
            System.out.println("The hex value is: " + hex);
        }
    }
}

/*
import java.util.Scanner;

public class C04Q12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hex = scan.nextLine().toUpperCase();

        if (hex.length() == 1 && // The input is exactly one character long
                (hex.charAt(0) >= '0' && hex.charAt(0) <= '9') ||
                (hex.charAt(0) >= 'A' && hex.charAt(0) <= 'F')) {

            int decimal = Integer.parseInt(hex, 16);
            System.out.println("The decimal value is " + decimal);
        } else {
            System.out.println("Invalid input. Please enter a hex character between 0 and F.");
        }
    }
}
*/