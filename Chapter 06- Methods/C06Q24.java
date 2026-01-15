import java.util.Calendar;

public class C06Q24 {
    public static void main(String[] args) {
        // Get the current time in milliseconds since epoch (January 1, 1970)
        long totalMilliseconds = System.currentTimeMillis();

        // Create a Calendar instance and set the time
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(totalMilliseconds);

        // Extract year, month, day, hour, minute, and second
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Month is 0-based
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // Display the current date and time
        System.out.printf("Current Date: %d-%02d-%02d%n", year, month, day);
        System.out.printf("Current Time: %02d:%02d:%02d%n", hour, minute, second);
    }
}
