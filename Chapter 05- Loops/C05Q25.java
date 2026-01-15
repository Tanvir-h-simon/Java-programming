public class C05Q25 {
    public static void main (String[] args){
        for (int n = 10000; n <= 100000; n += 10000) {
            double pi = 0.0;
            for (int i = 1; i <= n; i++) {
                pi += Math.pow(-1, i + 1) / (2 * i - 1);
            }
            pi *= 4;
            System.out.println("Pi approximation for i = " + n + ": " + pi);
        }
    }
}
