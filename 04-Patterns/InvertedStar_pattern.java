import java.util.*;
public class InvertedStar_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lines=sc.nextInt();
        for(int i=1;i<=lines;i++){
            for(int star=1;star<=lines-i+1;star++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
