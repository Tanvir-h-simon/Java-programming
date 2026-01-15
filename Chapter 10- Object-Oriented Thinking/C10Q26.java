import java.util.Scanner;

public class C10Q26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expression = input.nextLine();

        // Remove all whitespace
        expression = expression.replaceAll("\\s+", "");

        // Find operator position and type
        char operator = ' ';
        int operatorIndex = -1;

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operator = ch;
                operatorIndex = i;
                break;
            }
        }

        // Extract operands
        String firstOperand = expression.substring(0, operatorIndex);
        String secondOperand = expression.substring(operatorIndex + 1);

        // Convert to numbers
        int num1 = Integer.parseInt(firstOperand);
        int num2 = Integer.parseInt(secondOperand);

        // Calculate and display result
        int result = 0;
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}