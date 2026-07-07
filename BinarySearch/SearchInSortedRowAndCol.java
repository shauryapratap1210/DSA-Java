package BinarySearch;

public class SearchInSortedRowAndCol {
    public static boolean matSearch(int mat[][], int x) {
        // code here
        int totRow = mat.length;
        int totCol = mat[0].length;
        // int n=totRow*totCol;

        int row = 0;
        int col = totCol - 1;

        while (row < totRow && col >= 0) {
            if (mat[row][col] == x) {
                return true;
            } else if (mat[row][col] < x) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int x = 37;
        System.out.println(matSearch(mat, x));
    }
}