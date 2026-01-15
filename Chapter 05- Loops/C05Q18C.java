import java.util.Scanner;

public class C05Q18C {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the number of lines: ");
        int rows = input.nextInt();

        System.out.println("Pattern C");

        for (int i = 1; i <= rows; i++){
            for (int j = rows; j > i; j--){
                System.out.print("  "); // space before number
            }
            for (int k = i; k >= 1; k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}