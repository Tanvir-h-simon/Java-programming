import java.math.BigInteger;

public class C10Q21 {
    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        BigInteger five = BigInteger.valueOf(5);
        BigInteger six = BigInteger.valueOf(6);

        int count = 0;

        while (count < 10) {
            if (number.mod(five).equals(BigInteger.ZERO) || number.mod(six).equals(BigInteger.ZERO)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}