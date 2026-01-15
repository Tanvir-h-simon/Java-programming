import java.util.Scanner;

public class C04Q21 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter a SSN (DDD-DD-DDDD): ");
        String ssn = scan.nextLine();

        // Check if the SSN matches the pattern DDD-DD-DDDD

        // if (ssn.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]"))
        // \d{3} matches exactly 3 digit, - matches a hyphen
        // \d{2} matches exactly 2 digit, - matches a hyphen
        // \d{4} matches exactly 4 digits
        if (ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }
    }
}