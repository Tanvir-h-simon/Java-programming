public class C05Q07 {
    public static void main(String[] args){
        double tuitionFee = 10000;
        double totalTuition = 0;

        for (int year = 1; year <= 10; year++){
            tuitionFee *= 1.05; // Increasing every year by 5%

        }
        System.out.printf("The total tuition fee in ten years: $%.2f\n", tuitionFee);

        // Calculate total cost for 4 years after the 10th year
        for (int year = 1; year <= 4; year++) {
            totalTuition += tuitionFee;
            tuitionFee *= 1.05;
        }
        System.out.printf("The total cost for four years after the tenth year: $%.2f\n", totalTuition);
    }
}
