import java.util.*;
public class switch_statement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Option");
        int option=sc.nextInt();
        switch(option){
            case 1:
                System.out.println("Option 1 is selected");
                break;
            case 2:
                System.out.println("Option 2 is selected ");
                break;
            case 3:
                System.out.println("Option 3 is selected ");
                break;
            default:
                System.out.println("Wrong option selected");
        }
    }
}
