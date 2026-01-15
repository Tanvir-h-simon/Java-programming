public class C06Q12 {
    public static void main(String[] args) {
        // Call the method to print characters from '1' to 'Z', 10 characters per line
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0; // Counter for characters printed

        for (char ch = ch1; ch <= ch2; ch++) {
            System.out.print(ch + " ");
            count++;

            // Move to the next line after printing the specified number of characters
            if (count % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
