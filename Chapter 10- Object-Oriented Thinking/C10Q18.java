import java.math.BigInteger;

public class C10Q18 {
    public static void main(String[] args) {
        // Start from Long.MAX_VALUE + 1
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);

        int count = 0;
        while (count < 5) {
            number = number.nextProbablePrime();
            System.out.println(number);
            count++;
        }
    }
}