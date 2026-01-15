public class C05Q33 {

    public static void main(String[] args) {
        // Loop through numbers from 1 to 9999
        for (int number = 1; number < 10000; number++) {
            int sumOfDivisors = 0;

            // Find the divisors of the number
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }

            // Check if the number is a perfect number
            if (sumOfDivisors == number) {
                System.out.println(number + " is a perfect number.");
            }
        }
    }
}
