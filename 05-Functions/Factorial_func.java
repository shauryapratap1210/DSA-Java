public class Factorial_func {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        int factorial =fact(4);
        System.out.println("Factorial of number is : "+factorial);
    }
}
