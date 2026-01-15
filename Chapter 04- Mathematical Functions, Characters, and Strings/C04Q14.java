import java.util.Scanner;

public class C04Q14 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char grade = scan.nextLine().toUpperCase().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("The numeric value for grade " + grade + " is 4");
                break;
            case 'B':
                System.out.println("The numeric value for grade " + grade + " is 3");
                break;
            case 'C':
                System.out.println("The numeric value for grade " + grade + " is 2");
                break;
            case 'D':
                System.out.println("The numeric value for grade " + grade + " is 1");
                break;
            case 'F':
                System.out.println("The numeric value for grade " + grade + " is 0");
                break;
            default:
                System.out.println(grade + " is an invalid grade");
        }
    }
}

/*
import java.util.Scanner;

public class C04Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char grade = input.next().charAt(0);

        grade = Character.toUpperCase(grade);

        String result;

        switch (grade) {
            case 'A':
                result = "The numeric value for grade A is 4";
                break;
            case 'B':
                result = "The numeric value for grade B is 3";
                break;
            case 'C':
                result = "The numeric value for grade C is 2";
                break;
            case 'D':
                result = "The numeric value for grade D is 1";
                break;
            case 'F':
                result = "The numeric value for grade F is 0";
                break;
            default:
                result = grade + " is an invalid grade";
        }
        System.out.println(result);
    }
}
*/