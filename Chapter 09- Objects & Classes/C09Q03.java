import java.util.Date;

public class C09Q03 {
    public static void main(String[] args) {
        long[] time = {10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L};

        for (int i = 0; i < time.length; i++) {
            Date date = new Date(time[i]); // Creating Date object
            System.out.println("Elapsed time: " + time[i] + " miliseconds. " + "Time: " + date.toString());
        }
    }
}