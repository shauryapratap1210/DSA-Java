package StringsByBabbar;

public class ReverseWordsOfString {
    public static String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            // Skip extra spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0)
                break;

            // End of current word
            int j = i;

            // Move to start of current word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Append current word
            ans.append(s.substring(i + 1, j + 1));

            // Add space only if there are more words left
            if (i > 0) {
                ans.append(' ');
            }
        }

        return ans.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
