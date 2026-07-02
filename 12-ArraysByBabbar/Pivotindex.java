public class Pivotindex {
    public static int pivot(int arr[]){
        int  n=arr.length;
        /* Brute force:O(n^2)

        for(int i=0;i<n;i++){
            int num=arr[i];
            int leftSum=0;
            int RightSum=0;
            for(int j=i+1;j<n;j++){
                RightSum+=arr[j];
            }
            for(int k=i-1;k>=0;k--){
                leftSum+=arr[k];
            }

            if(leftSum==RightSum){
                return i;
            }
        }

        return -1;*/


        int leftSum[]=new int[n];
        int rightSum[]=new int[n];

        leftSum[0]=arr[0];
        rightSum[n-1]=arr[n-1];

        //for left sum
        for(int i=1;i<n;i++){
            leftSum[i]=leftSum[i-1]+arr[i];
        }

        //RIght sum
        for(int i=n-2;i>=0;i--){
            rightSum[i]=rightSum[i+1]+arr[i];
        }

        for(int i=0;i<n;i++){
            if(leftSum[i]==rightSum[i]){
                return i;
            }
        }

        return -1;



    }

    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
        int ans=pivot(arr);
        System.out.println(ans);
    }
}
