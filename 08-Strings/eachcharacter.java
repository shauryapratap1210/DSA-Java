import java.util.*;
public class eachcharacter {
    public static void main(String[] args) {
        System.out.println("enter String");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            System.out.println("Character aṭ + " +i+" th index is : "+s.charAt(i));
        }

    }
}
