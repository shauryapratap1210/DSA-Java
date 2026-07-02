public class DutchNationalFlag {
    public static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void SortColors(int arr[]) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        while (mid <= end) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, start, mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, end);
                    end--;
                    break;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };
        SortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
