package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIndicesInSortedArray {

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                ans.add(i);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 2, 3 };
        FindIndicesInSortedArray sol = new FindIndicesInSortedArray();
        System.out.println(sol.targetIndices(arr, 2));
    }
}