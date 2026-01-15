import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month (January = 1, February = 2,..., December = 12: ");
        int month = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        int numberOfDays;

        switch (month) {
            case 1:
                numberOfDays = 31;
                System.out.print("January " + year + " had " + numberOfDays + " days " );
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    numberOfDays = 29;
                    System.out.print("February " + year + " had " + numberOfDays + " days " );
                } else {
                    numberOfDays = 28;
                    System.out.print("February " + year + " had " + numberOfDays + " days " );
                }
                break;
            case 3:
                numberOfDays = 31;
                System.out.print("March " + year + " had " + numberOfDays + " days " );
                break;
            case 4:
                numberOfDays = 30;
                System.out.print("April " + year + " had " + numberOfDays + " days " );
                break;
            case 5:
                numberOfDays = 31;
                System.out.print("May " + year + " had " + numberOfDays + " days " );
                break;
            case 6:
                numberOfDays = 30;
                System.out.print("June " + year + " had " + numberOfDays + " days " );
                break;
            case 7:
                numberOfDays = 31;
                System.out.print("July " + year + " had " + numberOfDays + " days " );
                break;
            case 8:
                numberOfDays = 30;
                System.out.print("August " + year + " had " + numberOfDays + " days " );
                break;
            case 9:
                numberOfDays = 31;
                System.out.print("September " + year + " had " + numberOfDays + " days " );
                break;
            case 10:
                numberOfDays = 30;
                System.out.print("October " + year + " had " + numberOfDays + " days " );
                break;
            case 11:
                numberOfDays = 31;
                System.out.print("November " + year + " had " + numberOfDays + " days " );
                break;
            case 12:
                numberOfDays = 30;
                System.out.print("December " + year + " had " + numberOfDays + " days " );
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
