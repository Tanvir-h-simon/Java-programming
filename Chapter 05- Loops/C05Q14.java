import java.util.Scanner;

public class C05Q14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        // Find the minimum of n1 and n2
        int d = (n1 < n2) ? n1 : n2;
        int gcd = 1;  // Default gcd

        // Check from d down to 1 for common divisors
        for (int i = d; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;  // Stop when the first (largest) divisor is found
            }
        }
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}