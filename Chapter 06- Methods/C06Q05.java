import java.util.Scanner;

public class C06Q05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        // Call the method to display numbers in sorted order
        System.out.print("The numbers in increasing order are: ");
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers (double num1, double num2, double num3) {

        double smallest, middle, largest;

        // Find the largest number
        if (num1 >= num2 && num1 >= num3){
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3){
            largest = num2;
        } else {
            largest = num3;
        }

        // Find the smallest number
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        // Find the middle number
        middle = num1 + num2 + num3 - smallest - largest;

        System.out.println(smallest + " " + middle + " " + largest);

        /*
        double temp;

        // Swap num1 and num2 if out of order
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // Swap num2 and num3 if out of order
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            ;
            num3 = temp;
        }
        // Recheck num1 and num2 after the second swap
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
         */
    }
}