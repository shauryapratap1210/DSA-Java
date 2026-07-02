
import java.util.*;

public class MissingInArrayDuplicates {
    public static ArrayList<Integer> findMissing(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        // Marking
        for (int i = 0; i < n; i++) {
            int value = Math.abs(arr[i]);
            int pos = value - 1;

            // mark karo
            if (arr[pos] > 0) {
                arr[pos] = -arr[pos];
            }

        }

        // traverse krke ans return krwao
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 4, 5, 2, 2 };
        List<Integer> ans = new ArrayList<>();
        ans = findMissing(arr);
        System.out.println(ans);
    }
}
