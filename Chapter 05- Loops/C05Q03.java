public class C05Q03 {
    public static void main(String[] args) {
        System.out.println("Kilograms\tPounds");

        for (int kilograms = 1; kilograms < 200; kilograms += 2) {
            double pounds = kilograms * 2.2;
            System.out.printf("%-10d\t%6.1f\n",kilograms, pounds);
        }
    }
}