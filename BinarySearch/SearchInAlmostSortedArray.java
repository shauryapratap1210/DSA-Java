package BinarySearch;

public class SearchInAlmostSortedArray {
    public static int findTarget(int arr[], int target) {
        // code here
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (mid + 1 < n && arr[mid + 1] == target) {
                return mid + 1;
            }
            if (mid - 1 >= 0 && arr[mid - 1] == target) {
                return mid - 1;
            }
            if (arr[mid] > target) {
                // end=mid-1;
                // Optimization
                end = mid - 2; // Because mid+1 already check hogya
            } else {
                // start=mid+1;
                // Optimization
                start = mid + 2; // Because mid-1 already check hogya
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 3, 40, 20, 50, 80, 70 };
        int target = 40;
        System.out.println(findTarget(arr, target));
    }
}