public class C05Q10 {
    public static void main(String[] args) {

        int count = 0;

        for (int number = 100; number <= 1000; number++) {
            if (number % 5 == 0 && number % 6 == 0) {
                count++;
                System.out.print(number);
                if (count % 10 == 0) { // Print a newline after every 10 numbers
                    System.out.println(); // Move to the next line
                } else {
                    System.out.print(" "); // Move to the next line
                }
            }
        }
    }
}