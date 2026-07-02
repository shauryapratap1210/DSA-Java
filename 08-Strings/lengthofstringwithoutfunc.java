
public class lengthofstringwithoutfunc {
    public static void lengthstr(String s){
        char c[]=s.toCharArray();
        int count=0;
        for(char co:c){
            count++;
        }

        System.out.println("length of string is : "+count);
    }

    public static void vowel(String s){
        int vowels=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            }

        }
        System.out.println("Vowels in string are : "+vowels);
    }

    public static String reverseStr(String s){
        int len=s.length()-1;
        String rev="";
        for(int i=len;i>=0;i--){
            char ch=s.charAt(i);
            rev=rev+ch;
        }
       return rev;
    }

    public static void palindrome(String s){
        String rev=reverseStr(s);
        if(rev.equals(s)){
            System.out.println("Palindrome string");
        }
        else{
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        String sh="baab";
        lengthstr(sh);
        vowel(sh);
        reverseStr(sh);
        palindrome(sh);
    }

}
