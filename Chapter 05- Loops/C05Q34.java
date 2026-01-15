import java.util.Scanner;
import java.util.Random;

public class C05Q34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int userWins = 0;
        int computerWins = 0;

        while (true) {
            int computerChoice = random.nextInt(3);

            System.out.print("Enter Scissor, Rock, or Paper: ");
            String userChoice = input.next().toLowerCase();

            if (!(userChoice.equals("scissor") || userChoice.equals("rock") || userChoice.equals("paper"))) {
                System.out.println("Invalid input. Please enter Scissor, Rock, or Paper.");
                continue;
            }

            String computerString = switch (computerChoice) {
                case 0 -> "scissor";
                case 1 -> "rock";
                case 2 -> "paper";
                default -> "";
            };

            System.out.println("Computer chose: " + computerString.substring(0, 1).toUpperCase() + computerString.substring(1));
            System.out.println("You chose: " + userChoice.substring(0, 1).toUpperCase() + userChoice.substring(1));

            int result = determineWinner(userChoice, computerString);

            if (result == 0) {
                System.out.println("It's a draw!");
            } else if (result == 1) {
                System.out.println("You win this round!");
                userWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }

            System.out.println("Score - You: " + userWins + " Computer: " + computerWins);

            if (userWins > 2 * computerWins) {
                System.out.println("Congratulations! You won the game.");
                break;
            } else if (computerWins > 2 * userWins) {
                System.out.println("Computer wins the game. Better luck next time!");
                break;
            }
        }
        input.close();
    }

    public static int determineWinner(String user, String computer) {
        if (user.equals(computer)) {
            return 0; // Draw
        } else if ((user.equals("scissor") && computer.equals("paper")) ||
                (user.equals("rock") && computer.equals("scissor")) ||
                (user.equals("paper") && computer.equals("rock"))) {
            return 1; // User wins
        } else {
            return -1; // Computer wins
        }
    }
}