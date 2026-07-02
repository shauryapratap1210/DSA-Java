package BinarySearch;

public class Search_Element_in_RotatedSortedArray {

    public static int PivotIndex(int arr[]) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        if (arr[start] < arr[end]) {
            return ans;

            // already Sorted not rotated
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= arr[n - 1]) {
                // L2 mei ho not answer so neglect kro
                end = mid - 1;

            } else {
                // L1 mei ho ans ho skta
                ans = mid;
                start = mid + 1;
            }
        }

        return ans;
    }

    public static int BinarySearch(int start, int end, int arr[], int target) {
        int n = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int search(int[] nums, int target) {

        int n = nums.length;
        int pivot = PivotIndex(nums);
        int start1 = 0;
        int end1 = pivot;
        int start2 = pivot + 1;
        int end2 = n - 1;

        if (pivot == -1) {
            // Not rotated
            int ans = BinarySearch(start1, end2, nums, target);
            return ans;
        } else {
            // Rotated Sorted Array L1 ya L2

            if (target >= nums[start1] && target <= nums[end1]) {
                int ans = BinarySearch(start1, end1, nums, target);
                return ans;
                // l1 mei ho tab
            }

            else if (target >= nums[start2] && target <= nums[end2]) {
                int ans = BinarySearch(start2, end2, nums, target);
                return ans;
                // l2 mei ho tab

            }
        }

        return -1;
        // Jab na mile

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target));
    }
}
