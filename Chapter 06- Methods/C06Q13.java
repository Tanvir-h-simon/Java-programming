public class C06Q13 {
    public static void main(String[] args){

        System.out.printf("%-10s%-10s\n", "i", "m(i)");
        System.out.println("-----------------");

        double sum = 0.0;

        for (int i = 1; i <= 20; i++){
            for (int j = i + 1; j <= (i + 1); j++) {
                sum += (double) i / j;
            }
            System.out.printf("%-10d%-10.4f\n", i, sum);
        }
    }
}