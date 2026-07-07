package BinarySearch;

class SearchIn2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // if (matrix[i][j] == target) {
        // return true;
        // }
        // }
        // }

        // return false;

        // Binary Search
        int totRow = matrix.length;
        int totCol = matrix[0].length;

        // 1D Array
        int n = totRow * totCol;
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int row = mid / totCol;
            int col = mid % totCol;

            if (matrix[row][col] == target) {
                return true;
            }

            else if (matrix[row][col] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}