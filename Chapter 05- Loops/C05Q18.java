public class C05Q18 {
    public static void main(String[] args) {

        int rows = 6;

        // Pattern A
        System.out.println("Pattern A");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Pattern B
        System.out.println("\nPattern B");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        // Pattern C
        System.out.println("\nPattern C");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        // Pattern D
        System.out.println("\nPattern D");
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (rows - i); k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}