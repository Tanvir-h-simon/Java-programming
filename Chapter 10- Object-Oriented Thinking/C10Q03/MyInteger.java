public class MyInteger {
    private int value;


    public MyInteger(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        if (value <= 3) {
            return true;
        }
        if (value % 2 == 0 || value % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= value) {
            if (value % i == 0 || value % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }


    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        if (value <= 3) {
            return true;
        }
        if (value % 2 == 0 || value % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= value) {
            if (value % i == 0 || value % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }


    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }


    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInt) {
        return this.value == myInt.getValue();
    }


    public static int parseInt(char[] chars) {
        int result = 0;
        for (char c : chars) {
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character in array: " + c);
            }
            result = result * 10 + (c - '0');
        }
        return result;
    }

    public static int parseInt(String str) {
        return parseInt(str.toCharArray());
    }
}