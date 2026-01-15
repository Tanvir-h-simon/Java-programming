public class C06Q16 {
    public static void main(String[] args) {
        // Print the header
        System.out.printf("%-10s%-15s\n", "Year", "Number of Days");
        System.out.println("------------------------");

        // Loop through years from 2000 to 2020
        for (int year = 2000; year <= 2020; year++) {
            System.out.printf("%-10d%-15d\n", year, numberOfDaysInAYear(year));
        }
    }

    // Method to calculate the number of days in a given year
    public static int numberOfDaysInAYear(int year) {
        // Check if the year is a leap year
        if (isLeapYear(year)) {
            return 366; // Leap year has 366 days
        } else {
            return 365; // Non-leap year has 365 days
        }
    }

    // Helper method to determine if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year logic
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}