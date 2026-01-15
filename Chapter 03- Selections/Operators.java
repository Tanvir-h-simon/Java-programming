import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scan.nextInt();

        boolean divisibleBy5 = (number % 5 == 0);
        boolean divisibleBy6 = (number % 6 == 0);

        // Logical operations
        boolean divisibleByBoth = divisibleBy5 && divisibleBy6;
        boolean divisibleByEither = divisibleBy5 || divisibleBy6;
        boolean divisibleByOneButNotBoth = divisibleBy5 ^ divisibleBy6;

        // Display results
        System.out.println("Is " + number + " divisible by 5 and 6? " + divisibleByBoth);
        System.out.println("Is " + number + " divisible by 5 or 6? " + divisibleByEither);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + divisibleByOneButNotBoth);
    }
}
