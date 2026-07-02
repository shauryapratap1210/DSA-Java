import java.util.HashMap;

public class MissingNumber {
    public static int FindNumber(int arr[]){

        /* BRUTE APPROACH O(n^2)
        for(int i=1;i<arr.length+1;i++){
            int flag=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;

         */

        /*Better Approach
        int n=arr.length+1;

        int hash[]=new int[n+1];  //Store frequency
        for(int i=0;i<n-1;i++){
            hash[arr[i]]++;
        }

        //Find number
        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                return i;

            }
        }
        return -1;*/

        /* Optimal solution 1 but not for large numbers as data will overflow
        int n=arr.length+1;
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
        }
        return sum1-sum2;

         */

        //OPTIMAL EVEN FOR LARGE NUMBERS
        /*int n=arr.length+1;
        int xor1=0;
        int xor2=0;

        for(int i=1;i<=n;i++){
            xor1^=i;
        }
        for(int i=0;i<arr.length;i++){
            xor2^=arr[i];

        }
        return xor1^xor2;

         */

        /*  Brute Force:O(n^2)
        for(int i=1;i< arr.length+1;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    count=1;
                    break;
                }
            }
            if(count==0){
                return i;
            }
        }

        return -1;

         */

       /*  Hash Map(O(n)
        HashMap<Integer,Integer>freq=new HashMap<>();

        int n=arr.length+1;
        for(int i=0;i<n-1;i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);


        }
        for(int i=1;i<=n;i++){
            if(!freq.containsKey(i)){
                return i;
            }
        }

        return -1;

        */

        /*  Better but not for large numbers
        int n=arr.length+1;


        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum2+=arr[i];
        }

        return sum1-sum2;

         */

        //Optimized approach

        int xor1=0;
        int xor2=0;
        int n=arr.length+1;
        for(int i=1;i<=n;i++){
            xor1^=i;
        }

        for(int i=0;i<n-1;i++){
            xor2^=arr[i];
        }

        return xor1^xor2;


    }



    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7};
        int num=FindNumber(arr);
        System.out.println(num);
    }
}
