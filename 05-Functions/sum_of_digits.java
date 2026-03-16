public class sum_of_digits {
    public static int sum_of_digit(int n){
        int sum=0;
        while(n>=0){
            sum+=n%10;
            n/=10;

        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sum_of_digit(456));
    }
}
