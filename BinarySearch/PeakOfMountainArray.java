package BinarySearch;

public class PeakOfMountainArray {
    public static int peak(int arr[]) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = 0;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {

                // Right part mei hain
                ans = mid;
                end = mid;
            } else {
                // Left part mei hain

                // Move karo right part mei
                start = mid + 1;
                ans = start;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 8, 7, 6, 4, 2, 1 };
        System.out.println(peak(arr));
    }
}
