import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int smallest, middle, largest;

        // Find the smallest
        if (a <= b && a <= c) {
            smallest = a;
            if (b <= c) {
                middle = b;
                largest = c;
            } else {
                middle = c;
                largest = b;
            }
        } else if (b <= a && b <= c) {
            smallest = b;
            if (a <= c) {
                middle = a;
                largest = c;
            } else {
                middle = c;
                largest = a;
            }
        } else {
            smallest = c;
            if (a <= b) {
                middle = a;
                largest = b;
            } else {
                middle = b;
                largest = a;
            }
        }
        System.out.println("The integers in non-decreasing order are: " + smallest + " " + middle + " " + largest);
    }
}