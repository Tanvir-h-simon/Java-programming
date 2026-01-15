public class C05Q13 {
    public static void main(String[] args){

        int n = 1;

        while (n * n * n <= 12000){
            n++; // Increment n until n^3 exceeds or equals 12000
        }
        n--; // After exiting the loop, n is one step too far, so subtract 1
        System.out.print("The largest n such that n^3 < 12000 is: " + n);
    }
}