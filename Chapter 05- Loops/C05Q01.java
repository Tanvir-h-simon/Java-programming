import java.util.Scanner;

public class C05Q01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        double total = 0;
        double count = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        while (true) {
            int integer = scan.nextInt();

            if (integer == 0) {
                break;
            }

            if (integer > 0){

                positiveCount++;

            } else {
                negativeCount++;
            }
            total += integer;
            count++;
        }
        if (count == 0){
            System.out.println("No numbers are entered except 0.");
        } else {
            double average = total / count;
            System.out.println("Number of positives: " + positiveCount);
            System.out.println("Number of negatives: " + negativeCount);
            System.out.printf("The total is %.2f\n", total);
            System.out.printf("The average is %.2f\n", average);
        }
    }
}
