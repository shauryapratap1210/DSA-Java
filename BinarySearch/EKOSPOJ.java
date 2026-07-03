package BinarySearch;

public class EKOSPOJ {
    public static boolean isValid(int maxheight, int arr[], int m) {
        long totalwoodcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxheight) {
                long currentwoodcount = arr[i] - maxheight;
                totalwoodcount += currentwoodcount;
            }
        }

        if (totalwoodcount >= m) {
            return true;
        } else {
            return false;
        }
    }

    public static int maxHeight(int[] arr, int m) {
        // code here
        /*
         * Brute Force:O(m*n)
         * int start=0;
         * int max=0;
         * int ans=-1;
         * for(int i:arr){
         * max=Math.max(max,i);
         * }
         * 
         * for(int i=start;i<=max;i++){
         * if(isValid(i,arr,m)){
         * ans=i;
         * }
         * }
         * 
         * return ans;
         */

        // Optimized Approach
        int start = 0;
        int max = 0;
        for (int i : arr) {
            max = Math.max(max, i);
        }

        int end = max;

        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(mid, arr, m)) {
                // Potential ans hai iske left wale honge hi right dekh
                ans = mid;
                start = mid + 1;
            } else {
                // Potential ans nahi hai left mei dekh
                end = mid - 1;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int trees[] = { 4, 42, 40, 26, 46 };
        int m = 20;
        System.out.println(maxHeight(trees, m));
    }
}
