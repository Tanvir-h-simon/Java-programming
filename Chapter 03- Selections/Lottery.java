import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the last three-digit number: ");
        int guessDigit = sc.nextInt();

        // Get digits from guess
        int guessDigit3 = guessDigit % 10;
        int guessDigit2 = (guessDigit / 10) % 10;
        int guessDigit1 = guessDigit / 100;

        // Generate a 3-digit (100 to 999)  lottery number
        int lotteryDigit = (int) (100 + (Math.random() * ((999 - 100) + 1)));

        // Get digits from lottery
        int lotteryDigit3 = lotteryDigit % 10;
        int lotteryDigit2 = (lotteryDigit / 10) % 10;
        int lotteryDigit1 = lotteryDigit / 100;

        System.out.println("The lottery number is " + lotteryDigit);

        if (guessDigit == lotteryDigit) {
            System.out.println("You got it! You win $10,000");
        }
        else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) &&
                (guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 || guessDigit2 == lotteryDigit1) &&
                (guessDigit3 == lotteryDigit3 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit1)) {
            System.out.println("You win $3,000");
        }
        else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) ||
                (guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 || guessDigit2 == lotteryDigit1) ||
                (guessDigit3 == lotteryDigit3 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit1)) {
            System.out.println("You win $1,000");
        }
        else {
            System.out.println("Better luck next time!");
        }
    }
}