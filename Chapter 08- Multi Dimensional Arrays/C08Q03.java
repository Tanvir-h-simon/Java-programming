public class C08Q03 {
    public static void main(String[] args) {
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        int[] totalHours = new int[hours.length];

        for (int i = 0; i < hours.length; i++) {
            int sum = 0;
            for (int j = 0; j < hours[i].length; j++) {
                sum += hours[i][j];
            }
            totalHours[i] = sum;
        }

        int[] employeeIndex = new int[hours.length];
        for (int i = 0; i < employeeIndex.length; i++) {
            employeeIndex[i] = i;
        }

        for (int i = 0; i < totalHours.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < totalHours.length; j++) {
                if (totalHours[j] > totalHours[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap total hours
            int tempHours = totalHours[i];
            totalHours[i] = totalHours[maxIndex];
            totalHours[maxIndex] = tempHours;

            // Swap corresponding employee index
            int tempIndex = employeeIndex[i];
            employeeIndex[i] = employeeIndex[maxIndex];
            employeeIndex[maxIndex] = tempIndex;
        }

        System.out.println("Employee\tTotal Hours");
        for (int i = 0; i < totalHours.length; i++) {
            System.out.println("Employee " + employeeIndex[i] + "\t" + totalHours[i]);
        }
    }
}