import java.util.Scanner;

public class C08Q05 {
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

        double[][] c = addMatrix(a, b);

        System.out.println("The matrices are added as follows:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");
            System.out.print(" + ");
            for (int j = 0; j < 3; j++)
                System.out.print(b[i][j] + " ");
            System.out.print(" = ");
            for (int j = 0; j < 3; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }

        input.close();
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] c = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                c[i][j] = a[i][j] + b[i][j];
        return c;
    }
}
