import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2):  ");
        int userChoice = scan.nextInt();

        int computerChoice = (int) (Math.random() * 3);

        System.out.println("User choice: " + getChoiceName(userChoice));
        System.out.println("Computer choice: " + getChoiceName(computerChoice));

        if (userChoice == computerChoice) {
            System.out.println("It's a draw!");
        } else if ((userChoice == 0 && computerChoice == 2) || // Scissor beats paper
                (userChoice == 1 && computerChoice == 0) || // Rock beats scissor
                (userChoice == 2 && computerChoice == 1)) {  // Paper beats rock
            System.out.println("You win!");
        } else if ((userChoice == 0 && computerChoice == 1) || // Rock beats scissor
                (userChoice == 1 && computerChoice == 2) ||  // Paper beats rock
                (userChoice == 2 && computerChoice == 0)) {   // Scissor beats paper
            System.out.println("You lost!");
        }
    }
    // Method to convert choice numbers to names
    public static String getChoiceName(int choice) {
        switch (choice) {
            case 0:
                return "Scissor";
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            default:
                return "Invalid";
        }
    }
}
