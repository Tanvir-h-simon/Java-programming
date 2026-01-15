import java.util.Scanner;

public class C08Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];

        System.out.println("Enter matrix1 (3x3):");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = input.nextDouble();

        System.out.println("Enter matrix2 (3x3):");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = input.nextDouble();

        double[][] c = multiplyMatrix(a, b);

        System.out.println("The multiplication of the matrices is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");
            System.out.print(" * ");
            for (int j = 0; j < 3; j++)
                System.out.print(b[i][j] + " ");
            System.out.print(" = ");
            for (int j = 0; j < 3; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }

        input.close();
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        double[][] c = new double[rowsA][colsB];

        // Multiply a by b
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                double sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }

        return c;
    }
}
