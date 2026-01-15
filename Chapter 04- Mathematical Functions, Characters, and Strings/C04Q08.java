import java.util.Scanner;

public class C04Q08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an ASCII code (between 0 and 127): ");
        int code = scan.nextInt();

        if (code >= 0 && code <= 127){
            char asciiCharacter = (char) code;
            System.out.printf("The character for ASCII code %d is %c \n", code, asciiCharacter);
        } else {
            System.out.println("Invalid input");
        }
    }
}
