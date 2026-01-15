public class MyCharacter {

    private char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    // Returns the character value
    public char getValue() {
        return this.value;
    }

    // Checks if the character is a letter
    public boolean isLetter() {
        return Character.isLetter(this.value);
    }

    // Checks if the character is a digit
    public boolean isDigit() {
        return Character.isDigit(this.value);
    }

    // Checks if the character is a letter or a digit
    public boolean isLetterOrDigit() {
        return Character.isLetterOrDigit(this.value);
    }

    // Checks if the character is a whitespace
    public boolean isWhitespace() {
        return Character.isWhitespace(this.value);
    }

    // Converts the character to uppercase
    public char toUpperCase() {
        return Character.toUpperCase(this.value);
    }

    // Converts the character to lowercase
    public char toLowerCase() {
        return Character.toLowerCase(this.value);
    }


    // Returns the numeric value of the character if it's a digit
    public int getNumericValue() {
        return Character.getNumericValue(this.value);
    }

    // Checks if the character is a control character
    public boolean isControl() {
        return Character.isISOControl(this.value);
    }

    // Provides a basic equality check based on character value
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyCharacter that = (MyCharacter) obj;
        return value == that.value;
    }

    // Override hashCode() to ensure consistency with equals()
    @Override
    public int hashCode() {
        return Character.hashCode(this.value);
    }

    // Override toString() method to return a string representation
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}