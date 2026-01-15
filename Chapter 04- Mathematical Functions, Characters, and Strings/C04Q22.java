import java.util.Scanner;

public class C04Q22 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter string s1: ");
        String string1 = scan.nextLine();
        System.out.print("Enter string s2: ");
        String string2 = scan.nextLine();

        if (string1.contains(string2)){
            System.out.println(string2 + " is a substring of " + string1);
        } else {
            System.out.println(string2 + " is not a substring of " + string1);
        }
    }
}
