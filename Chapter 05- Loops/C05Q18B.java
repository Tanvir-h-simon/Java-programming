import java.util.Scanner;

public class C05Q18B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int rows = input.nextInt();

        System.out.println(" Pattern B");

        for (int i = rows; i >= 1; i--){
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}