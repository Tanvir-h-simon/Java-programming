import java.util.Scanner;

public class C07Q12 {
    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        numbers = reverseArray(numbers);

        System.out.print("Reversed Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}