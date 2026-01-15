public class Main {
    public static void main(String[] args) {
        MyCharacter myChar = new MyCharacter('A');

        System.out.println("Character: " + myChar.getValue());
        System.out.println("Is Letter: " + myChar.isLetter());
        System.out.println("To Lower Case: " + myChar.toLowerCase());
        System.out.println("Is Digit: " + myChar.isDigit());
        System.out.println("Is Whitespace: " + myChar.isWhitespace());
    }
}