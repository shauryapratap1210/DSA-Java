package BinarySearch;

public class ValidPerfectNum {
    public static boolean isPerfectSquare(int num) {
        // O(logn)
        int start = 1;
        int end = num;

        if (num == 0) {
            return true;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == num / mid && num % mid == 0) {
                return true;
            } else if (mid > num / mid) {
                // Lft mei search kro
                end = mid - 1;
            } else {
                // Right mei dekho
                start = mid + 1;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));

    }
}
