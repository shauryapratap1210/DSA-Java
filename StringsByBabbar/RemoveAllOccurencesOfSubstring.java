package StringsByBabbar;

public class RemoveAllOccurencesOfSubstring {

    public String removeOccurrences(String s, String part) {
        // Brute Force:O(n)
        while (s.contains(part)) {
            // Jab tk part hai tb tk usko hata kr new string bnao

            int index = s.indexOf(part);
            // New String
            s = s.substring(0, index) + s.substring(index + part.length());
        }

        return s;

    }

    public static void main(String[] args) {
        RemoveAllOccurencesOfSubstring obj = new RemoveAllOccurencesOfSubstring();
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(obj.removeOccurrences(s, part));
    }
}