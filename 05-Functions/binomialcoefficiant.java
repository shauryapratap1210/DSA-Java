public class binomialcoefficiant {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        return fact;
    }
    public static int binomial_coefficient(int n ,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int z_fact=factorial(n-r);
        int BC=n_fact/(r_fact*z_fact);
        return BC;
    }

    public static void main(String[] args) {
        int b=binomial_coefficient(9,7);
        System.out.println("binomial coefficient is : " +b);
    }
}
