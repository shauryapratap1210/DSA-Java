import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter Second Number");
        int b=sc.nextInt();
        System.out.println("Enter Operator");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("Sum is "+(a+b));
                break;
            case '-':
                System.out.println("Difference is "+(a-b));
                break;
            case '*':
                System.out.println("Product is "+(a*b));
                break;
            default :
                System.out.println("Wrong operator selected");
        }
    }
}
