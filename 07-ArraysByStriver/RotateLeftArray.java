public class RotateLeftArray {

    public static int [] ReverseArray(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static int[] Rotate(int arr[],int k){
        /* BRUTE FORCE
        int temp[]=new int[k];
        //Storing numbers to rotate

        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        //Shifting
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }

        //Putting back
        for(int i=arr.length-k;i<arr.length;i++){
            arr[i]=temp[i-(arr.length-k)];
        }
        return arr; */

        int n=arr.length;

        k=k%n;
        if(n==0||k==0){
            return arr;
        }
        else {
            ReverseArray(arr,0,k-1);
            ReverseArray(arr,k,n-1);
            ReverseArray(arr,0,n-1);
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int newarray[]=Rotate(arr,3);
        for(int i=0;i< newarray.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
