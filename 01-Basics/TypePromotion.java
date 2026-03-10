public class TypePromotion {
    public static void main(String[] args) {
        int a=25;
       /* short b=50;
        char c='c';
        System.out.println(a+b+c);*/
        long b=55;
        float c=25.12f;
        double d=60.34;
        int sum=(int) (a+b+c+d);
        System.out.println(sum);

    }
}
