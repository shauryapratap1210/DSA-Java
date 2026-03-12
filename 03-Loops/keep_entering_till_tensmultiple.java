import java.util.*;
public class keep_entering_till_tensmultiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){

            int i=sc.nextInt();
            if(i%10==0){
                System.out.println("Sorry You entered Multiple of 10");
            }
        }
    }
}
