public class prime_in_range {
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void print_prime(int n){
        for(int i=2;i<=n;i++){

            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        print_prime(11);
    }
}
