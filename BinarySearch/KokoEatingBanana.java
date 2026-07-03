package BinarySearch;

public class KokoEatingBanana {
    public static boolean isValid(int mid, int arr[], int h) {
        int hourstaken = 0;
        for (int i = 0; i < arr.length; i++) {
            int hours = arr[i] / mid;
            if (arr[i] % mid != 0) {
                hours++;
            }
            hourstaken += hours;
            if (hourstaken > h) {
                return false;
            }
        }
        return true;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int max = 0;
        for (int i : piles) {
            max = Math.max(max, i);
        }

        int end = max;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(mid, piles, h)) {
                // Potential Ans
                ans = mid;
                // Ab tohra sa left mei dekho
                end = mid - 1;
            } else {
                // Ans nahi hai right mei dekho
                start = mid + 1;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int piles[] = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
}
