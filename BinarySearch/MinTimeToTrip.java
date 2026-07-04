package BinarySearch;

class MinTimeToTrip {
    public static boolean isValid(long mintime, int time[], int totaltrips) {
        long tripsCompleted = 0;
        for (int i = 0; i < time.length; i++) {
            if (time[i] <= mintime) {
                // Trip hogyi
                tripsCompleted += mintime / time[i];
                if (tripsCompleted >= totaltrips) {
                    // Task hogya
                    return true;
                }
            }
        }
        return false; // nahi ho paya task
    }

    public static long minimumTime(int[] time, int totalTrips) {

        long start = 1; // 1 trip--->1 unit of time
        long fastest = time[0];

        for (int i = 0; i < time.length; i++) {
            if (fastest > time[i]) {
                fastest = time[i];
            }
        }

        long end = fastest * totalTrips;
        long ans = -1;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isValid(mid, time, totalTrips)) {
                ans = mid;// Potential ans hai
                end = mid - 1;// Ab aur potential ans dekho aur left mei dekho
            } else {
                // Ans nahi ho skta left mei right mei chlo
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int time[] = { 1, 2, 3 };
        int totalTrips = 5;
        System.out.println("Minimum Time = " + minimumTime(time, totalTrips));
    }
}
