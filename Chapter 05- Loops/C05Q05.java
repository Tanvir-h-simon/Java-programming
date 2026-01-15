public class C05Q05 {
    public static void main(String[] args){
        System.out.println("Kilograms     Pounds   |    Pounds     Kilograms");

        int pounds2 = 20;

        for (int kilograms1 = 1; kilograms1 < 200; kilograms1 += 2, pounds2 += 5){
            double pounds1 = kilograms1 * 2.2;
            double kilograms2 = pounds2 / 2.2;
            System.out.printf("%-14d%-9.1f|    %d%18.2f\n", kilograms1, pounds1, pounds2, kilograms2);
        }

    }
}