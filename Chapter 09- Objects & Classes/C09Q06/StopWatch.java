/*  //import java.util.GregorianCalendar;
    import java.time.LocalTime;

public class Stopwatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public Stopwatch() {
//        GregorianCalendar calendar = new GregorianCalendar();
//        int hour = calendar.get(GregorianCalendar.HOUR_OF_DAY);
//        int minute = calendar.get(GregorianCalendar.MINUTE);
//        int second = calendar.get(GregorianCalendar.SECOND);
//        LocalTime currentTime = LocalTime.now();
//        this.startTime = currentTime;
        this.startTime = LocalTime.now();
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }
}
*/

public class StopWatch {
    private long startTime;
    private long endTime;

    // Constructor
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}