import java.util.Scanner;

public class C05Q44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        short number = input.nextShort();

        String bitString = getBitString(number);

        System.out.println("The bits are " + bitString);

        input.close();
    }

    public static String getBitString(short number) {
        StringBuilder bits = new StringBuilder();

        for (int i = 15; i >= 0; i--) {
            int mask = 1 << i;
            bits.append((number & mask) != 0 ? '1' : '0');
        }

        return bits.toString();
    }
}
