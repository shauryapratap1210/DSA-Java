package BinarySearch;

public class LowerBound {
    public static int lowerbound(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 30, 40, 45, 60, 70 };
        int ans = lowerbound(arr, 30);
        System.out.println(ans);
    }
}
