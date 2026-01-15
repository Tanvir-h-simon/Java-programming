import java.util.Scanner;
public class PoundsIntoKilograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = scan.nextDouble();

        double kilograms = pounds * 0.45359237;
        System.out.println(pounds + " pounds is " + kilograms + " in kilograms");
    }
}
