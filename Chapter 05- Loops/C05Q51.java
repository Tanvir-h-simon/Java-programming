import java.util.Scanner;

public class C05Q51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Find the longest common prefix
        StringBuilder commonPrefix = new StringBuilder();
        int minLength = Math.min(str1.length(), str2.length());

        // Compare the characters one by one until the characters are different
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                commonPrefix.append(str1.charAt(i));
            } else {
                break;
            }
        }

        // Display the result
        if (commonPrefix.length() == 0) {
            System.out.println(str1 + " and " + str2 + " have no common prefix");
        } else {
            System.out.println("The common prefix is " + commonPrefix.toString());
        }
    }
}