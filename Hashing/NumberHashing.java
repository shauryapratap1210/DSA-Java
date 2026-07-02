import java.util.Scanner;

public class NumberHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of elements");
        //Array Initialization
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        //Pre compute
        int hash[]=new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        //Fetching
        System.out.println("Enter number of element to search");
        int q=sc.nextInt();

        while(q-- !=0){

            int number=sc.nextInt();
            System.out.println(hash[number]);
        }

    }
}
