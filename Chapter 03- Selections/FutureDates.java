import java.util.Scanner;

public class FutureDates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter today's day (Sunday = 0, Monday = 1,..., Saturday = 6): ");
        int today = scan.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = scan.nextInt();

        // Calculate the future day
        int futureDay = (today + elapsedDays) % 7;

        // Determine the name of today's day using switch
        String todayName = " ";
        switch (today) {
            case 0:
                todayName = ("Sunday");
                break;
            case 1:
                todayName = ("Monday");
                break;
            case 2:
                todayName = ("Tuesday");
                break;
            case 3:
                todayName = ("Wednesday");
                break;
            case 4:
                todayName = ("Thursday");
                break;
            case 5:
                todayName = ("Friday");
                break;
            case 6:
                todayName = ("Saturday");
                break;
            default:
                todayName = ("Invalid day");
                return; // Exit if calculation fails
        }
        // Determine the name of the future day using switch
        String futureDayName = " ";
        switch (futureDay) {
            case 0:
                futureDayName = ("Sunday");
                break;
            case 1:
                futureDayName = "Monday";
                break;
            case 2:
                futureDayName = "Tuesday";
                break;
            case 3:
                futureDayName = "Wednesday";
                break;
            case 4:
                futureDayName = "Thursday";
                break;
            case 5:
                futureDayName = "Friday";
                break;
            case 6:
                futureDayName = "Saturday";
                break;
            default:
                System.out.println("Invalid future day calculation.");
                return; // Exit the program if calculation fails
        }
        // Display the result in one line
        System.out.println("Today is " + todayName + " and the future days is " + futureDayName + " .");

        scan.close();
    }
}