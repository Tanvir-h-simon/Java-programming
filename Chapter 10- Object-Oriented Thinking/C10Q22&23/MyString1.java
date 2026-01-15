public class MyString1 {
    private final char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public char charAt(int index) {
        if (index < 0 || index >= chars.length)
            throw new IndexOutOfBoundsException("Index out of range");
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end)
            throw new IndexOutOfBoundsException("Invalid begin or end index");

        char[] sub = new char[end - begin];
        for (int i = begin; i < end; i++) {
            sub[i - begin] = chars[i];
        }
        return new MyString1(sub);
    }

    public MyString1 toLowerCase() {
        char[] lower = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            lower[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(lower);
    }

    public boolean equals(MyString1 s) {
        if (this.chars.length != s.length()) return false;
        for (int i = 0; i < chars.length; i++) {
            if (this.chars[i] != s.charAt(i)) return false;
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        String intStr = Integer.toString(i);
        char[] charArray = intStr.toCharArray();
        return new MyString1(charArray);
    }

    @Override
    public String toString() {
        return new String(chars);
    }
}