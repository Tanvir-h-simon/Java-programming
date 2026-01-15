import java.util.Scanner;

public class C05Q41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int count = 0;

        System.out.print("Enter numbers: ");
        while (true) {
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}