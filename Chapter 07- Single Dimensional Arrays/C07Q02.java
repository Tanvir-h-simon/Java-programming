import java.util.Scanner;

public class C07Q02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] integer = {10, 15, 16, 45, 78, 96, 9, 8 ,3, 4};

        /*
        int[] integer = new int[10];

        System.out.print("Enter 10 integer: ");
        for (int i = 0; i < 10; i++){
            integer[i] = scan.nextInt();
        }
        */

        System.out.print("Reverse the numbers: ");
        for (int i = 9; i >= 0; i--){
            System.out.print(integer[i] + " ");
        }
    }
}