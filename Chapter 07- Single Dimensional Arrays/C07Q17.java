import java.util.Scanner;

public class C07Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter student " + (i + 1) + "'s name: ");
            names[i] = input.next();
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter " + names[i] + "'s score: ");
            scores[i] = input.nextInt();
        }

/*
        // Sort names and scores in increasing order of scores
        for (int pass = 0; pass < scores.length - 1; pass++) {
            for (int i = 0; i < (scores.length - 1) - pass; i++) {
                if (scores[i] > scores[i + 1]) {
                    // Swap scores
                    int tempScore = scores[i];
                    scores[i] = scores[i + 1];
                    scores[i + 1] = tempScore;

                    // Swap names to keep them in sync with scores
                    String tempName = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = tempName;
                }
            }
        }
*/

        // Sort names and scores in decreasing order of scores
        for (int pass = 0; pass < scores.length - 1; pass++){
            for (int i = 0; i < (scores.length - 1) - pass; i++){
                if (scores[i] < scores[i + 1]){
                    // Swap Scores
                    int tempScores = scores[i];
                    scores[i] = scores[i + 1];
                    scores[i + 1] = tempScores;

                    // Swap names
                    String tempNames = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = tempNames;
                }
            }
        }

        System.out.println("\nStudents sorted by scores in increasing order:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(names[i] + " : " + scores[i]);
        }
    }
}