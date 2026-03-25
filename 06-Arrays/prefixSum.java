public class prefixSum {
    public static void prefixSum(int arr[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){
                currsum=0;
                if(i==0){
                    currsum=prefix[j];
                }
                else{
                    currsum=prefix[j]-prefix[i-1];
                }
                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }
        }
        System.out.println("Max Sum is : "+maxSum);
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        prefixSum(arr);
    }
}
