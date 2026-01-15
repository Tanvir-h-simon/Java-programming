import java.util.Scanner;

public class C05Q16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("The smallest factors are: ");

        for (int i = 2; i <= number; i++){
            while (number % i == 0){
                System.out.print(i);
                number /= i;

                // Print comma if more factors follow
                if (number > 1){
                    System.out.print(",");
                }
            }
        }
    }
}
