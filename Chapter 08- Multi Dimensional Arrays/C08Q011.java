import java.util.Scanner;

public class C08Q011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();

        if (number < 0 || number > 511) {
            System.out.println("Invalid input. Number must be between 0 and 511.");
            input.close();
            return;
        }

        // Convert the number to 9-bit binary string
        String binary = String.format("%9s", Integer.toBinaryString(number)).replace(' ', '0');

        char[][] coins = new char[3][3];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                coins[i][j] = (binary.charAt(index) == '0') ? 'H' : 'T';
                index++;
            }
        }

        System.out.println("The corresponding matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(coins[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}