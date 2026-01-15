public class C05Q06 {
    public static void main(String[] args) {
        System.out.println("Miles       Kilometers  |  Kilometers       Miles");

        int kilometers2 = 20;

        for (int miles1 = 1; miles1 <= 10; miles1++, kilometers2 += 5) {
            double kilometers1 = miles1 * 1.609;
            double miles2 = kilometers2 / 1.609;

            System.out.printf("%-12d%-10.3f  |  %-17d%.3f\n",
                    miles1, kilometers1, kilometers2, miles2);
        }
    }
}
