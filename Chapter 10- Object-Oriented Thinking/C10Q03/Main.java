public class Main {
    public static void main(String[] args) {

        MyInteger num1 = new MyInteger(23);
        System.out.println("Test constructor and getValue():");
        System.out.println("num1 value: " + num1.getValue());

        System.out.println("\nTest instance methods:");
        System.out.println("num1.isEven(): " + num1.isEven());
        System.out.println("num1.isOdd(): " + num1.isOdd());
        System.out.println("num1.isPrime(): " + num1.isPrime());

        System.out.println("\nTest static methods with int parameter:");
        System.out.println("MyInteger.isEven(8): " + MyInteger.isEven(8));
        System.out.println("MyInteger.isOdd(8): " + MyInteger.isOdd(8));
        System.out.println("MyInteger.isPrime(8): " + MyInteger.isPrime(8));
        System.out.println("MyInteger.isEven(7): " + MyInteger.isEven(7));
        System.out.println("MyInteger.isOdd(7): " + MyInteger.isOdd(7));
        System.out.println("MyInteger.isPrime(7): " + MyInteger.isPrime(7));

        System.out.println("\nTest static methods with MyInteger parameter:");
        MyInteger num2 = new MyInteger(7);
        MyInteger num3 = new MyInteger(8);
        System.out.println("MyInteger.isEven(num2): " + MyInteger.isEven(num2));
        System.out.println("MyInteger.isOdd(num2): " + MyInteger.isOdd(num2));
        System.out.println("MyInteger.isPrime(num2): " + MyInteger.isPrime(num2));
        System.out.println("MyInteger.isEven(num3): " + MyInteger.isEven(num3));
        System.out.println("MyInteger.isOdd(num3): " + MyInteger.isOdd(num3));
        System.out.println("MyInteger.isPrime(num3): " + MyInteger.isPrime(num3));

        // Test equals methods
        System.out.println("\nTest equals methods:");
        System.out.println("num1.equals(23): " + num1.equals(23));
        System.out.println("num1.equals(22): " + num1.equals(22));

        MyInteger num4 = new MyInteger(23);
        MyInteger num5 = new MyInteger(24);
        System.out.println("num1.equals(num4): " + num1.equals(num4));
        System.out.println("num1.equals(num5): " + num1.equals(num5));

        // Test parseInt methods
        System.out.println("\nTest parseInt methods:");
        char[] numChars = {'1', '2', '3', '4', '5'};
        System.out.println("MyInteger.parseInt(char[] {'1','2','3','4','5'}): " + MyInteger.parseInt(numChars));

        String numStr = "54321";
        System.out.println("MyInteger.parseInt(\"54321\"): " + MyInteger.parseInt(numStr));

        // Test edge cases
        System.out.println("\nTest edge cases:");
        MyInteger zero = new MyInteger(0);
        MyInteger one = new MyInteger(1);
        MyInteger two = new MyInteger(2);
        System.out.println("zero.isPrime(): " + zero.isPrime());
        System.out.println("one.isPrime(): " + one.isPrime());
        System.out.println("two.isPrime(): " + two.isPrime());

        // Test large numbers
        MyInteger largeNum = new MyInteger(997);  // A prime number
        System.out.println("\nTest large number:");
        System.out.println("largeNum.isPrime() [997]: " + largeNum.isPrime());
    }
}