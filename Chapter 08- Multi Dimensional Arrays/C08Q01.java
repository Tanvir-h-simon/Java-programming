import java.util.Scanner;

public class C08Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] mat = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = input.nextDouble();
            }
        }

        for (int col = 0; col < 4; col++) {
            double sum = sumColumn(mat, col);
            System.out.println("Sum of the elements at column " + col + " is " + sum);
        }

        input.close();
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}