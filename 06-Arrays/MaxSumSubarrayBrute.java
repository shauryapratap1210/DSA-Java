public class MaxSumSubarrayBrute {
    public static void printSumSubarray(int arr[]){
        int currsum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){

            for(int j=i;j< arr.length;j++){
                currsum=0;

                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
                }
                System.out.println(currsum);

                if(MaxSum<currsum){
                    MaxSum=currsum;
                }

            }
        }
        System.out.println("Max Sum is : "+ MaxSum);
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        printSumSubarray(arr);
    }
}
