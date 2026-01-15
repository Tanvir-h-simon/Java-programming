public class C07Q23 {
    public static void main(String[] args) {
        // Initialize an array to represent the lockers, all set to false (closed)
        boolean[] lockers = new boolean[100];

        // Simulate the students toggling the lockers
        for (int student = 1; student <= 100; student++) {
            for (int locker = student - 1; locker < 100; locker += student) {
                lockers[locker] = !lockers[locker]; // Toggle the locker
            }
        }

        // Display the open lockers
        System.out.println("Open lockers:");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) { // If the locker is open
                System.out.print((i + 1) + " "); // Locker numbers are 1-based
            }
        }
    }
}