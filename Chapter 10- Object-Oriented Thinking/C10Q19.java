import java.math.BigInteger;

public class C10Q19 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-30s%n", "p", "2^p - 1");

        for (int p = 2; p <= 100; p++) {
            BigInteger two = BigInteger.valueOf(2);
            BigInteger candidate = two.pow(p).subtract(BigInteger.ONE);

            if (candidate.isProbablePrime(20)) { // 20 is a certainty for high confidence
                System.out.printf("%-10d%s%n", p, candidate.toString());
            }
        }
    }
}