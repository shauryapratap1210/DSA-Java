import java.util.*;
public class sum_of_oddevenintegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choice : ");
        System.out.println("Enter 1 to start addition of integers");
        int choice=sc.nextInt();
        int num;
        int evensum=0;
        int oddsum=0;
        while(choice==1){
            System.out.println("Enter Number");
             num=sc.nextInt();
            if(num%2==0){
                evensum+=num;

            }
            else{
                oddsum+=num;
            }
            System.out.println("Enter 1 to readd or 0 to stop");
            choice=sc.nextInt();
        }
        System.out.println("Odd sum is + "+oddsum);
        System.out.println("Even sum is + "+evensum);
    }
}
