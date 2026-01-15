public class MyStringBuilder2 {
    private char[] value;  // Array to store characters
    private int size;      // Size of the current string

    // Default constructor: Initializes an empty string
    public MyStringBuilder2() {
        this.value = new char[16];  // Initial capacity of 16
        this.size = 0;
    }

    // Constructor: Initializes the string with a char array
    public MyStringBuilder2(char[] chars) {
        this.value = new char[chars.length];
        System.arraycopy(chars, 0, this.value, 0, chars.length);
        this.size = chars.length;
    }

    // Constructor: Initializes the string with a string
    public MyStringBuilder2(String s) {
        this.value = s.toCharArray();
        this.size = s.length();
    }

    // Insert another MyStringBuilder2 object at a given offset
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        if (offset < 0 || offset > this.size) {
            throw new StringIndexOutOfBoundsException("Invalid offset");
        }

        int newLength = this.size + s.size;
        char[] newValue = new char[newLength];

        // Copy the part before the offset
        System.arraycopy(this.value, 0, newValue, 0, offset);

        // Copy the new string (s) into the new array
        System.arraycopy(s.value, 0, newValue, offset, s.size);

        // Copy the part after the offset
        System.arraycopy(this.value, offset, newValue, offset + s.size, this.size - offset);

        this.value = newValue;
        this.size = newLength;

        return this;
    }

    // Reverse the current string
    public MyStringBuilder2 reverse() {
        for (int i = 0; i < this.size / 2; i++) {
            char temp = this.value[i];
            this.value[i] = this.value[this.size - 1 - i];
            this.value[this.size - 1 - i] = temp;
        }
        return this;
    }

    // Get a substring starting from the given index
    public MyStringBuilder2 substring(int begin) {
        if (begin < 0 || begin > this.size) {
            throw new StringIndexOutOfBoundsException("Invalid index");
        }

        MyStringBuilder2 subStr = new MyStringBuilder2();
        for (int i = begin; i < this.size; i++) {
            subStr.append(this.charAt(i));
        }

        return subStr;
    }

    // Convert the string to uppercase
    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < this.size; i++) {
            this.value[i] = Character.toUpperCase(this.value[i]);
        }
        return this;
    }

    // Append a character to the string
    public MyStringBuilder2 append(char c) {
        ensureCapacity(size + 1); // Make sure there’s enough space
        this.value[size++] = c;
        return this;
    }

    // Append a string (MyStringBuilder2)
    public MyStringBuilder2 append(MyStringBuilder2 s) {
        ensureCapacity(size + s.size);
        System.arraycopy(s.value, 0, this.value, this.size, s.size);
        this.size += s.size;
        return this;
    }

    // Ensure the capacity of the internal array
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > this.value.length) {
            int newCapacity = this.value.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            char[] newValue = new char[newCapacity];
            System.arraycopy(this.value, 0, newValue, 0, this.size);
            this.value = newValue;
        }
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

    // Convert the MyStringBuilder2 object to a regular String
    public String toString() {
        return new String(this.value, 0, this.size);
    }

    // Main method to test the MyStringBuilder2 class
    public static void main(String[] args) {
        MyStringBuilder2 str1 = new MyStringBuilder2("Hello");
        MyStringBuilder2 str2 = new MyStringBuilder2(" World");

        // Insert a string at offset 5
        str1.insert(5, str2);
        System.out.println("After insert: " + str1.toString());

        // Reverse the string
        str1.reverse();
        System.out.println("After reverse: " + str1.toString());

        // Substring from index 6
        MyStringBuilder2 subStr = str1.substring(6);
        System.out.println("Substring from 6: " + subStr.toString());

        // Convert to uppercase
        str1.toUpperCase();
        System.out.println("After toUpperCase: " + str1.toString());
    }
}