import java.util.*;
public class print_one_to_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number till which you want to print:");
        int n=sc.nextInt();
        int counter=1;
        while(counter<=n){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
