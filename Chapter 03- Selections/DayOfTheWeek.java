import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        System.out.print("Enter a month: ");
        int m = scan.nextInt(); // m = month
        System.out.print("Enter the day of the month: ");
        int q = scan.nextInt(); // q = day of the month

        // Adjust January and February
        if (m == 1 || m == 2){
            m += 12;
        }

        int j = year / 100; // j = century
        int k = year % 100; // k = year of the century


        // Compute the day of the week
        int h = (q + ((26 * (m+1)) / 10) + k + (k/4) + (j / 4) + (5 * j)) % 7;
        String day;
        switch (h){
            case 0:
                day = "Saturday";
                break;
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            default:
                day = "Invalid Option";
                break;
        }
        System.out.println("Day of the week is " + day);
    }
}
