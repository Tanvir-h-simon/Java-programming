public class C05Q12 {
    public static void main(String[] args){

        int n = 1;

        while(n * n <= 12000){
            n++; // Increment n until n^3 exceeds or equals 12000
        }
        System.out.print("The smallest n such that n^2 > 12000 is: " + n);
    }
}