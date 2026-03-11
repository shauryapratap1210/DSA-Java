import java.util.*;
public class largest_of_twonumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("A is Greater than B");
        }
        else if (a==b){
            System.out.println("Both the numbers are equal");
        }
        else{
            System.out.println("B is Greater than A");
        }
    }
}
