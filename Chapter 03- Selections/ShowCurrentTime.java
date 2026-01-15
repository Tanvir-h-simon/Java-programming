import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int timeZoneOffset = scan.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour in GMT and adjust for the time zone
        long currentHour = (totalHours + timeZoneOffset) % 24;

        // Adjust to 12-hour format and determine AM/PM
        String period = (currentHour >= 12) ? "PM" : "AM";
        currentHour = (currentHour % 12 == 0) ? 12 : currentHour % 12;

        // Display results
        System.out.println("The current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " " + period);
    }
}
