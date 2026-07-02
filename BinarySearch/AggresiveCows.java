package BinarySearch;

import java.util.Arrays;

public class AggresiveCows {

    public static boolean isValid(int minDistance, int arr[], int k) {
        int cowcount = 1;
        int pos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[pos] >= minDistance) {
                cowcount++;
                pos = i;
                if (cowcount == k) {
                    // All cows are placed
                    return true;
                }
            }
        }
        return false; // All cows placed nahi ho payega
    }

    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int s = 0;
        int e = stalls[n - 1] - stalls[0];
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValid(mid, stalls, k)) {
                // Answer ho skta
                // Store karo and right dekho
                ans = mid;
                s = mid + 1;
            } else {
                // Answer nahi mila right dekho
                e = mid - 1;
            }
        }
        return ans;

        /*
         * Brute Force :O(N*(N*ans)) =O(N^2*ans)
         * int n=stalls.length;
         * int s=1;
         * int e=stalls[n-1]-stalls[0];
         * int ans=0;
         * for(int minDistance=s;minDistance<=e;minDistance++){
         * if(isValid(minDistance,stalls,k)){
         * ans=minDistance;
         * }
         * }
         * 
         * return ans;
         */
    }

    public static void main(String[] args) {
        int stalls[] = { 1, 2, 8, 4, 9 };
        System.out.println(aggressiveCows(stalls, 3));
    }
}
