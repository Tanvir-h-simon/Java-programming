import java.util.Scanner;

public class C07Q03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] counts = new int[100];

        System.out.println("Enter the integers between 1 and 100 (end with 0): ");

        while (true) {
            int integer = scan.nextInt();

            if (integer == 0) {
                break;
            }

            if (integer >= 0 && integer <= 100) {
                counts[integer]++;
            }
        }


        for (int i = 1; i < counts.length; i++){
            if (counts[i] > 0){
                System.out.println(i + " occurs " + counts[i] + (counts[i] > 1 ? " times" : " time"));            }
        }
    }
}