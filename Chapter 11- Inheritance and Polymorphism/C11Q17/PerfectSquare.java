import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();

        ArrayList<Integer> factors = getPrimeFactors(m);

        int n = 1;
        ArrayList<Integer> counted = new ArrayList<>();

        for (int f : factors) {
            if (!counted.contains(f)) {
                int count = 0;
                for (int x : factors) {
                    if (x == f) count++;
                }
                if (count % 2 != 0) {
                    n *= f;
                }
                counted.add(f);
            }
        }

        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));
    }

    public static ArrayList<Integer> getPrimeFactors(int m) {
        ArrayList<Integer> factors = new ArrayList<>();
        int num = m;

        // Factor out 2s first
        while (num % 2 == 0) {
            factors.add(2);
            num /= 2;
        }

        // Factor out odd primes
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }

        // If num > 2, it's prime
        if (num > 2) factors.add(num);

        return factors;
    }
}