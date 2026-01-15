import java.util.Scanner;

public class C04Q09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scan.nextLine().charAt(0);

        int asciiCode = (int) character;

        System.out.printf("The ASCII code for character '%c' is %d%n", character, asciiCode);
    }
}
