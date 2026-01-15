import java.math.BigInteger;

public class C10Q17 {
    public static void main(String[] args) {
        // Get the square root of Long.MAX_VALUE and add 1 to get the next number
        long longMaxSqrt = (long) Math.sqrt(Long.MAX_VALUE);
        BigInteger n = BigInteger.valueOf(longMaxSqrt + 1);

        int count = 0;
        while (count < 10) {
            BigInteger square = n.multiply(n);
            System.out.println(square);
            n = n.add(BigInteger.ONE);
            count++;
        }
    }
}