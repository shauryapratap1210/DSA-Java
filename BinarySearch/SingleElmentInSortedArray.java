package BinarySearch;

public class SingleElmentInSortedArray {
    public static int singleNonDuplicate(int[] arr) {
        /*
         * BRUTE FORCE
         * int n=arr.length;
         * int ans=arr[0];
         * for(int i=1;i<=n-1;i++){
         * if(arr[i]!=arr[i-1]&& arr[i]!=arr[i+1]){
         * ans=arr[i];
         * }
         * }
         * 
         * return ans;
         */

        int n = arr.length;

        int start = 0;
        int end = n - 1;
        // int ans=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Single element in the array
            if (start == end) {
                return arr[start];
            }

            // Multiple elements in the array
            int currVal = arr[mid];

            int prevVal = -1;
            if (mid - 1 >= 0) {
                prevVal = arr[mid - 1];
            }

            int nextVal = -1;
            if (mid + 1 < n) {
                nextVal = arr[mid + 1];
            }

            // Ab Conditions check kro
            if (currVal != prevVal && currVal != nextVal) {
                return currVal;
            }

            // Ab kaha move krna hai ans nahi milne pr wo wali conditions
            if (currVal == prevVal && currVal != nextVal) {
                int endIndex = mid;
                if (endIndex % 2 == 0) {
                    // Even hai matlab right mei ho ans ke
                    // Left move kr
                    end = mid - 1;
                } else {
                    // Odd hai matlab left mei ho ans ke
                    // Right mei move kro
                    start = mid + 1;
                }
            }
            if (currVal != prevVal && currVal == nextVal) {
                int startIndex = mid;
                if (startIndex % 2 == 0) {
                    // matlab even hai left mei ho array ke ans right mei hai
                    // Right mei chlo
                    start = mid + 1;
                } else {
                    // odd hai startIndex right mei ho ans ke
                    // left mei chlo
                    end = mid - 1;
                }
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(arr));
    }
}
