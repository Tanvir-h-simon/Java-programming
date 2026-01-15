import java.util.GregorianCalendar;

public class C09Q05 {
    public static void main(String[] args) {
        // Display the current year, month, and day
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Current date: ");
        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + calendar.get(GregorianCalendar.MONTH) + 1); // Month count starts from 0
        System.out.println("Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));

        // Set time to the value (1234567898765L) and display year, month, and day
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("Date after setting time in milliseconds:");
        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + calendar.get(GregorianCalendar.MONTH) + 1); // Month count starts from 0
        System.out.println("Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}