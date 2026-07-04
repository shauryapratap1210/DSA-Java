package BinarySearch;

public class RotiPrata {

    public static int minTime(int cooks[], int totalPrata, int totalcooks) {
        int start = 0;
        int maxRank = -1;

        for (int i = 0; i < cooks.length; i++) {
            if (maxRank < cooks[i]) {
                maxRank = cooks[i];
            }
        }
        int end = maxRank * (totalPrata * (totalPrata + 1)) / 2;

        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(cooks, totalPrata, totalcooks, mid)) {
                ans = mid;// Potential ans
                end = mid - 1;// Left mei search kro
            } else {
                start = mid + 1;// Ans nahi mila right dekho
            }
        }
        return ans;
    }

    public static boolean isValid(int cooks[], int totalPrata, int totalcooks, int minTime) {
        int totalpratacooked = 0;
        for (int i = 0; i < cooks.length; i++) {
            int currRank = cooks[i];
            int timetaken = 0;
            int rankmultiple = 1;

            // Paratha abhi bna nahi hai -->
            // Cook start kro

            while (timetaken <= minTime) {
                if (timetaken + currRank * rankmultiple <= minTime) {
                    totalpratacooked++;
                    timetaken = timetaken + (currRank * rankmultiple);
                    rankmultiple++;

                    // Ek Parathaa taiyaar

                } else {
                    // Parathaa nahi bnaa
                    break;
                }
            }
            if (totalpratacooked >= totalPrata) {
                // Task Completed
                return true;
            }
        }

        if (totalpratacooked >= totalPrata) {
            return true;
        } else {

            // Task Not Completed --> Sahi Time nahi hai
            return false;
        }
    }

    public static void main(String[] args) {
        int cooks[] = { 1, 2, 3, 4 };
        int totalPrata = 10;
        int totalcooks = 4;

        System.out.println("Minimum Time = " + minTime(cooks, totalPrata, totalcooks));
    }

}
