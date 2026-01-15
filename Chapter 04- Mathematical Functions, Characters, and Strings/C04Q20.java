import java.util.Scanner;

public class C04Q20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String aString = scan.nextLine();

        System.out.println("Length: " + aString.length());
        System.out.println("First character: " + aString.charAt(0));
    }
}