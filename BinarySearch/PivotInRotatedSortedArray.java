package BinarySearch;

public class PivotInRotatedSortedArray {
    public static int findPivot(int arr[]) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        if (arr[start] < arr[end]) {
            return ans;
            // No effective Rotation
        }

        // Binary Search
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= arr[n - 1]) {
                // element is in L2
                // Potential ans nahi milega neglect kro

                end = mid - 1;

            } else {
                // element hai aapka L1 mei
                // Potential ans milega
                ans = mid;
                start = mid + 1; // Potential ans store karne ke baad aur search kro
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 0, 1, 2, 4 };
        System.out.println("Pivot index is :" + findPivot(arr));
    }

}
