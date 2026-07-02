public class MaxSumSub {
    public static void maxsumsub(int arr[]){
        int currsum=0;
        int maxsum= Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
                }

                System.out.println("Current sum of array is :"+currsum);
                if(currsum>maxsum){
                    maxsum=currsum;
                }

            }
        }
        System.out.println("Maxsum is : "+maxsum);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        maxsumsub(arr);
    }
}
