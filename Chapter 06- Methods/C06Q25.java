public class C06Q25 {
    public static String convertMillis(long millis) {
        // Convert milliseconds to total seconds
        long totalSeconds = millis / 1000;

        // Extract seconds
        long seconds = totalSeconds % 60;

        // Convert total seconds to total minutes
        long totalMinutes = totalSeconds / 60;

        // Extract minutes
        long minutes = totalMinutes % 60;

        // Convert total minutes to hours
        long hours = totalMinutes / 60;

        // Return the formatted string
        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        // Test the method with different inputs
        System.out.println(convertMillis(5500));          // Output: 0:0:5
        System.out.println(convertMillis(100000));        // Output: 0:1:40
        System.out.println(convertMillis(555550000));     // Output: 154:19:10
    }
}
