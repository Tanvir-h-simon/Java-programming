import java.util.Scanner;

public class C06Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++) {
            // Print spaces for right alignment
            for (int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            // Print numbers in decreasing order
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}