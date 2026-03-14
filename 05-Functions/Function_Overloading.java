public class Function_Overloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b ,int c){
        return a+b+c;
    }


    //public static float sum(int a ,int b)  "This is giving error because overloading doesnt depends upon function return type"

    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(3.2f,5.8f));
    }
}
