import java.util.Scanner;

public class C08Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] mat = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = input.nextDouble();
            }
        }

        double sum = sumMajorDiagonal(mat);
        System.out.println("Sum of the elements in the major diagonal is " + sum);

        input.close();
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];  // Add element where row index = column index
        }
        return sum;
    }
}