public class Main {

    public static void main(String[] args) {
        // Test MyStringBuilder1 class
        System.out.println("Testing MyStringBuilder1:");

        MyStringBuilder1 str1 = new MyStringBuilder1("Hello");
        MyStringBuilder1 str2 = new MyStringBuilder1(" World");

        // Append str2 to str1
        str1.append(str2);
        System.out.println("After append: " + str1.toString());

        // Append an integer to str1
        str1.append(2025);
        System.out.println("After appending integer: " + str1.toString());

        // Get the length of str1
        System.out.println("Length of str1: " + str1.length());

        // Get character at index 6
        System.out.println("Character at index 6: " + str1.charAt(6));

        // Convert str1 to lowercase
        MyStringBuilder1 strLower = str1.toLowerCase();
        System.out.println("After toLowerCase: " + strLower.toString());

        // Get substring from index 6 to index 11
        MyStringBuilder1 subStr = str1.substring(6, 11);
        System.out.println("Substring from 6 to 11: " + subStr.toString());

        // Convert str1 to String and print
        String finalString = str1.toString();
        System.out.println("Final String: " + finalString);

        System.out.println("\n----------------------------\n");

        // Test MyStringBuilder2 class
        System.out.println("Testing MyStringBuilder2:");

        MyStringBuilder2 str3 = new MyStringBuilder2("Hello");
        MyStringBuilder2 str4 = new MyStringBuilder2(" World");

        // Insert str4 into str3 at offset 5
        str3.insert(5, str4);
        System.out.println("After insert: " + str3.toString());

        // Reverse str3
        str3.reverse();
        System.out.println("After reverse: " + str3.toString());

        // Get substring from index 6
        MyStringBuilder2 subStr2 = str3.substring(6);
        System.out.println("Substring from 6: " + subStr2.toString());

        // Convert str3 to uppercase
        str3.toUpperCase();
        System.out.println("After toUpperCase: " + str3.toString());

        // Append characters to str3
        str3.append('!');
        System.out.println("After appending character: " + str3.toString());

        // Append another MyStringBuilder2 object
        MyStringBuilder2 str5 = new MyStringBuilder2("!!!");
        str3.append(str5);
        System.out.println("After appending MyStringBuilder2 object: " + str3.toString());

        // Get the length of str3
        System.out.println("Length of str3: " + str3.length());

        // Get character at index 6
        System.out.println("Character at index 6: " + str3.charAt(6));

        // Convert str3 to String and print
        String finalString2 = str3.toString();
        System.out.println("Final String: " + finalString2);
    }
}