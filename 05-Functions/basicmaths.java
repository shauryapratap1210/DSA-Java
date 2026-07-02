public class basicmaths {
    static void print_digits(int n){
        while(n!=0){
            System.out.println(n%10);
            n/=10;
        }
    }

    static void count_digit(int n){
        int count=0;
        while(n!=0){
            int digit=n%10;
            count++;
            n/=10;

        }

        System.out.println("Number of digits in num is : "+count);
    }


    static void sumdigit(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println("Sum of digits is : "+sum);
    }

    static void reversenum(int n){
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=(rev*10)+digit;
            n/=10;
        }
        System.out.println("Reverse of the number is : "+rev);
    }

    static void check_palindrome(int n){
        int rev=0;
        int original=n;
        while(n!=0){
            int digit=n%10;
            rev=(rev*10)+digit;
            n/=10;
        }
        if(rev==original){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }

    }

    static void prime_num(int n){
        if(n==1){
            System.out.println("Not composite nor unique");
        }

        else if(n==2){
            System.out.println("prime Number");
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("Not prime");
                    break;

                }

            }

            System.out.println("It is a prime number");


        }
    }

    public static void main(String[] args) {
        print_digits(345);
        count_digit(345);
        sumdigit(345);
        reversenum(345);
        check_palindrome(345);
        check_palindrome(141);
        prime_num(8);
    }
}
