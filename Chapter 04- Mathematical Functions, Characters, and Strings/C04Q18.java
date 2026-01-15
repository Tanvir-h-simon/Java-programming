import java.util.Scanner;

public class C04Q18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String characters = input.nextLine();

        if (characters.length() != 2){
            System.out.println("Invalid input. Please enter exactly two characters.");
            return;
        }
        char major = Character.toUpperCase(characters.charAt(0));
        char year = characters.charAt(1);

        String majorName;

        switch (major){
            case 'M':
                majorName = "Mathematics";
                break;
            case 'C':
                majorName = "Computer Science";
                break;
            case 'I':
                majorName = "Information Technology";
                break;
            default:
                System.out.println("Invalid major code.");
                return;
        }

        String status;

        switch (year){
            case '1':
                status = "Freshman";
                break;
            case '2':
                status = "Sophomore";
                break;
            case '3':
                status = "Junior";
                break;
            case '4':
                status = "Senior";
                break;
            default:
                System.out.println("Invalid year code.");
                return;
        }
        System.out.println(majorName + " " + status);
    }
}