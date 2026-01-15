import java.util.Scanner;

public class C06Q31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a credit card number
        System.out.print("Enter a credit card number as a long integer: ");
        long cardNumber = input.nextLong();

        // Check if the card is valid
        if (isValid(cardNumber)) {
            System.out.println(cardNumber + " is valid.");
        } else {
            System.out.println(cardNumber + " is invalid.");
        }
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        int size = getSize(number);

        // Check size and prefix rules
        boolean sizeValid = size >= 13 && size <= 16;
        boolean prefixValid = prefixMatched(number, 4) || prefixMatched(number, 5)
                || prefixMatched(number, 37) || prefixMatched(number, 6);

        // Apply the Luhn check
        int totalSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

        return sizeValid && prefixValid && (totalSum % 10 == 0);
    }

    /** Get the result from doubling even-place digits from right to left */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        boolean doubleIt = false;

        while (number > 0) {
            int digit = (int) (number % 10);
            if (doubleIt) {
                sum += getDigit(digit * 2);
            }
            doubleIt = !doubleIt;
            number /= 10;
        }

        return sum;
    }

    /** Return this number if it is a single digit, otherwise return the sum of the two digits */
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number / 10 + number % 10;
        }
    }

    /** Return sum of odd-place digits from right to left */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        boolean doubleIt = true;

        while (number > 0) {
            int digit = (int) (number % 10);
            if (doubleIt) {
                sum += digit;
            }
            doubleIt = !doubleIt;
            number /= 10;
        }

        return sum;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        int prefixSize = getSize(d);
        long prefix = getPrefix(number, prefixSize);
        return prefix == d;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        return String.valueOf(d).length();
    }

    /** Return the first k number of digits from number */
    public static long getPrefix(long number, int k) {
        String numString = Long.toString(number);
        if (numString.length() < k) {
            return number;
        }
        return Long.parseLong(numString.substring(0, k));
    }
}