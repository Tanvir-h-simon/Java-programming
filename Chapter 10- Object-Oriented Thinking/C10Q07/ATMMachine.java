import java.util.Scanner;
import java.util.Date;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100.0);
        }

        while (true) {
            // Prompt user to enter ID
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            // Validate ID
            while (id < 0 || id > 9) {
                System.out.print("Please enter a correct id: ");
                id = input.nextInt();
            }

            boolean exitMainMenu = false;
            while (!exitMainMenu) {
                // Display main menu
                System.out.println("\nMain menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1: // Check balance
                        System.out.println("The balance is " + accounts[id].getBalance());
                        break;
                    case 2: // Withdraw
                        System.out.print("Enter an amount to withdraw: ");
                        double withdrawAmount = input.nextDouble();
                        accounts[id].withdraw(withdrawAmount);
                        break;
                    case 3: // Deposit
                        System.out.print("Enter an amount to deposit: ");
                        double depositAmount = input.nextDouble();
                        accounts[id].deposit(depositAmount);
                        break;
                    case 4: // Exit
                        exitMainMenu = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 1-4.");
                        break;
                }
            }
        }
    }
}

