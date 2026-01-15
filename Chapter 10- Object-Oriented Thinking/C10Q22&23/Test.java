public class Test {
    public static void main(String[] args) {
        // Test MyString1
        System.out.println("=== Testing MyString1 ===");
        char[] data1 = {'H', 'e', 'l', 'l', 'o'};
        MyString1 str1 = new MyString1(data1);
        System.out.println("Original: " + str1);
        System.out.println("charAt(1): " + str1.charAt(1));
        System.out.println("length: " + str1.length());
        System.out.println("substring(1, 4): " + str1.substring(1, 4));
        System.out.println("toLowerCase: " + str1.toLowerCase());
        System.out.println("equals 'Hello': " + str1.equals(new MyString1(new char[]{'H', 'e', 'l', 'l', 'o'})));
        System.out.println("valueOf(123): " + MyString1.valueOf(123));

        System.out.println();

        // Test MyString2
        System.out.println("=== Testing MyString2 ===");
        MyString2 str2 = new MyString2("HelloWorld");
        System.out.println("Original: " + str2);
        System.out.println("compare to 'Hello': " + str2.compare("Hello"));
        System.out.println("compare to 'HelloWorld': " + str2.compare("HelloWorld"));
        System.out.println("compare to 'Zebra': " + str2.compare("Zebra"));
        System.out.println("substring from index 5: " + str2.substring(5));
        System.out.println("toUpperCase: " + str2.toUpperCase());
        System.out.print("toChars: ");
        for (char c : str2.toChars()) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("valueOf(true): " + MyString2.valueOf(true));
        System.out.println("valueOf(false): " + MyString2.valueOf(false));
    }
}
