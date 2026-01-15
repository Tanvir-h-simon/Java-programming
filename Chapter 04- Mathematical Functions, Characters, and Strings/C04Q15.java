import java.util.Scanner;

public class C04Q15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = scan.nextLine().toLowerCase().charAt(0);

        String print;

        if (letter == 'a' || letter == 'b' || letter == 'c'){
            print = "The corresponding number is 2.";
        } else if (letter == 'd' || letter == 'e' || letter == 'f'){
            print = "The corresponding number is 3.";
        } else if (letter == 'g' || letter == 'h' || letter == 'i') {
            print = "The corresponding number is 4.";
        } else if (letter == 'j' || letter == 'k' || letter == 'l') {
            print = "The corresponding number is 5.";
        } else if (letter == 'm' || letter == 'n' || letter == 'o') {
            print = "The corresponding number is 6.";
        } else if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's') {
            print = "The corresponding number is 7.";
        } else if (letter == 't' || letter == 'u' || letter == 'v') {
            print = "The corresponding number is 8.";
        } else if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z') {
            print = "The corresponding number is 9.";
        } else {
            print = letter + " is an invalid input.";
        }
        System.out.println(print);
    }
}
/*
import java.util.Scanner;

public class C04Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        letter = Character.toUpperCase(letter);

        String result;

        switch (letter) {
            case 'A': case 'B': case 'C':
                result = "The corresponding number is 2";
                break;
            case 'D': case 'E': case 'F':
                result = "The corresponding number is 3";
                break;
            case 'G': case 'H': case 'I':
                result = "The corresponding number is 4";
                break;
            case 'J': case 'K': case 'L':
                result = "The corresponding number is 5";
                break;
            case 'M': case 'N': case 'O':
                result = "The corresponding number is 6";
                break;
            case 'P': case 'Q': case 'R': case 'S':
                result = "The corresponding number is 7";
                break;
            case 'T': case 'U': case 'V':
                result = "The corresponding number is 8";
                break;
            case 'W': case 'X': case 'Y': case 'Z':
                result = "The corresponding number is 9";
                break;
            default:
                result = letter + " is an invalid input";
        }

        // Print the result once
        System.out.println(result);
    }
}
*/