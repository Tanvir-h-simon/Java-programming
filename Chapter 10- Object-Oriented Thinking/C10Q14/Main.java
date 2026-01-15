public class Main {
    public static void main(String[] args) {
        // Create MyDate object for the current date
        MyDate date1 = new MyDate();
        System.out.println("Current date:");
        System.out.println("Year: " + date1.getYear());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Day: " + date1.getDay());

        // Create MyDate object with elapsed time
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("\nDate with elapsed time 34355555133101L:");
        System.out.println("Year: " + date2.getYear());
        System.out.println("Month: " + date2.getMonth());
        System.out.println("Day: " + date2.getDay());
    }
}