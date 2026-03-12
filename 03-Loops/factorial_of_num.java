import java.util.*;
public class factorial_of_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int n=sc.nextInt();
        int count=n;
        while(count>0){
            fact=fact*count;
            count--;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
