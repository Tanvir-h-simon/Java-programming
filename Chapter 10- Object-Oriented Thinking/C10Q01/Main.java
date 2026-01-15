public class Main {
    public static void main(String[] args) {

        // Create a Time object with current time
        Time currentTime = new Time();
        System.out.println("Current time is " +
                currentTime.getHour() + ":" +
                currentTime.getMinute() + ":" +
                currentTime.getSecond());

        // Create a Time object with specified elapsed time
        Time elapsedTime = new Time(555550000);
        System.out.println("The time for elapsed time 555550000 is " +
                elapsedTime.getHour() + ":" +
                elapsedTime.getMinute() + ":" +
                elapsedTime.getSecond());
    }
}