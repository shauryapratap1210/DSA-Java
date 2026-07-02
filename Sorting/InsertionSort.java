public class InsertionSort {
    public static void Insertion_Sort(int arr[]){

        //T.C:O(n^2)
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=i;
            int prev=i-1;
            int currVal=arr[curr];
            while(prev>=0 &&arr[prev]>currVal){
                //Shifting
                arr[prev+1]=arr[prev];
                prev--;
            }

            //Khaali jagaah mei place krdo

            arr[prev+1]=currVal;


        }
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,6,7,8};
        Insertion_Sort(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
