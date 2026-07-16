package StringsByBabbar;

public class RemoveDuplicateAdjacentSubstring {
    public static String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            // Agar same character ho toh
            // And check if ans mei characte hai ya ni
            if (ans.length() > 0 && s.charAt(i) == ans.charAt(ans.length() - 1)) {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                // Na ho toh append
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();

    }

    public static void main(String[] args) {
        String s = "abbaca";
        String ans = removeDuplicates(s);
        System.out.println(ans);

    }
}