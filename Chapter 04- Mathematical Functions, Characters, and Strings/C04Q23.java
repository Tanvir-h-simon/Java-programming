import java.util.Scanner;

public class C04Q23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Getting user inputs
        System.out.print("Enter employee's name: ");
        String employeeName = scan.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = scan.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = scan.nextDouble();

        System.out.print("Enter federal tax withholding rate (as a decimal): ");
        double federalTaxRate = scan.nextDouble();

        System.out.print("Enter state tax withholding rate (as a decimal): ");
        double stateTaxRate = scan.nextDouble();

        // Calculating gross pay
        double grossPay = hoursWorked * hourlyPayRate;

        // Calculating deductions
        double federalWithholding = grossPay * federalTaxRate;
        double stateWithholding = grossPay * stateTaxRate;
        double totalDeduction = federalWithholding + stateWithholding;

        // Calculating net pay
        double netPay = grossPay - totalDeduction;

        // Printing the payroll statement
        System.out.println("\nEmployee Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + hourlyPayRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.1f%%): $%.2f\n", federalTaxRate * 100, federalWithholding);
        System.out.printf("  State Withholding (%.1f%%): $%.2f\n", stateTaxRate * 100, stateWithholding);
        System.out.printf("  Total Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f\n", netPay);
    }
}

