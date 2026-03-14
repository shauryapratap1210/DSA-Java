public class Call_by_value {
    public static void change(int a){
        a=10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a=5;
        change(a);
        System.out.println(a);
    }
}

