import java.util.*;
public class average_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int n1=sc.nextInt();
        System.out.println("Enter Second Number");
        int n2=sc.nextInt();
        System.out.println("Enter Third Number");
        int n3=sc.nextInt();
        int avg=((n1+n2+n3)/3);
        System.out.println("Average of three numbers is : "+avg);
    }
}
