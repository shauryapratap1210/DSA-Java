
package BinarySearch;

/**
 * CapacityShip
 */
public class CapacityShip {

    public static boolean isValid(int capacity, int arr[], int days) {
        int daycount = 1;
        int capacityholded = 0;
        for (int i = 0; i < arr.length; i++) {
            if (capacityholded + arr[i] <= capacity) {
                capacityholded += arr[i];
            } else {
                daycount++;
                if (daycount > days || arr[i] > capacity) {
                    return false;
                } else {
                    capacityholded = 0;
                    capacityholded += arr[i];
                }
            }
        }
        return true;
    }

    public static int shipWithinDays(int[] weights, int days) {
        /*
         * int max=0;
         * int sum=0;
         * 
         * for(int i=0;i<weights.length;i++){
         * max=Math.max(weights[i],max);
         * sum+=weights[i];
         * }
         * 
         * for(int maxcapacity=max;maxcapacity<=sum;maxcapacity++){
         * if(isValid(maxcapacity,weights,days)){
         * return maxcapacity;
         * }
         * }
         * return -1;
         */

        int start = 1;
        int sum = 0;
        for (int x : weights) {
            sum += x;

        }
        int end = sum;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(mid, weights, days)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int weights[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;

        System.out.println(shipWithinDays(weights, days));

    }
}