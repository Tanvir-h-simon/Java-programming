import java.util.Scanner;

public class C04Q17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        scan.nextLine();  // Consume the newline character after nextInt() to avoid skipping input

        System.out.print("Enter a month (First three letters): ");
        String month = scan.nextLine();
        // Capitalize the first letter and convert the rest to lowercase
        // substring(0, 1) extracts the first character, while substring(1) extracts the rest of the string
        month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();

        switch (month){
            case "Jan": case "Mar": case "May": case "Jul": case "Aug": case "Oct": case "Dec":
                System.out.println(month + " " + year + " has 31 days.");
                break;
            case "Apr": case "Jun": case "Sep": case "Nov":
                System.out.println(month + " " + year + " has 30 days.");
                break;
            case "Feb":
                if (year % 4 == 0 && year % 400 == 0 && year % 100 != 0){
                    System.out.println("Feb " + year + " has 28 days.");
                } else {
                    System.out.println("Feb " + year + " has 29 days.");
                }
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}