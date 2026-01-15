import java.util.Scanner;
public class CurrentTime {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the time zone offset to GMT: ");
      float GMT = scan.nextFloat();

      // Obtain the total milliseconds since midnight, Jan 1, 1970
      long totalMiliSeconds = System.currentTimeMillis();

      // Obtain the total seconds
      long totalSeconds = totalMiliSeconds / 1000;

      // Compute the current seconds
      long currentSeconds = totalSeconds % 60;

      // Obtain the total minutes
      long totalMinutes = totalSeconds / 60;

      // Obtain the current minutes
      long currentMinutes = totalMinutes % 60;

      // Obtain the total hours
      long totalHours = totalMinutes / 60;

      // Obtain the current hours and adjust for the time zone
      float currentHours = (totalHours + GMT) % 24;
      // Handle negative hours
      if (currentHours < 0) {
          currentHours += 24;
      }
      int hours = (int) currentHours;
      System.out.println("Current Time: " + hours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
  }
}
