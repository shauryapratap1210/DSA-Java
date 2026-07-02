import java.util.*;
public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();


        //Hashing
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }

        //Fetching
        System.out.println("Enter number of char to search");
        int q=sc.nextInt();
        while(q-- !=0){
            char c=sc.next().charAt(0);
            System.out.println(hash[c-'a']);
        }
    }
}
