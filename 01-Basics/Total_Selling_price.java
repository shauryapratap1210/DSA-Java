import java.util.*;
public class Total_Selling_price {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost of Pencil");
        float pencil=sc.nextFloat();
        System.out.println("Enter cost of Pen");
        float pen=sc.nextFloat();
        System.out.println("Enter cost of Eraser");
        float eraser=sc.nextFloat();
        float $=((pencil+pen+eraser)*0.18f)+(pen+pencil+eraser);
        System.out.println("Total Price of items is : "+$);

    }
}
