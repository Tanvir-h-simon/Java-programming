public class C05Q26 {
    public static void main(String[] args) {
        for (int n = 10000; n <= 100000; n += 10000) {
            double e = 1.0;
            double item = 1.0;
            for (int i = 1; i <= n; i++) {
                item /= i;
                e += item;
            }
            System.out.println("e approximation for i = " + n + ": " + e);
        }
    }
}