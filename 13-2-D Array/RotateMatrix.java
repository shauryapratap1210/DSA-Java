
public class RotateMatrix {
    public static void transpose(int arr[][], int N) {

        // Transpose In place
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < N; i++) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, {
                4, 5, 6 },
                { 7, 8, 9 }
        };
        transpose(arr, 3);

        // Print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
