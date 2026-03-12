import java.util.*;
public class sum_of_natural_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number till which you need sum");
        int n=sc.nextInt();
        int sum=0;
        int counter=0;
        while(counter<=n){
            sum+=counter;
            counter++;
        }
        System.out.println("Sum of natural numbers till "+n+" is :"+sum);

    }
}
