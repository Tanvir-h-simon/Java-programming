import java.util.Calendar;
import java.util.TimeZone;

public class C06Q33 {
    public static void main(String[] args) {
        // Get the total milliseconds since epoch
        long totalMilliseconds = System.currentTimeMillis();

        // Calculate total seconds
        long totalSeconds = totalMilliseconds / 1000;

        // Calculate current second
        long currentSecond = totalSeconds % 60;

        // Calculate total minutes
        long totalMinutes = totalSeconds / 60;

        // Calculate current minute
        long currentMinute = totalMinutes % 60;

        // Calculate total hours
        long totalHours = totalMinutes / 60;

        // Calculate current hour (adjusting for timezone)
        long currentHour = totalHours % 24;

        // Get the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        calendar.setTimeInMillis(totalMilliseconds);

        int year = calendar.get(Calendar.YEAR);
        String month = getMonthName(calendar.get(Calendar.MONTH));
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.printf("Current date and time is %s %d, %d %02d:%02d:%02d%n",
                month, day, year, currentHour, currentMinute, currentSecond);
    }

    /** Get the name of the month */
    public static String getMonthName(int monthIndex) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[monthIndex];
    }
}