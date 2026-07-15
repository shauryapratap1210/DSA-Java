package StringsByBabbar;

public class PermutationsOfString {
    public static boolean compareFirst(int count1[], int count2[]) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
        // Basic Size check
        if (s1.length() > s2.length()) {
            return false;
        }
        // s1 ki frequency table
        int count1[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            int index = c1 - 'a';
            count1[index]++;
        }

        // s2 ki first window ki frequency table
        int i = 0;
        int windowLength = s1.length();
        int count2[] = new int[26];
        for (i = 0; i < windowLength; i++) {
            char c2 = s2.charAt(i);
            int index = c2 - 'a';
            count2[index]++;
        }

        // Compare both Frequency Table
        if (compareFirst(count1, count2) == true) {
            return true;
        } else {
            // Baaki window process kro
            while (i < s2.length()) {
                // New Char add
                char newChar = s2.charAt(i);
                int newCharIndex = newChar - 'a';
                count2[newCharIndex]++;
                // old char delete
                int oldCharIndex = i - windowLength;
                char oldChar = s2.charAt(oldCharIndex);
                int frequencyIndex = oldChar - 'a';
                count2[frequencyIndex]--;
                // compare

                if (compareFirst(count1, count2) == true) {
                    return true;
                }
                i++;
            }

        }

        return false;

    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));

    }
}
