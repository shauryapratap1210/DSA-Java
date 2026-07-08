package BinarySearch;

public class RowWithMaximumOnes {
    public static int getFirstOccurence(int arr[][], int rowindex) {
        int totrow = arr.length;
        int totcol = arr[0].length;
        int target = 1;
        int ans = -1;

        // Zero ones wali row
        if (arr[rowindex][totcol - 1] == 0) {
            return totcol;
        }

        else {
            int s = 0;
            int e = totcol - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[rowindex][mid] == 1) {
                    ans = mid;
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }

        return ans;
    }

    public static int[] rowAndMaximumOnes(int[][] mat) {
        // BRUTE FORCE:O(n^2)
        // int maxrow = 0;
        // int maxcount = 0;
        // for (int i = 0; i < mat.length; i++) {
        // int onescount = 0;
        // for (int j = 0; j < mat[0].length; j++) {

        // if (mat[i][j] == 1) {
        // onescount++;
        // }
        // }
        // if (onescount > maxcount) {
        // maxrow = i;
        // maxcount = onescount;
        // }
        // }

        // return new int[] { maxrow, maxcount };

        int totrow = mat.length;
        int totcol = mat[0].length;
        int maxrow = -1;
        int maxcount = -1;

        for (int row = 0; row < totrow; row++) {
            int firstoccurence = getFirstOccurence(mat, row);
            int onescount = totcol - firstoccurence;
            if (onescount != 0 && onescount > maxcount) {
                maxcount = onescount;
                maxrow = row;
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