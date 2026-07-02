package BinarySearch;

public class Minimum_In_RotatedSortedArray {
    public static int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = 0;
        if (nums[start] <= nums[end]) {
            // Sorted hain rotated ni
            return nums[ans];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= nums[n - 1]) {
                // l2 mei hain
                // ho skta
                ans = mid;
                end = mid - 1; // Possible par aur left mei search kro
            } else {
                // l1 mei ans nahi hoyega
                start = mid + 1;
            }
        }

        return nums[ans];

    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        System.out.println(findMin(arr));
    }
}
