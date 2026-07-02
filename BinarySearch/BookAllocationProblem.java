package BinarySearch;

public class BookAllocationProblem {

    public static boolean isValid(int arr[], int maxpages, int k) {
        int student = 1;
        int pagesHold = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pagesHold + arr[i] <= maxpages) {
                pagesHold += arr[i];
                // hold Kar pa rhe ho

            } else {
                student++;
                pagesHold = arr[i];
                if (student > k || arr[i] > maxpages) {
                    return false;
                    // Bacche limit se bahar
                } else {
                    // Assign krdo
                    pagesHold = 0;
                    pagesHold += arr[i];

                }
            }
        }

        return true;
    }

    public static int findPages(int[] arr, int k) {
        // code here
        if (k > arr.length) {
            // Matlab Students jyaada book ni milegi sbko
            return -1;
        }

        /*
         * Brute Force:O(max-->sum)*n
         * int max = 0;
         * int sum = 0;
         * 
         * for (int i = 0; i < arr.length; i++) {
         * max = Math.max(arr[i], max);
         * sum += arr[i];
         * }
         * 
         * for (int maxpages = max; maxpages <= sum; maxpages++) {
         * if (isValid(arr, maxpages, k)) {
         * return maxpages;
         * }
         * }
         * 
         * return -1;
         */

        // Binary Search:O(logn)
        int start = 1;
        int sum = 0;
        for (int x : arr) {
            sum += x;

        }

        int end = sum;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(arr, mid, k)) {
                ans = mid;
                end = mid - 1;

            } else {
                // Right mei dekho
                start = mid + 1;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 67, 90 };
        System.out.println(findPages(arr, 2));
    }

}
