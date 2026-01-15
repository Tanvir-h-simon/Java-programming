import java.util.Scanner;
public class FinancialApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subtotal = scan.nextDouble();
        System.out.print("Enter the gratuity rate (%): ");
        double gratuityRate = scan.nextDouble();

        double gratuity = gratuityRate / 10;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total + ".");
    }
}
