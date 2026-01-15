public class MyString2 {
    private final char[] chars;

    public MyString2(String s) {
        this.chars = s.toCharArray();
    }

    public int compare(String s) {
        int minLength = Math.min(chars.length, s.length());

        for (int i = 0; i < minLength; i++) {
            if (chars[i] != s.charAt(i)) {
                return chars[i] - s.charAt(i);
            }
        }
        return chars.length - s.length();
    }

    public MyString2 substring(int begin) {
        if (begin < 0 || begin > chars.length)
            throw new IndexOutOfBoundsException("Invalid begin index");

        char[] sub = new char[chars.length - begin];
        for (int i = begin; i < chars.length; i++) {
            sub[i - begin] = chars[i];
        }
        return new MyString2(new String(sub));
    }

    public MyString2 toUpperCase() {
        char[] upper = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            upper[i] = Character.toUpperCase(chars[i]);
        }
        return new MyString2(new String(upper));
    }

    public char[] toChars() {
        char[] copy = new char[chars.length];
        System.arraycopy(chars, 0, copy, 0, chars.length);
        return copy;
    }

    public static MyString2 valueOf(boolean b) {
        return new MyString2(String.valueOf(b));
    }

    @Override
    public String toString() {
        return new String(chars);
    }
}