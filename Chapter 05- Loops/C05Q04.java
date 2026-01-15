public class C05Q04 {
    public static void main(String[] args){
        System.out.println("Miles\tKilograms");

        for (int miles = 1; miles <= 10; miles++){
            double kilometers = miles / 1.609;
            System.out.printf("%-5d\t%.3f\n", miles, kilometers);
        }
    }
}
