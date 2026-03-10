public class LogicalOperators {
    public static void main(String[] args) {
        int a=10;
        int b =5;
        int c=0;
        System.out.println((a>b) && (b>c)); //Logical AND
        System.out.println((a>b) || (b<c)); //Logical OR
        System.out.println(!(a>b));  //Logical NOT
    }
}
