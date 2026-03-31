public class RotateRight {
    public static int[] ReverseArr(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static int[] RotateR(int arr[],int k){
        int n=arr.length;
        k=k%n;
        if(n==0||k==0){
            return arr;
        }

        /* BRUTE FORCE APPROACH
        // Storing
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i+(n-k)];
        }

        //Shifting

        for(int i=n-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }

        //Putting back
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
        return arr;
        */

        ReverseArr(arr,0,k);
        ReverseArr(arr,0,n-1);
        ReverseArr(arr,0,k-1);

        return arr;


    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int newarr[]=RotateR(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
