import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class C10Q20 {
    public static void main(String[] args) {
        MathContext mc = new MathContext(25, RoundingMode.HALF_UP);

        System.out.printf("%-10s%-35s%n", "i", "Approximate e");

        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal e = BigDecimal.ONE;
            BigDecimal factorial = BigDecimal.ONE;

            for (int j = 1; j <= i; j++) {
                factorial = factorial.multiply(BigDecimal.valueOf(j), mc);
                e = e.add(BigDecimal.ONE.divide(factorial, mc), mc);
            }

            System.out.printf("%-10d%s%n", i, e.toPlainString());
        }
    }
}