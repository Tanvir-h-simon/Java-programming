public class RandomPoint {
    public static void main(String[] args) {

        // Generate random x-coordinate between -50 and 50
        int x = (int) (-50 + (Math.random() * ((50 - (-50)) + 1)));
        // Generate random y-coordinate between -100 and 100
        int y = (int) (-100 + Math.random() * (100 - (-100) + 1));

        System.out.println("Random point in the rectangle: (" + x + ", " + y + ")");
    }
}