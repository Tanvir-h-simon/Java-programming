public class C07Q13 {
    public static void main(String[] args){

        // Call the method with excluded numbers
        int result = getRandom(3, 8, 15);
        System.out.println("Random number: " + result);
    }

    // Use int... for variable arguments to allow passing multiple excluded numbers
    public static int getRandom(int... numbers){

        while (true){
            int randomNumber = (int) (1 + Math.random() * (54 - 1 + 1));
            boolean isExcluded = false;

            // Check if the random number is in the excluded list
            for (int num: numbers){
                if (randomNumber == num){
                    isExcluded = true;
                    break;
                }
            }

            // If it's not excluded, return it
            if (!isExcluded){
                return randomNumber;
            }
        }
    }
}