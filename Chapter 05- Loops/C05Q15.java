public class C05Q15 {
    public static void main(String[] args){

        int count = 0;

        // Loop through ASCII values from '!' (33) to '~' (126)
        for (char ch = '!'; ch <= '~'; ch++){
            System.out.print(ch + " ");
            count++;

            // Print a newline after every 10 characters
            if (count % 10 == 0) {
                System.out.println();
            }
        }

    }
}
