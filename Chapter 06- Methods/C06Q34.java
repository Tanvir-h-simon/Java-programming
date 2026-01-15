import java.util.Scanner;

public class C06Q34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter year (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month (1-31): ");
        int day = input.nextInt();

        // Adjust year and month for Zeller's congruence
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }

        // Extract century (j) and year of the century (k)
        int j = year / 100;
        int k = year % 100;

        // Calculate the day of the week using Zeller's congruence formula
        int h = (day + (26 * (month + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        // Convert Zeller's output (0: Saturday, 1: Sunday, ..., 6: Friday) to day name
        String dayOfWeek = getDayName(h);

        // Display the result
        System.out.println("Day of the week is " + dayOfWeek);
    }

    /** Return the name of the day based on Zeller's formula result */
    public static String getDayName(int dayIndex) {
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[dayIndex];
    }
}
