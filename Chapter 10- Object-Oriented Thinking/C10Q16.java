import java.math.BigInteger;

public class C10Q16 {
    public static void main(String[] args) {
        int count = 0;

        // Smallest 50-digit number = 10^49
        BigInteger number = new BigInteger("1" + "0".repeat(49));

        while (count < 10) {
            if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO) || number.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}