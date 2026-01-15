public class C05Q19{
    public static void main(String[] args){

        int rows = 8;

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= (rows-i) * 4; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.printf("%4d", (int)Math.pow(2, k));
            }
            for (int l = i - 2; l >= 0; l--){
                System.out.printf("%4d", (int)Math.pow(2, l));
            }
            System.out.println();
        }
    }
}