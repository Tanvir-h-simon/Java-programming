import java.util.Scanner;

public class C05Q29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Year and first day of the year
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first day of the year (0=Sunday, 1=Monday, ..., 6=Saturday): ");
        int firstDayOfYear = scanner.nextInt();

        // Loop through each month
        for (int month = 1; month <= 12; month++) {
            // Print the month name
            String monthName = "";
            switch (month) {
                case 1: monthName = "January"; break;
                case 2: monthName = "February"; break;
                case 3: monthName = "March"; break;
                case 4: monthName = "April"; break;
                case 5: monthName = "May"; break;
                case 6: monthName = "June"; break;
                case 7: monthName = "July"; break;
                case 8: monthName = "August"; break;
                case 9: monthName = "September"; break;
                case 10: monthName = "October"; break;
                case 11: monthName = "November"; break;
                case 12: monthName = "December"; break;
            }

            // Print the month and year
            System.out.println("\n" + monthName + " " + year);
            System.out.println("Su Mo Tu We Th Fr Sa");

            // Determine number of days in the current month
            int daysInMonth = 0;
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                daysInMonth = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
            } else if (month == 2) {
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            }

            // Print leading spaces for the first day of the month
            for (int i = 0; i < firstDayOfYear; i++) {
                System.out.print("   ");
            }

            // Print the days of the month
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%2d ", day);

                // If it's Saturday (the 6th day), move to the next line
                if ((firstDayOfYear + day) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println(); // Newline after the month is printed

            // Update the first day for the next month
            firstDayOfYear = (firstDayOfYear + daysInMonth) % 7;
        }
    }
}
