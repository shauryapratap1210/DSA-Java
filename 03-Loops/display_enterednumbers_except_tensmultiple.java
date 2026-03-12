import java.util.*;
public class display_enterednumbers_except_tensmultiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Enter Number");
            int i=sc.nextInt();
            if(i%10==0){
                continue;
            }
            System.out.println("Entered Number is : "+i);
        }
    }
}
