import java.util.*;
public class BitwiseQuestions {
   public static void checkOddEven(int n){
        if((n&1)==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }

    public static void multiply(int n){
       n=n<<1;
        System.out.println(n);
    }

    public static void divide(int n){
        n=n>>1;
        System.out.println(n);
    }

    public static void countbit(int n){
       int count=0;
       while(n!=0){
           if((n&1)==1){
               count++;
           }
           n>>=1;
       }
        System.out.println("Totals bits are : "+count);
    }

    public static void Powerof2(int n){
       if((n & (n-1))==0){
           System.out.println("Power of 2");
       }
       else{
           System.out.println("Not power of 2");
       }
    }

       public static void swap(int a,int b){
            System.out.println("Value of a: "+a);
            System.out.println("Value of b: "+b);
           a=a^b;
           b=a^b;
           a=a^b;
            System.out.println("Value of a: "+a);
            System.out.println("Value of b: "+b);
        }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        checkOddEven(n);     //Checks odd even
        multiply(n);    //Multiplies by 2
        divide(n);      //Divides by 2
        countbit(n);
        Powerof2(n);
        swap(45,26);


    }
}
