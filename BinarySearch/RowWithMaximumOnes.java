package BinarySearch;

public class RowWithMaximumOnes {
    public static int[] rowAndMaximumOnes(int[][] mat) {
        // BRUTE FORCE:O(n^2)
        int maxrow = 0;
        int maxcount = 0;
        for (int i = 0; i < mat.length; i++) {
            int onescount = 0;
            for (int j = 0; j < mat[0].length; j++) {

                if (mat[i][j] == 1) {
                    onescount++;
                }
            }
            if (onescount > maxcount) {
                maxrow = i;
                maxcount = onescount;
            }
        }

        return new int[] { maxrow, maxcount };

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 0 },
                { 0, 0, 1, 1 }
        };
        int[] result = rowAndMaximumOnes(matrix);
        System.out.println("Row with maximum ones: " + result[0]);
        System.out.println("Maximum number of ones: " + result[1]);

    }
}