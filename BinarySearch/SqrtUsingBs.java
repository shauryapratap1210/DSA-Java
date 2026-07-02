package BinarySearch;

class Solution {
    public static double mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = -1;
        if (x == 0) {
            return 0;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                // Ans will be in left part
                end = mid - 1;
            } else {
                // Ans in right part
                ans = mid;

                start = mid + 1;// Look in right for more potential ans
            }
        }

        double factor = 1;
        int precision = 3;
        for (int round = 1; round <= precision; round++) {
            factor = factor / 10;
            for (int j = 1; j <= 10; j++) {
                double newans = ans + factor;

                if (newans * newans == x) {
                    return newans;
                } else if (newans * newans > x) {
                    break;
                } else {
                    return newans;
                }
            }

        }
        return (double) ans;

    }

    public static void main(String[] args) {
        System.out.println(mySqrt(56));
    }

}
