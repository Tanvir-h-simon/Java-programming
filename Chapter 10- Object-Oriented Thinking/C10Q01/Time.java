public class Time {
    private int hour;
    private int minute;
    private int second;

    /** No-arg constructor that creates a Time object for the current time */
    public Time() {
        // Get current time in milliseconds
        long currentTime = System.currentTimeMillis();
        setTime(currentTime);
    }

    /** Constructor that constructs a Time object with the specified elapsed time
     since midnight, January 1, 1970, in milliseconds */
    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    /** Constructor that constructs a Time object with the specified hour, minute, and second */
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        // Calculate total seconds since midnight, Jan 1, 1970
        long totalSeconds = elapsedTime / 1000;

        // Calculate current second
        second = (int)(totalSeconds % 60);

        // Calculate total minutes
        long totalMinutes = totalSeconds / 60;

        // Calculate current minute
        minute = (int)(totalMinutes % 60);

        // Calculate total hours
        long totalHours = totalMinutes / 60;

        // Calculate current hour (in GMT)
        hour = (int)(totalHours % 24);
    }
}