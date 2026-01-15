import java.util.Scanner;

public class C07Q08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten double values: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        double averageDouble = average(numbers);
        System.out.printf("The average of the double array is: %.2f", averageDouble);
    }

    public static double average(double[] array){
        double sum = 0;
        for (double value: array){
            sum += value;
        }
        return sum / array.length;
    }
}
