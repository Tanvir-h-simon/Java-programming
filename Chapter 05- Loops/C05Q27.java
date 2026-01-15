import java.util.Scanner;

public class C05Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for year and first day of the year
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = input.nextInt();

        // Days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Adjust for leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29; // February has 29 days in a leap year
        }

        // Display first day of each month
        for (int i = 0; i < 12; i++) {
            System.out.println(months[i] + " 1, " + year + " is " + daysOfWeek[firstDay]);
            firstDay = (firstDay + daysInMonth[i]) % 7; // Calculate the first day of the next month
        }
    }
}