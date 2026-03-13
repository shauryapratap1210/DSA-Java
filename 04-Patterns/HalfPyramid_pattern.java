import java.util.*;
public class HalfPyramid_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int line=1;line<=num;line++){
            for(int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }

    }
}
