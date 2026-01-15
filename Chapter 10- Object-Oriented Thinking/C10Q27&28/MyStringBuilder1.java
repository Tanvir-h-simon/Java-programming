public class MyStringBuilder1 {
    private char[] value;  // Array to store characters
    private int size;      // Size of the current string

    // Constructor: Initialize the MyStringBuilder1 with a string
    public MyStringBuilder1(String s) {
        this.value = s.toCharArray();
        this.size = s.length();
    }

    // Append another MyStringBuilder1 object
    public MyStringBuilder1 append(MyStringBuilder1 s) {
        int newLength = this.size + s.size;
        char[] newValue = new char[newLength];

        // Copy current value to newValue
        System.arraycopy(this.value, 0, newValue, 0, this.size);

        // Copy the other MyStringBuilder1 value to newValue
        System.arraycopy(s.value, 0, newValue, this.size, s.size);

        this.value = newValue;
        this.size = newLength;

        return this;  // Return this object for method chaining
    }

    // Append an integer to the current value
    public MyStringBuilder1 append(int i) {
        String str = Integer.toString(i);
        int newLength = this.size + str.length();
        char[] newValue = new char[newLength];

        // Copy current value to newValue
        System.arraycopy(this.value, 0, newValue, 0, this.size);

        // Append integer as a string
        for (int j = 0; j < str.length(); j++) {
            newValue[this.size + j] = str.charAt(j);
        }

        this.value = newValue;
        this.size = newLength;

        return this;
    }

    // Get the length of the current string
    public int length() {
        return this.size;
    }

    // Get the character at a specified index
    public char charAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new StringIndexOutOfBoundsException("Index out of bounds");
        }
        return this.value[index];
    }

    // Convert the string to lowercase
    public MyStringBuilder1 toLowerCase() {
        for (int i = 0; i < this.size; i++) {
            this.value[i] = Character.toLowerCase(this.value[i]);
        }
        return this;
    }

    // Get a substring from the given index range (inclusive begin, exclusive end)
    public MyStringBuilder1 substring(int begin, int end) {
        if (begin < 0 || end > this.size || begin > end) {
            throw new StringIndexOutOfBoundsException("Invalid range");
        }

        MyStringBuilder1 subStr = new MyStringBuilder1("");
        for (int i = begin; i < end; i++) {
            subStr.append(this.charAt(i));
        }

        return subStr;
    }

    // Convert MyStringBuilder1 object to a string
    public String toString() {
        return new String(this.value, 0, this.size);
    }

    // Test the custom MyStringBuilder1 class
    public static void main(String[] args) {
        MyStringBuilder1 str1 = new MyStringBuilder1("Hello");
        MyStringBuilder1 str2 = new MyStringBuilder1(" World");

        // Append strings
        str1.append(str2);
        System.out.println("After append: " + str1.toString());

        // Append integer
        str1.append(123);
        System.out.println("After appending integer: " + str1.toString());

        // Length
        System.out.println("Length: " + str1.length());

        // CharAt
        System.out.println("Char at index 4: " + str1.charAt(4));

        // Convert to lower case
        str1.toLowerCase();
        System.out.println("After toLowerCase: " + str1.toString());

        // Substring
        MyStringBuilder1 subStr = str1.substring(6, 10);
        System.out.println("Substring (6 to 10): " + subStr.toString());
    }
}