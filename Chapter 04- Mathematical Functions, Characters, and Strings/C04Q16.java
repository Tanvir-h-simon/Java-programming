public class C04Q16 {
    public static void main(String[] args){

        char randomCharacter = (char) ('A' + Math.random() * 26);
        // ASCII 'A' = 65 and 'Z' = 90 and Math.random() * 26 generates a number between 0 and 25
        randomCharacter = Character.toUpperCase(randomCharacter);

        System.out.print(randomCharacter);
    }
}