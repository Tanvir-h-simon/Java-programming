public class C06Q38 {
    public static void main(String[] args) {
        System.out.println("100 Uppercase Letters:");
        printRandomCharacters(100, 'A');

        System.out.println("\n100 Single Digits:");
        printRandomCharacters(100, '0');
    }

    /** Print 100 random characters based on the given type */
    public static void printRandomCharacters(int count, char type) {
        int lineCount = 0;

        for (int i = 0; i < count; i++) {
            char randomChar;
            if (type == 'A') {
                randomChar = RandomCharacter.getRandomUpperCaseLetter();
            } else if (type == '0') {
                randomChar = RandomCharacter.getRandomDigitCharacter();
            } else {
                randomChar = '?'; // Placeholder for unsupported type
            }

            System.out.print(randomChar + " ");
            lineCount++;

            // Print a newline after every 10 characters
            if (lineCount % 10 == 0) {
                System.out.println();
            }
        }
    }

    public class RandomCharacter {
        /** Generate a random character between ch1 and ch2 */
        public static char getRandomCharacter(char ch1, char ch2) {
            return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
        }

        /** Generate a random lowercase letter */
        public static char getRandomLowerCaseLetter() {
            return getRandomCharacter('a', 'z');
        }

        /** Generate a random uppercase letter */
        public static char getRandomUpperCaseLetter() {
            return getRandomCharacter('A', 'Z');
        }

        /** Generate a random digit character */
        public static char getRandomDigitCharacter() {
            return getRandomCharacter('0', '9');
        }

        /** Generate a random character */
        public static char getRandomCharacter() {
            return getRandomCharacter('\u0000', '\uFFFF');
        }
    }
}